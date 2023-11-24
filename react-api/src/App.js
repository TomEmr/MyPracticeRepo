import {BrowserRouter as Router, Routes, Route, Link} from 'react-router-dom';
import Fetch from "./Fetch";
import Home from "./Home";
import SpaceStation from "./SpaceStation";
import MultipleReturn from "./Multiple-return";
import './index.css';

const App = () => {

    return (
        <div className="app-container">
            <Router>
                <nav>
                    <Link to="/">Home</Link>
                    <Link to="/fetch">Fetch</Link>
                    <Link to="/space-station">Space Station</Link>
                    <Link to="/multiple-return">Multiple Return</Link>

                </nav>
                <Routes>
                    <Route path="/" element={<Home/>}/>
                    <Route path="/fetch" element={<Fetch/>}/>
                    <Route path="/space-station" element={<SpaceStation/>}/>
                    <Route path="/multiple-return" element={<MultipleReturn/>}/>

                </Routes>
            </Router>
        </div>
    )
}
export default App