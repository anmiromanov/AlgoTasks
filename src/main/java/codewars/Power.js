//https://www.codewars.com/kata/562926c855ca9fdc4800005b/train/javascript
function numberToPower(number, power){
    let result = 1;
    let count = 0;
    while (power > count){
        result = result * number;
        count++;
    }
    return result;
}

//console.log(numberToPower(4, 2));
//console.log(numberToPower(10, 4));
//console.log(numberToPower(10, 0));