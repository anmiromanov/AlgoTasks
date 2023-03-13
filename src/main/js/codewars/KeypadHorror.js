//https://www.codewars.com/kata/5572392fee5b0180480001ae/train/javascript
function computerToPhone(number){
    if (number.length < 1){
        console.log("if!!!")
        return '';
    } else {
        const compyter = [0, 7, 8, 9, 4, 5, 6, 1, 2, 3];
        const phone = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0];
        let input = number.split('');
        let result = "";
        for (let item of input) {
            let index = compyter.indexOf(Number(item));
            let element = phone[index];
            result = result + index;
        }
        return result;
    }
}

console.log(computerToPhone("0789456123"));
console.log(computerToPhone("000"));
console.log(computerToPhone("94561"));
console.log(computerToPhone(""));