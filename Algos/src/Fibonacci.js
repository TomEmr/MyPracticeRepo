function fib(n) {
    if (n < 2) {
        return n
    }
    return fib(n - 1) + fib(n - 2)
}

function fibLoop(n) {
    let a = 1, b = 0, c;
    if (n < 2) {
        return n
    }
    for (let i = 0; i < n; i++) {
        c = a + b;
        a = b;
        b = c;
    }
    return b;
}

console.log(fib(9))
console.log(fibLoop(9))