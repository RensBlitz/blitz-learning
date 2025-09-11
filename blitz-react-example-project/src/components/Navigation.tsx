import React from 'react';
import { NavLink } from 'react-router-dom';
import './Navigation.css';

const Navigation: React.FC = () => {
  const lessons = [
    { path: '/', label: 'Home', icon: '🏠' },
    { path: '/jsx-basics', label: 'JSX Basics', icon: '🧱' },
    { path: '/state-basics', label: 'useState', icon: '📊' },
    { path: '/effects', label: 'useEffect', icon: '⚡' },
    { path: '/events', label: 'Events', icon: '🖱️' },
    { path: '/conditional', label: 'Conditional', icon: '🔀' },
    { path: '/lists', label: 'Lists & Keys', icon: '📝' },
    { path: '/forms', label: 'Forms', icon: '📋' },
    { path: '/custom-hooks', label: 'Custom Hooks', icon: '🎣' },
    { path: '/final-project', label: 'Final Project', icon: '🚀' }
  ];

  return (
    <nav className="navigation">
      <div className="nav-header">
        <h2>Lessons</h2>
      </div>
      <ul className="nav-list">
        {lessons.map((lesson, index) => (
          <li key={lesson.path} className="nav-item">
            <NavLink 
              to={lesson.path} 
              className={({ isActive }) => 
                `nav-link ${isActive ? 'nav-link-active' : ''}`
              }
            >
              <span className="nav-icon">{lesson.icon}</span>
              <span className="nav-label">{lesson.label}</span>
              <span className="nav-number">{index}</span>
            </NavLink>
          </li>
        ))}
      </ul>
    </nav>
  );
};

export default Navigation;