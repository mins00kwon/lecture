// data-type은 값의 종류를 말하며, 자바스크립트(ES6)는 7개의 데이터타입을 제공한다
// - Number, string, boolean, undefined, null, object, symbol

// 정수, 싨, 음수 모두 숫자(number) 타입이다.
// 내부적으로는 모두 실수로만 인식됨

var integer=10;
var double=5.5;
var negative=-5;

console.log(typeof integer); // number
console.log(typeof double); // number
console.log(typeof negative); // number

console.log(10/3); // 3.3333333333333335
console.log(10/-0); // Infinity
console.log(1*'문자열');
console.log("문자열");
