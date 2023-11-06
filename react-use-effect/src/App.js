import {useEffect, useState} from "react";

const App = () => {

    const [windowWidth, setWindowWidth] = useState(window.innerWidth);
    const [height, setHeight] = useState(window.innerHeight);

    useEffect(() => {
        const handleResize = () => setWindowWidth(window.innerWidth);
        window.addEventListener('resize', handleResize);
        return () => {
            window.removeEventListener('resize', handleResize);
        }
    });

    useEffect(() => {
        const handleResize = () => setHeight(window.innerHeight);
        window.addEventListener('resize', handleResize);
        return () => {
            window.removeEventListener('resize', handleResize);
        }
    });

    return (
        <div>
            <h1>Window Width: {windowWidth}</h1>
            <h1>Window Height: {height}</h1>
        </div>
    )
}
export default App;