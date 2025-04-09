// var 키워드로 선언한 변수는 암묵적으로 undefined로 초기화 된다
// 변수를 선언한 이후 값을 할당하지 않은 변수는 undefined인데,
// 개발자가 의도적으로 변수에 할당하는 것은 본래 취지와 어긋나고 혼란을 줄 수 있으므로 지양한다
// 대신 null을 대입한다.

var undef;
console.log(undef); // undefined
console.log(typeof undef); // undefined

var nullVal='something';
console.log(nullVal); // something
console.log(typeof nullVal); // stringåå
nullVal = null;
console.log(nullVal); // null
console.log(typeof nullVal); // object