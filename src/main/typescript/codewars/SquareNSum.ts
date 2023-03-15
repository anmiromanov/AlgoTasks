//https://www.codewars.com/kata/515e271a311df0350d00000f/train/typescript
export function squareSum(numbers: number[]):number {
    let result: number = 0;
    for (let item of numbers){
        result += item*item;
    }
    return result;
}

console
console.log(squareSum([1,2]));
console.log(squareSum([0, 3, 4, 5]));
console.log(squareSum([]));