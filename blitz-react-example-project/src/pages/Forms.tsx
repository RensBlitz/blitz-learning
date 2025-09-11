import React from 'react';

const Forms: React.FC = () => {
  return (
    <div className="lesson-container">
      <header style={{ marginBottom: '40px' }}>
        <h1>📋 Forms & Input Handling</h1>
        <p style={{ fontSize: '1.2rem', color: '#666' }}>
          Learn how to handle form inputs, validation, and controlled components
        </p>
      </header>
      
      <div className="lesson-section">
        <h2>Coming Soon!</h2>
        <p>This lesson is under development. You'll learn:</p>
        <ul>
          <li>Controlled vs uncontrolled components</li>
          <li>Form validation techniques</li>
          <li>Handling multiple input types</li>
          <li>Building a user registration form with validation</li>
        </ul>
        
        <div style={{ marginTop: '30px' }}>
          <a 
            href="/custom-hooks" 
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
            Next: Custom Hooks →
          </a>
        </div>
      </div>
    </div>
  );
};

export default Forms;