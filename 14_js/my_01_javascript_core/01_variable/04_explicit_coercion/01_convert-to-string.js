// 1. String 생성자 함수를 new 연산자 없이 호출하는 방법
console.log(String(10)); // 10
console.log(String(NaN));
console.log(String(Infinity));
console.log(String(true)); // true
console.log(String(false)); // false

// 2. Object.prototype.toString() 메서드를 호출하는 방법
console.log((10).toString()); // 10
console.log(NaN.toString()); // NaN
console.log(Infinity.toString()); // Infinity
console.log(true.toString()); // true
console.log(false.toString()); // false