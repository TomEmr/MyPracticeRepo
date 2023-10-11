import "./Movie.css";
import data from "../data.js"
import MovieDeleteButton from "./MovieDeleteButton";
import {useState} from "react";
import DeleteAllMovies from "./DeleteAllMovies";
import ReloadAllMovies from "./ReloadAllMovies";

const Movie = () => {
    const [movies, setMovies] = useState(data)

    const deleteOneMovie = (id) => {
        const filteredMovies = movies.filter((movie) => {
            return movie.id !== id
        })
        setMovies(filteredMovies);
    }

    const deleteAllMovies = () => {
        setMovies([]);
    }

    const reloadAllMovies = () => {
        setMovies(data);
    }

    return (
        <section>
            <div className="all-movies">
                {
                    movies.map((oneMovie) => {
                        const {id, image, title, age, tags, description} = oneMovie
                        return <div className="movie" key={id}>
                            <img src={image} alt=""/>
                            <h2>{title}</h2>
                            <p>{age}</p>
                            <p>{tags}</p>
                            <p>{description}</p>
                            <MovieDeleteButton deleteMovie={() => {
                                deleteOneMovie(id)
                            }}/>
                        </div>
                    })
                }
            </div>
            <div className="button-box">
                <DeleteAllMovies deleteAllMovies={deleteAllMovies}/>
                <ReloadAllMovies reloadAllMovies={reloadAllMovies}/>
            </div>
        </section>
    )
}


export default Movie;