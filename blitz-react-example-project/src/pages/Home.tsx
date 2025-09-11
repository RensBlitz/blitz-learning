import React from 'react';
import { Link } from 'react-router-dom';
import './Home.css';

const Home: React.FC = () => {
  const lessons = [
    {
      id: 1,
      title: 'JSX Basics',
      description: 'Learn JSX syntax, expressions, and component basics',
      icon: '🧱',
      path: '/jsx-basics',
      concepts: ['JSX Syntax', 'Components', 'Props'],
      difficulty: 'Beginner'
    },
    {
      id: 2,
      title: 'useState Hook',
      description: 'Master state management with the useState hook',
      icon: '📊',
      path: '/state-basics',
      concepts: ['State Variables', 'State Updates', 'Re-renders'],
      difficulty: 'Beginner'
    },
    {
      id: 3,
      title: 'useEffect Hook',
      description: 'Handle side effects and component lifecycle',
      icon: '⚡',
      path: '/effects',
      concepts: ['Side Effects', 'Dependencies', 'Cleanup'],
      difficulty: 'Intermediate'
    },
    {
      id: 4,
      title: 'Event Handling',
      description: 'Handle user interactions and events',
      icon: '🖱️',
      path: '/events',
      concepts: ['Event Handlers', 'Synthetic Events', 'Form Events'],
      difficulty: 'Beginner'
    },
    {
      id: 5,
      title: 'Conditional Rendering',
      description: 'Show/hide content based on conditions',
      icon: '🔀',
      path: '/conditional',
      concepts: ['Ternary Operators', 'Logical &&', 'Multiple Conditions'],
      difficulty: 'Beginner'
    },
    {
      id: 6,
      title: 'Lists & Keys',
      description: 'Render dynamic lists and understand keys',
      icon: '📝',
      path: '/lists',
      concepts: ['Array Mapping', 'Key Props', 'Dynamic Content'],
      difficulty: 'Beginner'
    },
    {
      id: 7,
      title: 'Forms & Input',
      description: 'Handle form inputs and validation',
      icon: '📋',
      path: '/forms',
      concepts: ['Controlled Components', 'Form Validation', 'Input Handling'],
      difficulty: 'Intermediate'
    },
    {
      id: 8,
      title: 'Custom Hooks',
      description: 'Create reusable stateful logic',
      icon: '🎣',
      path: '/custom-hooks',
      concepts: ['Custom Hooks', 'Logic Reuse', 'Hook Composition'],
      difficulty: 'Advanced'
    },
    {
      id: 9,
      title: 'Final Project',
      description: 'Build a complete Todo App using all concepts',
      icon: '🚀',
      path: '/final-project',
      concepts: ['Complete App', 'All Concepts', 'Best Practices'],
      difficulty: 'Advanced'
    }
  ];

  const getDifficultyColor = (difficulty: string) => {
    switch (difficulty) {
      case 'Beginner': return '#4caf50';
      case 'Intermediate': return '#ff9800';
      case 'Advanced': return '#f44336';
      default: return '#757575';
    }
  };

  return (
    <div className="home">
      <div className="hero-section">
        <h1>Welcome to React Learning Platform</h1>
        <p>Master React concepts through interactive lessons and hands-on coding exercises</p>
        <div className="hero-stats">
          <div className="stat">
            <span className="stat-number">9</span>
            <span className="stat-label">Interactive Lessons</span>
          </div>
          <div className="stat">
            <span className="stat-number">20+</span>
            <span className="stat-label">Coding Exercises</span>
          </div>
          <div className="stat">
            <span className="stat-number">1</span>
            <span className="stat-label">Final Project</span>
          </div>
        </div>
      </div>

      <div className="lessons-grid">
        {lessons.map((lesson) => (
          <div key={lesson.id} className="lesson-card">
            <div className="lesson-header">
              <span className="lesson-icon">{lesson.icon}</span>
              <div className="lesson-title-section">
                <h3>{lesson.title}</h3>
                <span 
                  className="difficulty-badge"
                  style={{ backgroundColor: getDifficultyColor(lesson.difficulty) }}
                >
                  {lesson.difficulty}
                </span>
              </div>
            </div>
            
            <p className="lesson-description">{lesson.description}</p>
            
            <div className="lesson-concepts">
              <h4>You'll learn:</h4>
              <ul>
                {lesson.concepts.map((concept, index) => (
                  <li key={index}>{concept}</li>
                ))}
              </ul>
            </div>
            
            <Link to={lesson.path} className="lesson-link">
              Start Lesson →
            </Link>
          </div>
        ))}
      </div>

      <div className="getting-started">
        <h2>How It Works</h2>
        <div className="steps">
          <div className="step">
            <div className="step-number">1</div>
            <h3>Learn</h3>
            <p>Read explanations and watch interactive demos</p>
          </div>
          <div className="step">
            <div className="step-number">2</div>
            <h3>Code</h3>
            <p>Write and edit React code in the browser</p>
          </div>
          <div className="step">
            <div className="step-number">3</div>
            <h3>Practice</h3>
            <p>Complete assignments to reinforce learning</p>
          </div>
        </div>
      </div>
    </div>
  );
};

export default Home;