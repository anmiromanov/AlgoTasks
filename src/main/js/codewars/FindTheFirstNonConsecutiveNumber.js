//https://www.codewars.com/kata/58f8a3a27a5c28d92e000144/train/javascript
function firstNonConsecutive(arr){
    let index = undefined;
    for (i = 0; i < arr.length; i++){
        let current = arr[i];
        let next = arr[i + 1];
        if ((next - current) !== 1){
            index = arr[i + 1];
            break;
        }
    }
    return index;
}

console.log(firstNonConsecutive([1,2,3,4,6,7,8]));
console.log(firstNonConsecutive([1,2,3,4]));