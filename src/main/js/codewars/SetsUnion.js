//https://www.codewars.com/kata/5884ce61f36b6d738b000053/train/javascript
function union(s1, s2){
    let union = new Set(s1);
    for (let item of s2){
        union.add(item);
    }
    return union;
}