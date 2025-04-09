// 단축 평가 구문
// 논리 연산의 결과를 결정지을 항이 남는다.
// 1. OR의 경우
console.log('apple'||'banana'); // apple
console.log(''||'banana'); // banana
console.log('apple'||false); // apple
console.log(true||'banana'); // true

// 2. AND의 경우
console.log('apple'&&'banana'); // banana
console.log('apple'&&''); // ''
console.log(false&&'banana'); // false
console.log('apple'&&true); // true

// 3. 단축 평가 구문
var num=3;
num%2==0 && console.log('짝수입니다.');     // && 연산자의 왼쪽 조건식이 true면 오른쪽 조건식이 실행된다.
num%2==0 || console.log('홀수입니다.');     // || 연산자의 왼쪽 조건식이 false면 오른쪽 조건식이 실행된다

// if(num%2==0) {
//     console.log('짝수입니다.');
// }
// else {
//     console.log('홀수입니다.');
// }