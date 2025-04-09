var sym1=Symbol();
var sym2=Symbol();
console.log(sym1===sym2); // false

var sym3=Symbol("설명");
var sym4=Symbol("설명");
console.log(sym3===sym4); // false

console.log(sym3.description); // 설명
console.log(sym4.description); // 설명


// 리터럴 객체{}를 생성해수 추후에 동적으로 프로퍼티를 추가 및 제거할 수 있다
// [] 는 객체의 속성에 접근 또는 없으면 추가하는 개념
var obj={};
obj['일반속성']='일반'
obj[sym3]="값1";
obj[sym4]="값2";

console.log(obj); // { 일반속성: '일반', [Symbol(설명)]: '값1', [Symbol(설명)]: '값2' }

console.log(obj[sym3]); // 일반

// 숨겨진 프로퍼티
var hidden=Symbol('숨겨진 프로퍼티');
obj[hidden]='숨겨진 값';
obj['name']='이름';
console.log(obj); // { 일반속성: '일반', [Symbol(설명)]: '값1', [Symbol(설명)]: '값2', name: '이름' }
console.log(obj[hidden]); // 숨겨진 값
console.log(Object.keys(obj)); // Object.keys의 매개변수에 던져진 객체의 프로퍼티를 추출해서 보여주는 함수