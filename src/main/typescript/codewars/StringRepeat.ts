//https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/train/typescript
export function repeatStr(n:number, s:string):string {
    let result:string = '';
    for (let i = 1; i<=n; i++){
        result = result + s;
    }
    return result;
}

console.log(repeatStr(3, "*"));