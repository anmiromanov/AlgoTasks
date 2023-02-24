//https://www.codewars.com/kata/515e271a311df0350d00000f/train/javascript
function squareSum(numbers){
    let result = 0;
    for (i =0; i < numbers.length; i++){
        let x = numbers.at(i);
        result = result + x * x;
    }
    return result;
}

console.log(squareSum([1,2]));
console.log(squareSum([0,3,4,5]));
console.log(squareSum([]));