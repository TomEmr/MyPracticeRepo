let variable = 'Hello World';
console.log(variable);

let ageWithType: number;
ageWithType = 30;

let testString:string

testString = 'Hello World';

let testStringOrNumber: string | number;

testStringOrNumber = 'Hello World';
testStringOrNumber = 30;

let names = ['Max', 'Anna', 'Chris'];

names.push("mike")

console.log(names)

let testStringArray: string[]
testStringArray = ['Hello', 'World']

let testNumberArray: number[]
testNumberArray = [1, 2, 3]

let testStringOrNumberArray: (string | number)[]
testStringOrNumberArray = [1, 2, 3, 'Hello', 'World']

let user = {
    name: 'Max',
    age: 30,
    isAdmin: false
}

user.name = 'Jane'
user.age = 20
user.isAdmin = true

let userObj : {
    name: string,
    age: number,
    isAdmin: boolean
    phone?: string
}

userObj = {
    name: 'Max',
    age: 30,
    isAdmin: false,
    phone: '123-456-7890'
}

let testAny: any;

testAny = 'Hello World'
testAny = 30
testAny = true
testAny = ['Hello', 'World']
testAny = {}

let testAnyArray: any[]
testAnyArray = ['Hello', 'World', 30, true, {}, []]

let sayHi = () => {
    console.log('Hi')
}

let functionReturnString = () : string => {
    return 'Hello World'
}

let sum = (num1: number, num2: number, another?:number)  => {
    return num1 + num2
}

sum(1, 2)
sum(1, 2, 3) // another is optional

let fun = (user:{username:string, age:number, phone?:string}) => {
    console.log(user.username)
    console.log(user.age)
    console.log(user.phone)
}

// TYPE ALIAS
type UserType = {
    username: string,
    age: number,
    phone?: string
}
let fun2 = (user:UserType) => {
    console.log(user.username)
    console.log(user.age)
    console.log(user.phone)
}

type myFunction = (a:number, b:string) => void

let fun3: myFunction = (a, b) => {
    console.log(a + "times" + b)
}

type UserType2 = {
    username: string,
    age: number,
    phone?: string
    theme: "dark" | "light"
}

const userWithTheme: UserType2 = {
    username: 'Max',
    age: 30,
    theme: 'dark'
}

//INTERFACE
interface UserInterface {
    username: string,
    email: string,
    age: number,
    phone?: string
}

interface employeeInterface extends UserInterface {
    employeeID: number
}

const emp : employeeInterface = {
    username: 'Max',
    email: 'mail',
    age: 30,
    employeeID: 123
}
console.log(emp)

