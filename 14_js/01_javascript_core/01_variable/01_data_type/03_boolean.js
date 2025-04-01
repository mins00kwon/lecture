// var 형태의 변수는 같은 지역에 중복 선언 가능
// 세미콜론은 ASI(Automatic Semicolon Insertion)로 인해 생략 가능
// 하지만 믿지 말고 수동으로 작성하는 것이 좋음 


var flag=true;
console.log(flag); // true
var flag=false;
console.log(flag); // false

console.log(typeof flag); // boolean