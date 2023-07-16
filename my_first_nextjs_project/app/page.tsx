"use client";
import PostList from "@/components/posts/PostList";
import React, {useEffect} from "react";
import Parent from "@/components/children/Parent";
import Child from "@/components/children/Child";
import SecondChild from "@/components/children/SecondChild";
import {ThemeContext} from "@/context/ThemeContext";

const UseRefExample = () => {
    const inputRef = React.useRef<HTMLInputElement>(null);
    const usernameInputRef = React.useRef<HTMLInputElement>(null);

    useEffect(() => {
        inputRef.current?.focus();

    },[]);

    const handleClick = (e: React.MouseEvent<HTMLButtonElement>) => {
        e.preventDefault();
        console.log("Username is " + usernameInputRef.current?.value);
    }
    return (
        <div className="useRefExample">
            <input type="text" ref={inputRef} placeholder="focus here"/>
            <input type="text" ref={usernameInputRef} placeholder="username"/>
            <button onClick={handleClick}>Send</button>
        </div>

    )
}

export default UseRefExample;
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