import React from 'react';

const Lists: React.FC = () => {
  return (
    <div className="lesson-container">
      <header style={{ marginBottom: '40px' }}>
        <h1>📝 Lists & Keys</h1>
        <p style={{ fontSize: '1.2rem', color: '#666' }}>
          Learn how to render dynamic lists and understand the importance of keys
        </p>
      </header>
      
      <div className="lesson-section">
        <h2>Coming Soon!</h2>
        <p>This lesson is under development. You'll learn:</p>
        <ul>
          <li>Array.map() to render lists</li>
          <li>Key props and why they're important</li>
          <li>Rendering dynamic content</li>
          <li>Building a contact list with search functionality</li>
        </ul>
        
        <div style={{ marginTop: '30px' }}>
          <a 
            href="/forms" 
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
            Next: Forms & Input →
          </a>
        </div>
      </div>
    </div>
  );
};

export default Lists;