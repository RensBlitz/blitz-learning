import React, { useState } from 'react';
import CodeEditor from '../components/CodeEditor';
import LivePreview from '../components/LivePreview';

const JSXBasics: React.FC = () => {
  const [demoCode, setDemoCode] = useState(`function Welcome(props) {
  return <h1>Hello, {props.name}!</h1>;
}

function App() {
  return (
    <div>
      <Welcome name="Sara" />
      <Welcome name="Cahal" />
      <Welcome name="Edite" />
    </div>
  );
}

export default App;`);

  const [assignmentCode, setAssignmentCode] = useState(`// Assignment: Create a PersonCard component
// It should display name, age, and occupation
// Use props to pass the data

function PersonCard(props) {
  return (
    <div style={{ 
      border: '1px solid #ccc', 
      padding: '20px', 
      margin: '10px',
      borderRadius: '8px' 
    }}>
      {/* Your code here */}
      <h3>Name: {props.name}</h3>
      {/* Add age and occupation */}
    </div>
  );
}

function App() {
  return (
    <div>
      <PersonCard 
        name="John Doe" 
        age={30} 
        occupation="Developer" 
      />
      <PersonCard 
        name="Jane Smith" 
        age={25} 
        occupation="Designer" 
      />
    </div>
  );
}

export default App;`);

  // Interactive demo component
  const InteractiveDemo: React.FC = () => {
    const [userName, setUserName] = useState('World');
    
    return (
      <div style={{ padding: '20px', border: '2px dashed #007bff', borderRadius: '8px' }}>
        <h3>Try changing the name:</h3>
        <input 
          type="text" 
          value={userName} 
          onChange={(e) => setUserName(e.target.value)}
          style={{ padding: '8px', marginRight: '10px', borderRadius: '4px', border: '1px solid #ccc' }}
        />
        <div style={{ marginTop: '10px', fontSize: '1.2rem' }}>
          Hello, <strong>{userName}</strong>!
        </div>
        <p style={{ marginTop: '10px', fontSize: '0.9rem', color: '#666' }}>
          This demonstrates JSX expressions: <code>{`{userName}`}</code>
        </p>
      </div>
    );
  };

  return (
    <div className="lesson-container">
      <header style={{ marginBottom: '40px' }}>
        <h1>🧱 JSX Basics</h1>
        <p style={{ fontSize: '1.2rem', color: '#666' }}>
          Learn JSX syntax, expressions, and how to create React components
        </p>
      </header>

      {/* Section 1: What is JSX */}
      <section className="lesson-section">
        <h2>1. What is JSX?</h2>
        <p>
          JSX is a syntax extension for JavaScript that allows you to write HTML-like code in your JavaScript files. 
          It makes React components more readable and easier to write.
        </p>
        
        <div className="code-snippet">
{`// Instead of this:
React.createElement('h1', null, 'Hello World!')

// You can write this:
<h1>Hello World!</h1>`}
        </div>

        <h3>Key JSX Rules:</h3>
        <ul>
          <li>JSX elements must be wrapped in a single parent element</li>
          <li>Use <code>className</code> instead of <code>class</code></li>
          <li>Self-closing tags must end with <code>/&gt;</code></li>
          <li>JavaScript expressions go inside curly braces <code>{`{}`}</code></li>
        </ul>
      </section>

      {/* Section 2: Interactive Demo */}
      <section className="lesson-section">
        <h2>2. Interactive Demo</h2>
        <p>Try the interactive example below to see how JSX expressions work:</p>
        <InteractiveDemo />
      </section>

      {/* Section 3: JSX Expressions */}
      <section className="lesson-section">
        <h2>3. JSX Expressions</h2>
        <p>
          You can embed any JavaScript expression in JSX by wrapping it in curly braces:
        </p>
        
        <div className="code-snippet">
{`const name = 'John';
const age = 25;

// Using expressions in JSX
<div>
  <h1>Hello {name}!</h1>
  <p>You are {age} years old</p>
  <p>Next year you'll be {age + 1}</p>
</div>`}
        </div>
      </section>

      {/* Section 4: Components and Props */}
      <section className="lesson-section">
        <h2>4. Components and Props</h2>
        <p>
          Components are reusable pieces of UI. Props (properties) let you pass data to components:
        </p>
        
        <div className="code-editor-container">
          <div className="editor-panel">
            <div className="panel-header">Code Editor - Try It!</div>
            <CodeEditor 
              initialCode={demoCode}
              onChange={setDemoCode}
              language="javascript"
            />
          </div>
          <div className="preview-panel">
            <div className="panel-header">Live Preview</div>
            <LivePreview code={demoCode} />
          </div>
        </div>
        
        <div style={{ marginTop: '20px' }}>
          <h4>Key Concepts Demonstrated:</h4>
          <ul>
            <li><strong>Function Components:</strong> <code>function Welcome(props)</code></li>
            <li><strong>Props:</strong> <code>props.name</code> to access passed data</li>
            <li><strong>Component Reuse:</strong> <code>&lt;Welcome name="Sara" /&gt;</code></li>
            <li><strong>JSX Expressions:</strong> <code>{`{props.name}`}</code></li>
          </ul>
        </div>
      </section>

      {/* Section 5: Assignment */}
      <section className="assignment-box">
        <h3>🎯 Your Assignment</h3>
        <p>
          Complete the PersonCard component below. It should display:
        </p>
        <ul>
          <li>Person's name (already done)</li>
          <li>Person's age</li>
          <li>Person's occupation</li>
        </ul>
        <p>
          <strong>Hint:</strong> Use <code>props.age</code> and <code>props.occupation</code> 
          similar to how <code>props.name</code> is used.
        </p>
        
        <div className="code-editor-container">
          <div className="editor-panel">
            <div className="panel-header">Assignment Code Editor</div>
            <CodeEditor 
              initialCode={assignmentCode}
              onChange={setAssignmentCode}
              language="javascript"
            />
          </div>
          <div className="preview-panel">
            <div className="panel-header">Your Result</div>
            <LivePreview code={assignmentCode} />
          </div>
        </div>
      </section>

      {/* Section 6: What's Next */}
      <section className="lesson-section">
        <h2>5. What's Next?</h2>
        <p>
          Great job learning JSX basics! You now understand:
        </p>
        <ul>
          <li>✅ JSX syntax and expressions</li>
          <li>✅ How to create functional components</li>
          <li>✅ How to use props to pass data</li>
        </ul>
        
        <p>
          In the next lesson, we'll learn about <strong>useState</strong> to add interactivity and state to our components.
        </p>
        
        <div style={{ marginTop: '30px' }}>
          <a 
            href="/state-basics" 
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
            Next: useState Hook →
          </a>
        </div>
      </section>
    </div>
  );
};

export default JSXBasics;