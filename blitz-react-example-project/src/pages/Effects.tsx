import React, { useState } from 'react';
import CodeEditor from '../components/CodeEditor';
import LivePreview from '../components/LivePreview';

const Effects: React.FC = () => {
  const [timerCode, setTimerCode] = useState(`import { useState, useEffect } from 'react';

function Timer() {
  const [seconds, setSeconds] = useState(0);
  const [isRunning, setIsRunning] = useState(false);

  useEffect(() => {
    let interval;
    
    if (isRunning) {
      interval = setInterval(() => {
        setSeconds(prevSeconds => prevSeconds + 1);
      }, 1000);
    }
    
    // Cleanup function - runs when component unmounts or dependencies change
    return () => {
      if (interval) {
        clearInterval(interval);
      }
    };
  }, [isRunning]); // Dependency array

  const startTimer = () => setIsRunning(true);
  const stopTimer = () => setIsRunning(false);
  const resetTimer = () => {
    setSeconds(0);
    setIsRunning(false);
  };

  return (
    <div style={{ textAlign: 'center', padding: '20px' }}>
      <h2>Timer: {seconds}s</h2>
      <div>
        <button onClick={startTimer} style={{ margin: '5px', padding: '10px' }}>
          Start
        </button>
        <button onClick={stopTimer} style={{ margin: '5px', padding: '10px' }}>
          Stop
        </button>
        <button onClick={resetTimer} style={{ margin: '5px', padding: '10px' }}>
          Reset
        </button>
      </div>
      <p style={{ marginTop: '10px', fontSize: '0.9rem', color: '#666' }}>
        Status: {isRunning ? 'Running' : 'Stopped'}
      </p>
    </div>
  );
}

export default Timer;`);

  const [assignmentCode, setAssignmentCode] = useState(`import { useState, useEffect } from 'react';

// Assignment: Create a Digital Clock and User Data Fetcher
// Requirements:
// 1. Show current time that updates every second
// 2. Fetch and display a random user from API
// 3. Add a refresh button to get a new user

function ClockAndUser() {
  const [currentTime, setCurrentTime] = useState(new Date());
  const [user, setUser] = useState(null);
  const [loading, setLoading] = useState(true);

  // Effect 1: Update time every second
  useEffect(() => {
    // Your code here
    // Hint: Use setInterval to update currentTime every 1000ms
    // Don't forget to clean up the interval!
  }, []); // Empty dependency array - runs once on mount

  // Effect 2: Fetch user data on component mount
  useEffect(() => {
    fetchRandomUser();
  }, []); // Empty dependency array - runs once on mount

  const fetchRandomUser = async () => {
    setLoading(true);
    try {
      const response = await fetch('https://randomuser.me/api/');
      const data = await response.json();
      setUser(data.results[0]);
    } catch (error) {
      console.error('Error fetching user:', error);
    } finally {
      setLoading(false);
    }
  };

  const formatTime = (date) => {
    return date.toLocaleTimeString();
  };

  return (
    <div style={{ 
      padding: '20px', 
      border: '1px solid #ccc', 
      borderRadius: '8px',
      textAlign: 'center'
    }}>
      <div style={{ marginBottom: '30px' }}>
        <h3>Digital Clock</h3>
        <div style={{ fontSize: '2rem', fontWeight: 'bold', color: '#007bff' }}>
          {formatTime(currentTime)}
        </div>
      </div>

      <div>
        <h3>Random User</h3>
        {loading ? (
          <p>Loading user...</p>
        ) : user ? (
          <div>
            <img 
              src={user.picture.medium} 
              alt="User" 
              style={{ borderRadius: '50%', marginBottom: '10px' }}
            />
            <p><strong>{user.name.first} {user.name.last}</strong></p>
            <p>{user.email}</p>
            <p>{user.location.city}, {user.location.country}</p>
          </div>
        ) : (
          <p>Failed to load user</p>
        )}
        
        <button 
          onClick={fetchRandomUser}
          style={{ 
            marginTop: '10px', 
            padding: '10px 20px',
            backgroundColor: '#28a745',
            color: 'white',
            border: 'none',
            borderRadius: '4px',
            cursor: 'pointer'
          }}
        >
          Get New User
        </button>
      </div>
    </div>
  );
}

export default ClockAndUser;`);

  // Interactive demo component
  const EffectDemo: React.FC = () => {
    const [count, setCount] = useState(0);
    const [doubledCount, setDoubledCount] = useState(0);
    
    // This effect runs every time count changes
    React.useEffect(() => {
      console.log('Effect ran! Count is now:', count);
      setDoubledCount(count * 2);
    }, [count]); // Dependency array with count
    
    return (
      <div style={{ padding: '20px', border: '2px dashed #007bff', borderRadius: '8px' }}>
        <div style={{ marginBottom: '20px' }}>
          <h4>Effect Demo:</h4>
          <p>Count: <strong>{count}</strong></p>
          <p>Doubled Count: <strong>{doubledCount}</strong></p>
          <button 
            onClick={() => setCount(count + 1)}
            style={{ padding: '10px 20px', margin: '5px' }}
          >
            Increment Count
          </button>
          <button 
            onClick={() => setCount(0)}
            style={{ padding: '10px 20px', margin: '5px' }}
          >
            Reset
          </button>
        </div>
        <p style={{ fontSize: '0.9rem', color: '#666' }}>
          Open browser console to see effect logs!
        </p>
      </div>
    );
  };

  return (
    <div className="lesson-container">
      <header style={{ marginBottom: '40px' }}>
        <h1>⚡ useEffect Hook</h1>
        <p style={{ fontSize: '1.2rem', color: '#666' }}>
          Learn how to handle side effects, API calls, timers, and component lifecycle events
        </p>
      </header>

      {/* Section 1: What are Side Effects */}
      <section className="lesson-section">
        <h2>1. What are Side Effects?</h2>
        <p>
          Side effects are operations that affect something outside the component, such as:
        </p>
        
        <ul>
          <li><strong>Data fetching</strong> - API calls, loading data</li>
          <li><strong>Subscriptions</strong> - WebSockets, event listeners</li>
          <li><strong>Timers</strong> - setInterval, setTimeout</li>
          <li><strong>DOM manipulation</strong> - changing page title, focus</li>
          <li><strong>Cleanup</strong> - removing event listeners, canceling requests</li>
        </ul>

        <div className="code-snippet">
{`// Examples of side effects:
fetch('/api/users')           // Data fetching
setInterval(callback, 1000)   // Timer
document.title = 'New Title'  // DOM manipulation
window.addEventListener(...)  // Event listener`}
        </div>
      </section>

      {/* Section 2: useEffect Basics */}
      <section className="lesson-section">
        <h2>2. The useEffect Hook</h2>
        <p>
          <code>useEffect</code> lets you perform side effects in functional components:
        </p>
        
        <div className="code-snippet">
{`import { useEffect } from 'react';

function MyComponent() {
  useEffect(() => {
    // Side effect code goes here
    console.log('Component rendered!');
  });
  
  return <div>Hello World</div>;
}`}
        </div>

        <h3>useEffect Syntax:</h3>
        <div className="code-snippet">
{`useEffect(() => {
  // Effect code
  
  return () => {
    // Cleanup code (optional)
  };
}, [dependencies]); // Dependency array (optional)`}
        </div>
      </section>

      {/* Section 3: Dependency Array */}
      <section className="lesson-section">
        <h2>3. Dependency Arrays</h2>
        <p>
          The dependency array controls when your effect runs:
        </p>
        
        <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr 1fr', gap: '15px', margin: '20px 0' }}>
          <div style={{ padding: '15px', backgroundColor: '#f8f9fa', border: '1px solid #dee2e6', borderRadius: '8px' }}>
            <h4>No Dependency Array</h4>
            <div className="code-snippet" style={{ fontSize: '0.8rem' }}>
{`useEffect(() => {
  // Runs after every render
});`}
            </div>
          </div>
          
          <div style={{ padding: '15px', backgroundColor: '#e8f5e8', border: '1px solid #c3e6cb', borderRadius: '8px' }}>
            <h4>Empty Array</h4>
            <div className="code-snippet" style={{ fontSize: '0.8rem' }}>
{`useEffect(() => {
  // Runs once on mount
}, []);`}
            </div>
          </div>
          
          <div style={{ padding: '15px', backgroundColor: '#fff3cd', border: '1px solid #ffeaa7', borderRadius: '8px' }}>
            <h4>With Dependencies</h4>
            <div className="code-snippet" style={{ fontSize: '0.8rem' }}>
{`useEffect(() => {
  // Runs when count changes
}, [count]);`}
            </div>
          </div>
        </div>
      </section>

      {/* Section 4: Interactive Demo */}
      <section className="lesson-section">
        <h2>4. Interactive Demo</h2>
        <p>See how useEffect responds to state changes:</p>
        <EffectDemo />
      </section>

      {/* Section 5: Timer Example */}
      <section className="lesson-section">
        <h2>5. Timer with Cleanup</h2>
        <p>
          Let's build a timer that demonstrates useEffect with cleanup:
        </p>
        
        <div className="code-editor-container">
          <div className="editor-panel">
            <div className="panel-header">Code Editor - Timer Example</div>
            <CodeEditor 
              initialCode={timerCode}
              onChange={setTimerCode}
              language="javascript"
            />
          </div>
          <div className="preview-panel">
            <div className="panel-header">Live Timer</div>
            <LivePreview code={timerCode} />
          </div>
        </div>
        
        <div style={{ marginTop: '20px' }}>
          <h4>Key Concepts:</h4>
          <ul>
            <li><strong>Effect with Dependencies:</strong> <code>useEffect({`() => {...}, [isRunning]`})</code></li>
            <li><strong>Cleanup Function:</strong> <code>return {`() => clearInterval(interval)`}</code></li>
            <li><strong>Conditional Logic:</strong> Effect only creates interval when <code>isRunning</code> is true</li>
            <li><strong>Previous State:</strong> <code>setSeconds(prevSeconds {`=> prevSeconds + 1`})</code></li>
          </ul>
        </div>
      </section>

      {/* Section 6: Common Patterns */}
      <section className="lesson-section">
        <h2>6. Common useEffect Patterns</h2>
        
        <div style={{ display: 'grid', gridTemplateColumns: '1fr 1fr', gap: '20px' }}>
          <div>
            <h4>✅ Data Fetching on Mount</h4>
            <div className="code-snippet" style={{ fontSize: '0.85rem' }}>
{`useEffect(() => {
  const fetchData = async () => {
    const response = await fetch('/api/data');
    const data = await response.json();
    setData(data);
  };
  
  fetchData();
}, []); // Empty array = run once`}
            </div>
          </div>
          
          <div>
            <h4>✅ Event Listener with Cleanup</h4>
            <div className="code-snippet" style={{ fontSize: '0.85rem' }}>
{`useEffect(() => {
  const handleResize = () => {
    setWindowWidth(window.innerWidth);
  };
  
  window.addEventListener('resize', handleResize);
  
  return () => {
    window.removeEventListener('resize', handleResize);
  };
}, []);`}
            </div>
          </div>
        </div>
      </section>

      {/* Section 7: Assignment */}
      <section className="assignment-box">
        <h3>🎯 Your Assignment</h3>
        <p>
          Complete the digital clock and user fetcher with these requirements:
        </p>
        <ul>
          <li>✅ Display current time (formatTime already implemented)</li>
          <li>🔨 Update time every second using useEffect and setInterval</li>
          <li>✅ Fetch random user data (fetchRandomUser already implemented)</li>
          <li>🔨 Don't forget to clean up your timer!</li>
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
            <div className="panel-header">Clock & User Display</div>
            <LivePreview code={assignmentCode} />
          </div>
        </div>
        
        <div style={{ marginTop: '20px', padding: '15px', backgroundColor: '#e8f4fd', borderRadius: '8px' }}>
          <h4>💡 Hints for the Timer:</h4>
          <ul>
            <li>Use <code>setInterval({`() => setCurrentTime(new Date()), 1000`})</code></li>
            <li>Store the interval in a variable: <code>const interval = setInterval(...)</code></li>
            <li>Return cleanup function: <code>return {`() => clearInterval(interval)`}</code></li>
            <li>Use empty dependency array: <code>useEffect({`() => {...}, []`})</code></li>
          </ul>
        </div>
      </section>

      {/* Section 8: What's Next */}
      <section className="lesson-section">
        <h2>7. What's Next?</h2>
        <p>
          Fantastic! You now understand:
        </p>
        <ul>
          <li>✅ What side effects are and when to use useEffect</li>
          <li>✅ How dependency arrays control when effects run</li>
          <li>✅ How to clean up effects properly</li>
          <li>✅ Common patterns like data fetching and timers</li>
        </ul>
        
        <p>
          In the next lesson, we'll learn about <strong>Event Handling</strong> to handle user 
          interactions like clicks, form inputs, and keyboard events.
        </p>
        
        <div style={{ marginTop: '30px' }}>
          <a 
            href="/events" 
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
            Next: Event Handling →
          </a>
        </div>
      </section>
    </div>
  );
};

export default Effects;