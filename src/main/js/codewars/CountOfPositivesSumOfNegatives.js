//https://www.codewars.com/kata/576bb71bbbcf0951d5000044/train/javascript

function countPositivesSumNegatives(input){
    let countOfPositives = 0;
    let sumOfNegatives = 0;
    if (input == null || input.length === 0){
        return [];
    } else {
        for (let item of input){
            item > 0 ? countOfPositives++ : sumOfNegatives = sumOfNegatives + item;
        }
        return [countOfPositives, sumOfNegatives];
    }
}

console.log(countPositivesSumNegatives([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15]));
console.log(countPositivesSumNegatives([0, 2, 3, 0, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14]));