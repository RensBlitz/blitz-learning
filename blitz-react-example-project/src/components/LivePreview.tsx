import React, { useState, useEffect, useMemo } from 'react';
import * as Babel from '@babel/standalone';
import './LivePreview.css';

interface LivePreviewProps {
  code: string;
  showError?: boolean;
}

const LivePreview: React.FC<LivePreviewProps> = ({ code, showError = true }) => {
  const [error, setError] = useState<string | null>(null);
  const [Component, setComponent] = useState<React.ComponentType | null>(null);

  const transformedCode = useMemo(() => {
    try {
      const result = Babel.transform(code, {
        presets: ['react', 'env'],
        plugins: ['proposal-class-properties']
      });
      return result.code;
    } catch (err) {
      setError(`Transform Error: ${(err as Error).message}`);
      return null;
    }
  }, [code]);

  useEffect(() => {
    if (!transformedCode) return;

    try {
      setError(null);
      
      const exports = {};
      const module = { exports };
      const require = (name: string): any => {
        if (name === 'react') return React;
        if (name === 'react-dom') return require('react-dom');
        throw new Error(`Module ${name} not found`);
      };

      const func = new Function('React', 'exports', 'module', 'require', transformedCode);
      func(React, exports, module, require);

      const ExportedComponent = (module.exports as any).default || module.exports;
      
      if (React.isValidElement(ExportedComponent) || typeof ExportedComponent === 'function') {
        setComponent(() => ExportedComponent);
      } else {
        setError('No valid React component found in code');
      }
    } catch (err) {
      setError(`Runtime Error: ${(err as Error).message}`);
      setComponent(null);
    }
  }, [transformedCode]);

  if (error && showError) {
    return (
      <div className="preview-error">
        <h4>Error:</h4>
        <pre>{error}</pre>
      </div>
    );
  }

  if (!Component) {
    return (
      <div className="preview-loading">
        <p>Loading preview...</p>
      </div>
    );
  }

  try {
    return (
      <div className="preview-content">
        {React.isValidElement(Component) ? Component : <Component />}
      </div>
    );
  } catch (err) {
    return (
      <div className="preview-error">
        <h4>Render Error:</h4>
        <pre>{(err as Error).message}</pre>
      </div>
    );
  }
};

export default LivePreview;