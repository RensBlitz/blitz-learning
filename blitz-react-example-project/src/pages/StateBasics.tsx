import React, { useState } from 'react';
import CodeEditor from '../components/CodeEditor';
import LivePreview from '../components/LivePreview';

const StateBasics: React.FC = () => {
  const [counterCode, setCounterCode] = useState(`import { useState } from 'react';

function Counter() {
  const [count, setCount] = useState(0);
  
  return (
    <div style={{ textAlign: 'center', padding: '20px' }}>
      <h2>Counter: {count}</h2>
      <div>
        <button 
          onClick={() => setCount(count + 1)}
          style={{ margin: '5px', padding: '10px 20px' }}
        >
          +1
        </button>
        <button 
          onClick={() => setCount(count - 1)}
          style={{ margin: '5px', padding: '10px 20px' }}
        >
          -1
        </button>
        <button 
          onClick={() => setCount(0)}
          style={{ margin: '5px', padding: '10px 20px' }}
        >
          Reset
        </button>
      </div>
    </div>
  );
}

export default Counter;`);

  const [assignmentCode, setAssignmentCode] = useState(`import { useState } from 'react';

// Assignment: Build a Shopping Cart Quantity Selector
// Requirements:
// 1. Show current quantity
// 2. Add/Remove buttons (can't go below 0)
// 3. Show total price (price per item: $29.99)

function ShoppingCart() {
  const [quantity, setQuantity] = useState(1);
  const pricePerItem = 29.99;
  
  const increaseQuantity = () => {
    // Add your code here
  };
  
  const decreaseQuantity = () => {
    // Add your code here
    // Hint: Don't let quantity go below 0
  };
  
  const totalPrice = quantity * pricePerItem;
  
  return (
    <div style={{ 
      border: '1px solid #ccc', 
      padding: '20px', 
      borderRadius: '8px',
      textAlign: 'center'
    }}>
      <h3>Wireless Headphones</h3>
      <p>$29.99 each</p>
      
      <div style={{ margin: '20px 0' }}>
        <button onClick={decreaseQuantity}>-</button>
        <span style={{ margin: '0 20px', fontSize: '1.2rem' }}>
          Quantity: {quantity}
        </span>
        <button onClick={increaseQuantity}>+</button>
      </div>
      
      <div style={{ fontSize: '1.5rem', fontWeight: 'bold' }}>
        Total: $\{totalPrice.toFixed(2)\}
      </div>
    </div>
  );
}

export default ShoppingCart;`);

  // Interactive demo components
  const BrokenCounterDemo: React.FC = () => {
    let clicks = 0; // This won't work for UI updates!
    
    const handleClick = () => {
      clicks = clicks + 1;
      console.log('❌ Broken Counter - Variable value:', clicks); 
      console.log('❌ But the UI still shows: 0 (because React doesn\'t re-render!)');
    };
    
    return (
      <button 
        onClick={handleClick}
        style={{ 
          padding: '10px 20px', 
          fontSize: '1rem',
          backgroundColor: '#dc3545',
          color: 'white',
          border: 'none',
          borderRadius: '4px'
        }}
      >
        Clicked {clicks} times
      </button>
    );
  };

  const WorkingCounterDemo: React.FC = () => {
    const [clicks, setClicks] = useState(0);
    
    const handleClick = () => {
      const newCount = clicks + 1;
      setClicks(newCount);
      console.log('✅ Working Counter - State value:', newCount);
      console.log('✅ UI will update to show:', newCount);
    };
    
    return (
      <button 
        onClick={handleClick}
        style={{ 
          padding: '10px 20px', 
          fontSize: '1rem',
          backgroundColor: '#28a745',
          color: 'white',
          border: 'none',
          borderRadius: '4px'
        }}
      >
        Clicked {clicks} times
      </button>
    );
  };

  return (
    <div className="lesson-container">
      <header style={{ marginBottom: '40px' }}>
        <h1>📊 useState Hook</h1>
        <p style={{ fontSize: '1.2rem', color: '#666' }}>
          Learn how to add state to your React components and handle user interactions
        </p>
      </header>

      {/* Section 1: What is State */}
      <section className="lesson-section">
        <h2>1. What is State?</h2>
        <p>
          State is data that can change over time in your component. Unlike props, which are passed down from parent components, 
          state is managed within the component itself.
        </p>
        
        <div className="code-snippet">
{`// ❌ This WON'T work - UI won't update
function BrokenCounter() {
  let count = 0; // Regular variable
  
  const handleClick = () => {
    count = count + 1; // Changes the variable...
    console.log(count); // ...logs correctly...
    // But React doesn't re-render!
  };
  
  return (
    <button onClick={handleClick}>
      Clicked {count} times
    </button>
  );
}

// ✅ This WILL work - UI updates automatically
function WorkingCounter() {
  const [count, setCount] = useState(0); // React state
  
  const handleClick = () => {
    setCount(count + 1); // Tells React to re-render
  };
  
  return (
    <button onClick={handleClick}>
      Clicked {count} times
    </button>
  );
}`}
        </div>

        <h3>Why do we need state?</h3>
        <ul>
          <li>To handle user interactions (clicks, form inputs)</li>
          <li>To show different content based on conditions</li>
          <li>To create dynamic, interactive user interfaces</li>
        </ul>
      </section>

      {/* Section 2: useState Hook */}
      <section className="lesson-section">
        <h2>2. The useState Hook</h2>
        <p>
          The <code>useState</code> hook lets you add state to functional components:
        </p>
        
        <div className="code-snippet">
{`import { useState } from 'react';

function MyComponent() {
  // useState returns an array with two elements:
  // [currentValue, setterFunction]
  const [count, setCount] = useState(0);
  
  // count = current state value
  // setCount = function to update the state
  // 0 = initial state value
}`}
        </div>

        <h3>useState Syntax:</h3>
        <ul>
          <li><code>const [state, setState] = useState(initialValue)</code></li>
          <li><code>state</code> - the current value</li>
          <li><code>setState</code> - function to update the value</li>
          <li><code>initialValue</code> - what the state starts as</li>
        </ul>
      </section>

      {/* Section 3: Interactive Demo */}
      <section className="lesson-section">
        <h2>3. Why useState? Interactive Comparison</h2>
        <p>Compare the code with the actual buttons. Open your browser console to see what's happening behind the scenes!</p>
        
        {/* Broken Counter Example */}
        <div style={{ 
          display: 'flex', 
          gap: '20px', 
          marginBottom: '30px', 
          padding: '20px',
          backgroundColor: '#f8d7da',
          border: '2px solid #dc3545',
          borderRadius: '8px'
        }}>
          <div style={{ flex: 1 }}>
            <h4>❌ Code Without useState:</h4>
            <div className="code-snippet" style={{ fontSize: '0.85rem', marginBottom: '0' }}>
{`function BrokenCounter() {
  let count = 0; // Regular variable
  
  const handleClick = () => {
    count = count + 1; // Variable changes...
    console.log('Count:', count);
    // But React doesn't re-render!
  };
  
  return (
    <button onClick={handleClick}>
      Clicked {count} times
    </button>
  );
}`}
            </div>
          </div>
          
          <div style={{ 
            flex: 1, 
            display: 'flex', 
            flexDirection: 'column', 
            justifyContent: 'center',
            alignItems: 'center',
            minHeight: '200px'
          }}>
            <h4>❌ Result (Broken):</h4>
            <BrokenCounterDemo />
            <p style={{ 
              fontSize: '0.85rem', 
              color: '#721c24', 
              textAlign: 'center',
              marginTop: '15px',
              fontWeight: 'bold'
            }}>
              Click me! Check console - count increases but UI stays at 0!
            </p>
          </div>
        </div>
        
        {/* Working Counter Example */}
        <div style={{ 
          display: 'flex', 
          gap: '20px', 
          marginBottom: '20px',
          padding: '20px',
          backgroundColor: '#d4edda',
          border: '2px solid #28a745',
          borderRadius: '8px'
        }}>
          <div style={{ flex: 1 }}>
            <h4>✅ Code With useState:</h4>
            <div className="code-snippet" style={{ fontSize: '0.85rem', marginBottom: '0' }}>
{`function WorkingCounter() {
  const [count, setCount] = useState(0); // State
  
  const handleClick = () => {
    setCount(count + 1); // Tells React to re-render
    console.log('Count:', count + 1);
  };
  
  return (
    <button onClick={handleClick}>
      Clicked {count} times
    </button>
  );
}`}
            </div>
          </div>
          
          <div style={{ 
            flex: 1, 
            display: 'flex', 
            flexDirection: 'column', 
            justifyContent: 'center',
            alignItems: 'center',
            minHeight: '200px'
          }}>
            <h4>✅ Result (Working!):</h4>
            <WorkingCounterDemo />
            <p style={{ 
              fontSize: '0.85rem', 
              color: '#155724', 
              textAlign: 'center',
              marginTop: '15px',
              fontWeight: 'bold'
            }}>
              Click me! UI updates immediately when state changes!
            </p>
          </div>
        </div>
        
        <div style={{ 
          padding: '15px', 
          backgroundColor: '#fff3cd', 
          border: '1px solid #ffeaa7', 
          borderRadius: '8px',
          marginTop: '20px' 
        }}>
          <h4>🔍 Key Learning Points:</h4>
          <ul style={{ margin: '10px 0' }}>
            <li><strong>Regular variables:</strong> Change in memory but React doesn't know to re-render the component</li>
            <li><strong>useState:</strong> Tells React "this value changed, please update the UI"</li>
            <li><strong>Console logs:</strong> Both approaches log correctly, but only useState triggers UI updates</li>
            <li><strong>React's rule:</strong> UI only updates when state changes, never for regular variables!</li>
          </ul>
        </div>
      </section>

      {/* Section 4: Counter Example */}
      <section className="lesson-section">
        <h2>4. Building a Counter</h2>
        <p>
          Let's build a complete counter with multiple buttons. Try modifying the code:
        </p>
        
        <div className="code-editor-container">
          <div className="editor-panel">
            <div className="panel-header">Code Editor - Counter Example</div>
            <CodeEditor 
              initialCode={counterCode}
              onChange={setCounterCode}
              language="javascript"
            />
          </div>
          <div className="preview-panel">
            <div className="panel-header">Live Preview</div>
            <LivePreview code={counterCode} />
          </div>
        </div>
        
        <div style={{ marginTop: '20px' }}>
          <h4>Key Concepts:</h4>
          <ul>
            <li><strong>State Declaration:</strong> <code>const [count, setCount] = useState(0)</code></li>
            <li><strong>Reading State:</strong> <code>{`{count}`}</code> in JSX</li>
            <li><strong>Updating State:</strong> <code>setCount(count + 1)</code></li>
            <li><strong>Event Handlers:</strong> <code>onClick={`{() => setCount(...)}`}</code></li>
          </ul>
        </div>
      </section>

      {/* Section 5: Important Rules */}
      <section className="lesson-section">
        <h2>5. Important useState Rules</h2>
        
        <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '20px' }}>
          <div style={{ padding: '15px', backgroundColor: '#d4edda', border: '1px solid #c3e6cb', borderRadius: '8px' }}>
            <h4 style={{ color: '#155724', margin: '0 0 10px 0' }}>✅ Do This:</h4>
            <div className="code-snippet" style={{ fontSize: '0.85rem' }}>
{`// Always use the setter function
setCount(count + 1);

// For multiple state variables
const [name, setName] = useState('');
const [age, setAge] = useState(0);`}
            </div>
          </div>
          
          <div style={{ padding: '15px', backgroundColor: '#f8d7da', border: '1px solid #f5c6cb', borderRadius: '8px' }}>
            <h4 style={{ color: '#721c24', margin: '0 0 10px 0' }}>❌ Don't Do This:</h4>
            <div className="code-snippet" style={{ fontSize: '0.85rem' }}>
{`// Never modify state directly
count = count + 1; // Won't work!

// Don't call useState in loops/conditions
if (something) {
  const [count, setCount] = useState(0);
}`}
            </div>
          </div>
        </div>
      </section>

      {/* Section 6: Assignment */}
      <section className="assignment-box">
        <h3>🎯 Your Assignment</h3>
        <p>
          Build a shopping cart quantity selector with these requirements:
        </p>
        <ul>
          <li>✅ Show current quantity (already working)</li>
          <li>🔨 Implement the <code>increaseQuantity</code> function</li>
          <li>🔨 Implement the <code>decreaseQuantity</code> function (don't go below 0)</li>
          <li>✅ Calculate and display total price (already working)</li>
        </ul>
        
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
            <div className="panel-header">Your Shopping Cart</div>
            <LivePreview code={assignmentCode} />
          </div>
        </div>
        
        <div style={{ marginTop: '20px', padding: '15px', backgroundColor: '#e8f4fd', borderRadius: '8px' }}>
          <h4>💡 Hints:</h4>
          <ul>
            <li>Use <code>setQuantity(quantity + 1)</code> to increase</li>
            <li>For decrease, check if quantity &gt; 0 before decreasing</li>
            <li>You can use: <code>if (quantity &gt; 0) setQuantity(quantity - 1)</code></li>
          </ul>
        </div>
      </section>

      {/* Section 7: What's Next */}
      <section className="lesson-section">
        <h2>6. What's Next?</h2>
        <p>
          Excellent work! You now understand:
        </p>
        <ul>
          <li>✅ What state is and why it's important</li>
          <li>✅ How to use the useState hook</li>
          <li>✅ How to handle user interactions with event handlers</li>
          <li>✅ How to update state safely</li>
        </ul>
        
        <p>
          In the next lesson, we'll learn about <strong>useEffect</strong> to handle side effects 
          like API calls, timers, and component lifecycle events.
        </p>
        
        <div style={{ marginTop: '30px' }}>
          <a 
            href="/effects" 
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
            Next: useEffect Hook →
          </a>
        </div>
      </section>
    </div>
  );
};

export default StateBasics;