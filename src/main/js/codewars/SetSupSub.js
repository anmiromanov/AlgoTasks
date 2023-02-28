//https://www.codewars.com/kata/5885424265fc9c38100017ef/train/javascript

function isSubSetOf(s1, s2){
    let set1 = new Set(s1);
    let set2 = new Set(s2);
    let intersection = new Set();
    for (let item of set1) {
        if (set2.has(item)){
            intersection.add(item);
        }
    }
    return intersection.size == set1.size;
}

function isSupersetOf(s1, s2){
    let set1 = new Set(s1);
    let set2 = new Set(s2);
    let intersection = new Set();
    for (let item of set2){
        if (set1.has(item)){
            intersection.add(item);
        }
    }
    return intersection.size == set2.size;
}

///
console.log(isSubSetOf([1, 2, 3], [3, 2, 1] ));
console.log(isSubSetOf([1, 2, 3], [1, 2, 3, 4, 5] ));