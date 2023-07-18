"use client";
import React from 'react';

function App() {

    const html = " <!DOCTYPE html> <html> <head>     <title>Tic Tac Toe</title>     <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"> </head> <body>     <h1>Tic Tac Toe</h1>     <div id=\"board\">         <div class=\"row\">             <div class=\"cell\" onclick=\"makeMove(0, 0)\"></div>             <div class=\"cell\" onclick=\"makeMove(0, 1)\"></div>             <div class=\"cell\" onclick=\"makeMove(0, 2)\"></div>         </div>         <div class=\"row\">             <div class=\"cell\" onclick=\"makeMove(1, 0)\"></div>             <div class=\"cell\" onclick=\"makeMove(1, 1)\"></div>             <div class=\"cell\" onclick=\"makeMove(1, 2)\"></div>         </div>         <div class=\"row\">             <div class=\"cell\" onclick=\"makeMove(2, 0)\"></div>             <div class=\"cell\" onclick=\"makeMove(2, 1)\"></div>             <div class=\"cell\" onclick=\"makeMove(2, 2)\"></div>         </div>     </div>     <button onclick=\"resetBoard()\">Reset</button>      <script src=\"script.js\"></script> </body> </html> ";
    const css = " body {     text-align: center; }  h1 {     margin-top: 50px; }  #board {     display: inline-block;     margin-top: 50px; }  .row {     display: flex; }  .cell {     width: 100px;     height: 100px;     border: 1px solid black;     display: flex;     align-items: center;     justify-content: center;     font-size: 40px;     cursor: pointer; }  button {     margin-top: 20px;     font-size: 20px; } ";
    const js = " let currentPlayer = 'X'; let board = [     ['', '', ''],     ['', '', ''],     ['', '', ''] ];  function makeMove(row, col) {     if (board[row][col] === '') {         board[row][col] = currentPlayer;         document.getElementById('board').children[row].children[col].innerText = currentPlayer;         if (checkWin()) {             alert(currentPlayer + ' wins!');             resetBoard();         } else if (checkDraw()) {             alert('It\\'s a draw!');             resetBoard();         } else {             currentPlayer = currentPlayer === 'X' ? 'O' : 'X';         }     } }  function checkWin() {     for (let i = 0; i < 3; i++) {         if (board[i][0] !== '' && board[i][0] === board[i][1] && board[i][1] === board[i][2]) {             return true;         }         if (board[0][i] !== '' && board[0][i] === board[1][i] && board[1][i] === board[2][i]) {             return true;         }     }     if (board[0][0] !== '' && board[0][0] === board[1][1] && board[1][1] === board[2][2]) {         return true;     }     if (board[0][2] !== '' && board[0][2] === board[1][1] && board[1][1] === board[2][0]) {         return true;     }     return false; }  function checkDraw() {     for (let i = 0; i < 3; i++) {         for (let j = 0; j < 3; j++) {             if (board[i][j] === '') {                 return false;             }         }     }     return true; }  function resetBoard() {     currentPlayer = 'X';     board = [         ['', '', ''],         ['', '', ''],         ['', '', '']     ];     let cells = document.getElementsByClassName('cell');     for (let i = 0; i < cells.length; i++) {         cells[i].innerText = '';     } } ";

    const content = html.replace('</head>', `<style>${css}</style></head>`).replace('</body>', `<script>${js}</script></body>`);

    const openInNewWindow = () => {

        let newWindow: Window | null = window.open('', '_blank');
        if (newWindow) {
            let iFrame = newWindow.document.createElement('iframe');
            iFrame.srcdoc = content;
            iFrame.style.width = '95%';
            iFrame.style.height = '95%';
            iFrame.sandbox.add('allow-scripts', 'allow-popups', 'allow-same-origin', 'allow-modals');
            newWindow.document.body.appendChild(iFrame);
        }
    }

    return (
        <div>
            <button onClick={openInNewWindow}>Please Lucky save us!</button>
        </div>
    );
}

export default App;

// const UseRefExample = () => {
//     const inputRef = React.useRef<HTMLInputElement>(null);
//     const usernameInputRef = React.useRef<HTMLInputElement>(null);
//
//     useEffect(() => {
//         inputRef.current?.focus();
//
//     },[]);
//
//     const handleClick = (e: React.MouseEvent<HTMLButtonElement>) => {
//         e.preventDefault();
//         console.log("Username is " + usernameInputRef.current?.value);
//     }
//     return (
//         <div className="useRefExample">
//             <input type="text" ref={inputRef} placeholder="focus here"/>
//             <input type="text" ref={usernameInputRef} placeholder="username"/>
//             <button onClick={handleClick}>Send</button>
//         </div>
//
//     )
// }
//
// export default UseRefExample;
// const UseContextExample = () => {
//     const {state, dispatch} = React.useContext(ThemeContext);
//
//     console.log(state)
//     return (
//         <div className="useContextExample">
//             <button onClick={()=>dispatch({type:"CHANGE_THEME"})}>Change Theme</button>
//             <button onClick={()=>dispatch({type:"CHANGE_FONTSIZE", payload: 20})}>Change Font Size</button>
//         </div>
//
//     )
// }
//
// export default UseContextExample;
// type UserType = {
//     sessionId: number;
//     name: string;
// }
// const UseStateExample = () => {
//     const [username, setUsername] = React.useState("");
//     const [user, setUser] = React.useState <UserType | null>(null);
//
//     const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
//         setUsername(e.target.value);
//     }
//
//     const handleClick = (e: React.MouseEvent<HTMLButtonElement>) => {
//         e.preventDefault();
//         setUser({
//             name: username,
//             sessionId: Math.random() * 1000
//         })
//     }
//     return (
//         <div className="useStateExample">
//             {user ? (`${user.name} logged in`) : (<form>
//                 <input type="text" placeholder="Username" onChange={handleChange}/>
//                 <button onClick={handleClick}>Login</button>
//             </form>)}
//         </div>
//     );
// }
//
// export default UseStateExample;

// const EventExample = () => {
//     const handleChange = (e: React.ChangeEvent<HTMLInputElement>) => {
//         console.log(e.target.value);
//     };
//
//     const handleClick = (e: React.MouseEvent<HTMLButtonElement>) => {
//         e.preventDefault();
//         console.log("Searched!");
//     };
//
//     const handleDelete = (e: React.MouseEvent<HTMLButtonElement>, id: number) => {
//         e.preventDefault();
//         console.log(`Post ${id} has been deleted!`);
//     };
//
//     return (
//         <div className="eventExample">
//             <form>
//                 <input
//                     type="text"
//                     placeholder="Search for anything..."
//                     onChange={handleChange}
//                 />
//                 <button onClick={handleClick}>Search</button>
//             </form>
//             <form className="post">
//                 <h1>Lorem ipsum dolor sit amet consectetur 1</h1>
//                 <p>
//                     Lorem ipsum dolor sit amet consectetur adipisicing elit. Sequi ullam
//                     voluptate quisquam voluptatibus magni voluptatum quasi eveniet totam
//                     harum neque itaque, eum reprehenderit non repellendus? Assumenda
//                     necessitatibus distinctio veniam eveniet.
//                 </p>
//                 <button onClick={(e) => handleDelete(e, 1)}>Delete</button>
//             </form>
//             <form className="post">
//                 <h1>Lorem ipsum dolor sit amet consectetur 2</h1>
//                 <p>
//                     Lorem ipsum dolor sit amet consectetur adipisicing elit. Sequi ullam
//                     voluptate quisquam voluptatibus magni voluptatum quasi eveniet totam
//                     harum neque itaque, eum reprehenderit non repellendus? Assumenda
//                     necessitatibus distinctio veniam eveniet.
//                 </p>
//                 <button onClick={(e) => handleDelete(e, 2)}>Delete</button>
//             </form>
//         </div>
//     );
// };
//
// export default EventExample;

// const ChildrenPropExample = () => {
//     return (
//         <div>
//             <Parent>
//                 <SecondChild/>
//             </Parent>
//         </div>
//     )
// }
//
// export default ChildrenPropExample;


// example 1 pro vylistování postu z jsonplaceholder
// const Page = () => {
//     return <div className="page">
//         <PostList />
//     </div>;
// }
// export default Page;