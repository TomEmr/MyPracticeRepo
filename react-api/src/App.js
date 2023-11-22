import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom';
import Fetch from "./Fetch";
import Home from "./Home";
const App = () => {

    return (
        <Router>
            <nav>
                <Link to="/">Home</Link>
                <Link to="/fetch">Fetch</Link>

            </nav>
            <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/fetch" element={<Fetch />} />

            </Routes>
        </Router>
    )
}


export default App