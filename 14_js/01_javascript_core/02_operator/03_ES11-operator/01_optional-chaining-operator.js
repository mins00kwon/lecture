// ES11(2020)에 도입된 연산자로, 연산자의 좌항이 null ㄸ지 undefined일 경우
// 에러 대신 undefined를 반환하고
// 그렇지 않으면 우항의 프로퍼티 참조를 이어간다

var obj=null;
var val=obj?.value;                 // NPE(Null Point Exception) 방지 코드
console.log(val); // undefined

// null이나 undefined가 아닌 경우 .으로 접근하다
var str='';
var len=str?.length;               // str이 null이 아니므로 length 프로퍼티 참조
console.log(len); // 0