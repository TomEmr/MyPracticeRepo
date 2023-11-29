import React from 'react';
import { BrowserRouter as Router, Route, Routes, Link } from 'react-router-dom';
import Home from './components/Home';
import BasicForm from "./components/BasicForm";
import './index.css';

function App() {
    return (
        <Router>
            <nav className="navbar">
                <ul>
                    <li><Link to="/">Home</Link></li>
                    <li><Link to="/basic-form">Basic Form</Link></li>
                    {/* Add more navigation links here */}
                </ul>
            </nav>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/basic-form" element={<BasicForm />} />
                {/* Add more routes here */}
            </Routes>
        </Router>
    );
}

export default App;
