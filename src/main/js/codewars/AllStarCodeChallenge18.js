//https://www.codewars.com/kata/5865918c6b569962950002a1/javascript
function strCount(str, letter){
    let charCount = 0;
    for (i = 0; i < str.length; i++){
        if (str.at(i) === letter){
            charCount++;
        }
    }
    return charCount;
}

console.log(strCount("Hello", "o"));
console.log(strCount("Hello", "l"));
console.log(strCount("", "z"));