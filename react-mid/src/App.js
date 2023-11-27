import React from 'react';
import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
import Home from './components/Home';
import './index.css';

function App() {
    return (
        <Router>
            <nav className="navbar">
                <ul>
                    <li><Link to="/">Home</Link></li>
                    {/* Add more navigation links here */}
                </ul>
            </nav>
            <Routes>
                <Route path="/" element={<Home />} />
                {/* Add more routes here */}
            </Routes>
        </Router>
    );
}

export default App;
