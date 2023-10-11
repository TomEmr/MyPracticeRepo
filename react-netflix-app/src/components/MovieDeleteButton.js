const MovieDeleteButton = ( props ) => {
    return (
        <button className="movie-delete-button" onClick={props.deleteMovie}>Delete movie</button>
    )
}
export default MovieDeleteButton;