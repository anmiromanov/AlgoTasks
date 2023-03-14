//https://www.codewars.com/kata/582aafca2d44a4a4560000e7
function keepOrder(ary, val){
    let result = 0;
    for (let item of ary){
        if (item < val){
            result++;
        }
    }
    return result;
}

console.log(keepOrder([1, 2, 3, 4, 7], 5));   //4
console.log(keepOrder([1, 2, 3, 4, 7], 0));
console.log(keepOrder([1, 1, 2, 2, 2], 2));
console.log(keepOrder([1, 2, 3, 4], 5));
console.log(keepOrder([1, 2, 3, 4], -1));