import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Header from './components/Header';
import Navigation from './components/Navigation';
import Home from './pages/Home';
import JSXBasics from './pages/JSXBasics';
import StateBasics from './pages/StateBasics';
import Effects from './pages/Effects';
import Events from './pages/Events';
import Conditional from './pages/Conditional';
import Lists from './pages/Lists';
import Forms from './pages/Forms';
import CustomHooks from './pages/CustomHooks';
import FinalProject from './pages/FinalProject';
import './App.css';

function App() {
  return (
    <Router>
      <div className="App">
        <Header />
        <div className="app-content">
          <Navigation />
          <main className="main-content">
            <Routes>
              <Route path="/" element={<Home />} />
              <Route path="/jsx-basics" element={<JSXBasics />} />
              <Route path="/state-basics" element={<StateBasics />} />
              <Route path="/effects" element={<Effects />} />
              <Route path="/events" element={<Events />} />
              <Route path="/conditional" element={<Conditional />} />
              <Route path="/lists" element={<Lists />} />
              <Route path="/forms" element={<Forms />} />
              <Route path="/custom-hooks" element={<CustomHooks />} />
              <Route path="/final-project" element={<FinalProject />} />
            </Routes>
          </main>
        </div>
      </div>
    </Router>
  );
}

export default App;
