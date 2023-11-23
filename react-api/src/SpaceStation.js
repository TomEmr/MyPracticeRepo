import {useEffect} from 'react';
import {useState} from 'react';

const SpaceStation = () => {

    const url = 'http://api.open-notify.org/iss-now.json';

    const [longitude, setLongitude] = useState('');
    const [latitude, setLatitude] = useState('');
    const [map, setMap] = useState('');
    const getCoordinates = async () => {
        const response = await fetch(url);
        const data = await response.json();
        setLongitude(data['iss_position']['longitude']);
        setLatitude(data['iss_position']['latitude']);
    }

    useEffect(() => {
        getCoordinates();
    }, []);

    useEffect(() => {
        if (longitude && latitude) {
            setMap(`https://mapy.cz/zakladni?x=${longitude}&y=${latitude}&z=11`);
        }
    }, [longitude, latitude]);

    return (
        <div>
            <h1>Space Station</h1>
            <h3>Coordinates</h3>
            <br/>
            <p>Latitude: {latitude} </p>
            <p>Longitude: {longitude} </p>
            <br/>
            <a href={map} target="_blank">Map</a>
        </div>
    )
}
export default SpaceStation;