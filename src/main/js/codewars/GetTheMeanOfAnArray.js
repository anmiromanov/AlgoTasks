//https://www.codewars.com/kata/563e320cee5dddcf77000158/train/javascript
function getAverage(marks){
    let res = 0;
    for (let item of marks){
        res = res + item;

    }
    return Math.round(res / marks.length);
}

console.log(getAverage([2,2,2,2]));
console.log(getAverage([1,2,3,4,5,]));
console.log(getAverage([1,1,1,1,1,1,1,2]));
console.log(getAverage([1,5,87,45,8,8]));