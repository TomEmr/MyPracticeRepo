import "../movie_project/movie.css";
import {useState} from "react";
import allMovies from "../movie_project/allMovies";
import categories from "../movie_project/categories";

const Movie = () => {

    const [movieType, setMovieType] = useState("komedie");

    const movies = allMovies.filter((movie) => movie.category === movieType);

    console.log(movies);

    return (
        <div className="movie-box">
            <h1 className="header">Movies</h1>
            <div className="buttons">
                {categories.map((category, index) => {
                    return (
                        <button className="one-button" key={index} onClick={() => setMovieType(category)}>{category}</button>
                    )
                })}
            </div>
            <div className="allMovies">
                {movies.map((movie) => {
                    return (
                        <div className="movie-card" key={movie.id}>
                            <img src={movie.image} alt={movie.title}/>
                            <h3>{movie.title}</h3>
                            <p>{movie.description}</p>
                            <p>{movie.tags}</p>
                        </div>
                    )
                })}
            </div>
        </div>
    );
}

export default Movie;