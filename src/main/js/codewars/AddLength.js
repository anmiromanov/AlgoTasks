//https://www.codewars.com/kata/559d2284b5bb6799e9000047/train/javascript
function addLength(str){
    let resultArr = [];
    for (let item of str.split(' ')){
        resultArr.push(item + ' ' + item.length);
    }
    return resultArr;
}

console.log(addLength('you will win'));