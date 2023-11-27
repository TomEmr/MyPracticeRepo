import allMovies from "../movie_project/allMovies";
import {useState, useEffect} from "react";
import {FaArrowAltCircleLeft, FaArrowAltCircleRight} from "react-icons/fa";

const OneMovie = () => {
    const [index, setIndex] = useState(0);
    const {id, image, title, description} = allMovies[index];

    const checkNumber = (movieIndex) => {
        if (movieIndex > allMovies.length - 1) {
            return 0;
        }
        if (movieIndex < 0) {
            return allMovies.length - 1;
        }
        return movieIndex;
    }
    const nextMovie = () => {
        setIndex((index) => {
            let newIndex = index + 1;
            return checkNumber(newIndex);
        })
    }
    const prevMovie = () => {
        setIndex((index) => {
            let newIndex = index - 1;
            return checkNumber(newIndex);
        })
    }

    useEffect(() => {
        let slider = setInterval(() => {
            setIndex((index) => {
                let newIndex = index + 1;
                return checkNumber(newIndex);
            })
        }, 4000);
        return () => {
            clearInterval(slider);
        }
    }, []);

    return (
        <div>
            <article key={id} className="review">
                <img src={image} alt={title}/>
                <h4 className="title">{title}</h4>
                <p className="desc">{description}</p>
                <div className="quote-icon">
                    <FaArrowAltCircleLeft className="prev-btn" onClick={prevMovie}/>
                    <FaArrowAltCircleRight className="next-btn" onClick={nextMovie}/>
                </div>
            </article>
        </div>
    )
}
export default OneMovie;