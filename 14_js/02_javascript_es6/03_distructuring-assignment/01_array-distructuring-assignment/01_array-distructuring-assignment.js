// 배열 구조 분해 할당

let nameArr=['길동','홍'];
// let firstName=nameArr[0]; // 첫 번째 요소
// let lastName=nameArr[1]; // 두 번째 요소

let [firstName,lastName]=nameArr; // 배열 구조 분해 할당(해당 인덱스 위치의 변수에 대입됨)
// nameArr[0]과 nameArr[1]을 각각 firstName과 lastName에 할당

console.log('firstName:',firstName); // firstName: 길동
console.log('lastName:',lastName); // lastName: 홍

let name='Saimdang Shin';
let [firstName2, lastName2]=name.split(' '); // split() 메서드를 사용하여 문자열을 배열로 변환한 후 구조 분해 할당
lastName2.log(); // Shin
let [firstName3, lastName3]=name.mathch(/[a-z]+/gi); // 정규 표현식을 사용하여 문자열을 배열로 변환한 후 구조 분해 할당
firstName3.log(); // Saimdang
lastName3.log(); // Shin