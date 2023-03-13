//https://www.codewars.com/kata/55f2b110f61eb01779000053/train/javascript
function getSum(a, b){
    let arr = [];
    let current = a;

    if (a <= b){
        while (current <= b){
            arr.push(current);
            current += 1;
        }
    } else {
        while (current >= b){
            arr.push(current);
            current -= 1;
        }
    }

    let sum = 0;
    for (let item of arr){
        sum = sum + item;
    }
    return sum;
}

console.log(getSum(0, -1));
console.log(getSum(0, 1));
console.log(getSum(2, 2));