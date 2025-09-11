import React from 'react';

const FinalProject: React.FC = () => {
  return (
    <div className="lesson-container">
      <header style={{ marginBottom: '40px' }}>
        <h1>🚀 Final Project</h1>
        <p style={{ fontSize: '1.2rem', color: '#666' }}>
          Build a complete Todo App using all the concepts you've learned
        </p>
      </header>
      
      <div className="lesson-section">
        <h2>Coming Soon!</h2>
        <p>In this final project, you'll combine everything you've learned:</p>
        <ul>
          <li>✅ JSX and component structure</li>
          <li>✅ useState for managing todos</li>
          <li>✅ useEffect for persistence</li>
          <li>✅ Event handling for user interactions</li>
          <li>✅ Conditional rendering for different states</li>
          <li>✅ Lists and keys for rendering todos</li>
          <li>✅ Forms for adding new todos</li>
          <li>✅ Custom hooks for reusable logic</li>
        </ul>
        
        <div style={{ marginTop: '30px', padding: '20px', backgroundColor: '#d4edda', borderRadius: '8px' }}>
          <h3>🎉 Congratulations!</h3>
          <p>You've completed the core React concepts. The final project will bring it all together!</p>
          
          <a 
            href="/" 
            style={{
              display: 'inline-block',
              padding: '12px 24px',
              backgroundColor: '#28a745',
              color: 'white',
              textDecoration: 'none',
              borderRadius: '8px',
              fontWeight: 'bold',
              marginTop: '15px'
            }}
          >
            Back to Home →
          </a>
        </div>
      </div>
    </div>
  );
};

export default FinalProject;