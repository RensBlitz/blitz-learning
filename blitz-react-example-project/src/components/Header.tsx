import React from 'react';
import './Header.css';

const Header: React.FC = () => {
  return (
    <header className="header">
      <div className="header-content">
        <h1 className="header-title">React Learning Platform</h1>
        <p className="header-subtitle">Interactive React Tutorial with Hands-on Coding</p>
      </div>
    </header>
  );
};

export default Header;