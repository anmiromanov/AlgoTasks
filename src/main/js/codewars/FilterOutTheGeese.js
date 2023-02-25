//https://www.codewars.com/kata/57ee4a67108d3fd9eb0000e7/train/javascript
function gooseFilter(birds){
    var geese = ["African", "Roman Tufted", "Toulouse", "Pilgrim", "Steinbacher"];
    let result = [];
    for (let item of birds){
        if (!geese.includes(item)){
            result.push(item);
        }
    }
    return result;
}

console.log(gooseFilter(["Mallard", "Hook Bill", "African", "Crested", "Pilgrim", "Toulouse", "Blue Swedish"]));