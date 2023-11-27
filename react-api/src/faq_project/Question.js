import {useState} from "react";

const Question = ({title, info}) => {

    const [showInfo, setShowInfo] = useState(false);
    const toggleInfo = () => {
        setShowInfo(!showInfo);
    }

    return (
        <div className="question">
            <section>
                <h2>{title}</h2>
                <button onClick={toggleInfo}>Answer</button>
            </section>
            {showInfo && <p>{info}</p>}
        </div>
    )
}
export default Question;