import React from 'react';

const CustomHooks: React.FC = () => {
  return (
    <div className="lesson-container">
      <header style={{ marginBottom: '40px' }}>
        <h1>🎣 Custom Hooks</h1>
        <p style={{ fontSize: '1.2rem', color: '#666' }}>
          Learn how to create reusable stateful logic with custom hooks
        </p>
      </header>
      
      <div className="lesson-section">
        <h2>Coming Soon!</h2>
        <p>This lesson is under development. You'll learn:</p>
        <ul>
          <li>What are custom hooks and why use them</li>
          <li>Extracting logic into reusable functions</li>
          <li>Hook composition and best practices</li>
          <li>Creating useCounter and useToggle hooks</li>
        </ul>
        
        <div style={{ marginTop: '30px' }}>
          <a 
            href="/final-project" 
            style={{
              display: 'inline-block',
              padding: '12px 24px',
              backgroundColor: '#007bff',
              color: 'white',
              textDecoration: 'none',
              borderRadius: '8px',
              fontWeight: 'bold'
            }}
          >
            Next: Final Project →
          </a>
        </div>
      </div>
    </div>
  );
};

export default CustomHooks;