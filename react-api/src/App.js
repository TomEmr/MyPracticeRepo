import {BrowserRouter as Router, Routes, Route, Link} from 'react-router-dom';
import Fetch from "./components/Fetch";
import Home from "./components/Home";
import SpaceStation from "./components/SpaceStation";
import MultipleReturn from "./components/Multiple-return";
import './index.css';
import Movie from "./components/Movie";

const App = () => {

    return (
        <div className="app-container">
            <Router>
                <nav>
                    <Link to="/">Home</Link>
                    <Link to="/fetch">Fetch</Link>
                    <Link to="/space-station">Space Station</Link>
                    <Link to="/multiple-return">Multiple Return</Link>
                    <Link to="/movie">Movie</Link>

                </nav>
                <Routes>
                    <Route path="/" element={<Home/>}/>
                    <Route path="/fetch" element={<Fetch/>}/>
                    <Route path="/space-station" element={<SpaceStation/>}/>
                    <Route path="/multiple-return" element={<MultipleReturn/>}/>
                    <Route path="/movie" element={<Movie/>}/>

                </Routes>
            </Router>
        </div>
    )
}
export default App