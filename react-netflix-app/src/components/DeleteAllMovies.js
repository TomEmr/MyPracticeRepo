
const DeleteAllMovies = (props) => {
    return (
        <div>
            <button className="main-delete-button" onClick={props.deleteAllMovies}>Delete All Movies</button>
        </div>
    )
}
export default DeleteAllMovies;