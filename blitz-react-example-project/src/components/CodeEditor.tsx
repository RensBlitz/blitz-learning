import React, { useState, useEffect } from 'react';
import Editor from '@monaco-editor/react';
import './CodeEditor.css';

interface CodeEditorProps {
  initialCode: string;
  language?: string;
  onChange?: (code: string) => void;
  readOnly?: boolean;
}

const CodeEditor: React.FC<CodeEditorProps> = ({ 
  initialCode, 
  language = 'javascript', 
  onChange,
  readOnly = false 
}) => {
  const [code, setCode] = useState(initialCode);

  useEffect(() => {
    setCode(initialCode);
  }, [initialCode]);

  const handleEditorChange = (value: string | undefined) => {
    if (value !== undefined) {
      setCode(value);
      onChange?.(value);
    }
  };

  return (
    <div className="code-editor">
      <Editor
        height="100%"
        language={language}
        value={code}
        onChange={handleEditorChange}
        theme="vs-light"
        options={{
          minimap: { enabled: false },
          fontSize: 14,
          lineNumbers: 'on',
          roundedSelection: false,
          scrollBeyondLastLine: false,
          readOnly,
          automaticLayout: true,
          tabSize: 2,
          insertSpaces: true,
          wordWrap: 'on',
          folding: false,
          lineDecorationsWidth: 20,
          lineNumbersMinChars: 3,
          glyphMargin: false,
        }}
      />
    </div>
  );
};

export default CodeEditor;