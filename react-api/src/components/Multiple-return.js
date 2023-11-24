import {useState, useEffect} from 'react';

const MultipleReturn = () => {

    const url = 'http://api.open-notify.org/iss-now.json';

    const [loading, setLoading] = useState(true);
    const [latitude, setLatitude] = useState('');
    const [longitude, setLongitude] = useState('');

    useEffect(() => {
        fetch(url)
            .then((response) => response.json())
            .then((data) => data['iss_position'])
            .then((position) => {
                setLatitude(position['latitude']);
                setLongitude(position['longitude']);
            })
        setLoading(false);
    }, [])

    return (
        <div>
            {loading ? <h1>Loading...</h1> : <div>
                <h1>Multiple Return</h1>
                <h2>Latitude: {latitude}</h2>
                <h2>Longitude: {longitude}</h2>
            </div>}
        </div>
    )
}
export default MultipleReturn;