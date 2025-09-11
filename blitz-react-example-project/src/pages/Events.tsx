import React from 'react';

const Events: React.FC = () => {
  return (
    <div className="lesson-container">
      <header style={{ marginBottom: '40px' }}>
        <h1>🖱️ Event Handling</h1>
        <p style={{ fontSize: '1.2rem', color: '#666' }}>
          Learn how to handle user interactions like clicks, form inputs, and keyboard events
        </p>
      </header>
      
      <div className="lesson-section">
        <h2>Coming Soon!</h2>
        <p>This lesson is under development. You'll learn:</p>
        <ul>
          <li>onClick, onChange, onSubmit events</li>
          <li>Event objects and preventDefault</li>
          <li>Synthetic events in React</li>
          <li>Building a calculator with button interactions</li>
        </ul>
        
        <div style={{ marginTop: '30px' }}>
          <a 
            href="/conditional" 
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
            Next: Conditional Rendering →
          </a>
        </div>
      </div>
    </div>
  );
};

export default Events;