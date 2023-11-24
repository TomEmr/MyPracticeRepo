import {useState, useEffect} from 'react';

const Fetch = () => {

    const url = 'https://api.kanye.rest/';

    const [quote, setQuote] = useState("original quote");
    const getQuote = async () => {
        const response = await fetch(url);
        const data = await response.json();
        setQuote(data["quote"]);
    }
    useEffect(() => {
        getQuote();
    }, [])

    return (
        <div>
            <h1>App</h1>
            <p>{quote}</p>
        </div>
    )
}
export default Fetch;