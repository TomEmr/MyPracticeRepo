var uniqueInOrder=function(iterable){
    // proměná result je prázdné pole
    let result = [];
    // procházíme vstupní array
    for (let i = 0; i < iterable.length; i++) {
        // pokud je prvek na indexu i různý od prvku na indexu i + 1
        if (iterable[i] !== iterable[i + 1]) {
            // pushujeme prvek na indexu i do výsledného pole
            result.push(iterable[i]);
        }
    }
    return result;
}

console.log(uniqueInOrder('AAAABBBCCDAABBB'));
console.log(uniqueInOrder('ABBCcAD'));
console.log(uniqueInOrder([1,2,2,3,3]));



// Implement the function unique_in_order which takes as argument a sequence and returns a list of items without any
// elements with the same value next to each other and preserving the original order of elements.

//     For example:
// iniqueInOrder('AAAABBBCCDAABBB') == ['A', 'B', 'C', 'D', 'A', 'B']
// uniqueInOrder('ABBCcAD')         == ['A', 'B', 'C', 'c', 'A', 'D']
// uniqueInOrder([1,2,2,3,3])       == [1,2,3]

