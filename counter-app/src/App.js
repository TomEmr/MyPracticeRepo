import DecreaseButton from "./components/DecreaseButton";
import IncreaseButton from "./components/IncreaseButton";
import ResetButton from "./components/ResetButton";
import { useState } from "react";
import "./index.css";

const App = () => {
    const [value, setValue] = useState(0);

    const increaseValue = () => {
        const newValue = value + 1;
        setValue(newValue);
    }

    const decreaseValue = () => {
        const newValue = value - 1;
        setValue(newValue);
    }

    const resetValue = () => {
        setValue(0);
    }

    return (
        <div className="counter">
            <h1>Counter App</h1>
            <h2> {value}</h2>
            <IncreaseButton increase={increaseValue}/>
            <DecreaseButton decrease={decreaseValue}/>
            <ResetButton resetValue={resetValue}/>
        </div>
    )
}
export default App