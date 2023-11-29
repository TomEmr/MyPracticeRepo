import {useState} from 'react';
const BasicForm = () => {
    const [firstName, setFirstName] = useState('');
    const [lastName, setLastName] = useState('');
    const [emailAddress, setEmailAddress] = useState('');
    const [password, setPassword] = useState('');

    const handleSubmit = (event) => {
        event.preventDefault();
        const formData = new FormData(event.target);
        const data = Object.fromEntries(formData.entries());
        console.log(data);
        setFirstName('');
        setLastName('');
        setEmailAddress('');
        setPassword('');
    };
    return (
        <article className="basic-form">
            <form onSubmit={handleSubmit}>
                <label htmlFor="firstName">First Name</label>
                <input
                    type="text"
                    id="firstName"
                    name="firstName"
                    value={firstName}
                    onChange={(event) => setFirstName(event.target.value)}
                />
                <label htmlFor="lastName">Last Name</label>
                <input
                    type="text"
                    id="lastName"
                    name="lastName"
                    value={lastName}
                    onChange={(e) => setLastName(e.target.value)}/>
                <label htmlFor="email">Email</label>
                <input
                    type="email"
                    id="email"
                    name="email"
                    value={emailAddress}
                    onChange={(e) => setEmailAddress(e.target.value)}
                />
                <label htmlFor="password">Password</label>
                <input
                    type="password"
                    id="password"
                    name="password"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                />
                <input type="submit" value="Submit"/>
            </form>
        </article>
    )
}
export default BasicForm;