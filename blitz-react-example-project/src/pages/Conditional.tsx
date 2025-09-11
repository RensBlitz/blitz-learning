import React from 'react';

const Conditional: React.FC = () => {
  return (
    <div className="lesson-container">
      <header style={{ marginBottom: '40px' }}>
        <h1>🔀 Conditional Rendering</h1>
        <p style={{ fontSize: '1.2rem', color: '#666' }}>
          Learn how to show/hide content based on conditions and state
        </p>
      </header>
      
      <div className="lesson-section">
        <h2>Coming Soon!</h2>
        <p>This lesson is under development. You'll learn:</p>
        <ul>
          <li>Ternary operators in JSX</li>
          <li>Logical && operator for conditional rendering</li>
          <li>Multiple conditions and complex logic</li>
          <li>Building a weather widget with different states</li>
        </ul>
        
        <div style={{ marginTop: '30px' }}>
          <a 
            href="/lists" 
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
            Next: Lists & Keys →
          </a>
        </div>
      </div>
    </div>
  );
};

export default Conditional;