//https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/javascript
function invert(array){
    let result = [];
    for (let item of array){
        result.push(item * -1);
    }
    return result;
}

console.log(invert([1,2,3,4,5]));
console.log(invert([1,-2,3,-4,5]));
console.log(invert([]));
console.log(invert([0]));