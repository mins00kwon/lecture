// 스프레드 연산자, (=전개 문법)
let arr=[10,30,20];
console.log(arr); // [ 10, 30, 20 ]
console.log(...arr); // 10 30 20

console.log(`가장 큰 값: ${Math.max(...arr)}`); // 가장 큰 값: 30
console.log(`가장 큰 값: ${Math.max(10,20,30)}`); // 가장 큰 값: 30

// 배열을 결합(concat)해서 하나의 배열로 만듦
let arr1=[10,30,20];
let arr2=[100,200,300];

console.log([...arr1, ...arr2]); // [ 10, 30, 20, 100, 200, 300 ]
console.log([10,...arr1,-1,...arr2]);