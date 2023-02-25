//codewars.com/kata/5769b3802ae6f8e4890009d2/train/javascript
function removeEveryOther(arr){
    return arr.filter(i => arr.indexOf(i) % 2 === 0);
}

console.log(removeEveryOther(['Hello', 'Goodbye', 'Hello Again']));
console.log(removeEveryOther([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]));
console.log(removeEveryOther([[1, 2]]));
console.log(removeEveryOther([['Goodbye'], {'Great': 'Job'}]));