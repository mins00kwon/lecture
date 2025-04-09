// 다양한 사용법
let user={};
[user.firstName,user.lastName]='Gwanghoon Lee'.split(' ');
console.log(user);

// rest 연산자
let [first, second,...rest]=['양자리','황소자리','쌍둥이자리','게자리','사자자리','처녀자리','천칭자리','전갈자리','사수자리','염소자리','물병자리','물고기자리'];
console.log(first);
console.log(second);
console.log(rest);      // 나머지 요소들은 배열로 받아낼 수 있다.

// 배열 구조분해 할당을 활용한 변수 교환
let student='유관순';
let teacher='홍길동';
[student,teacher]=[teacher,student]; // 배열 구조분해 할당을 활용한 변수 교환
console.log(student); // 홍길동
console.log(teacher); // 유관순

// 기본 값을 설정하고 사용할 수 있다.
let [firstName2='아무개',lastName2='김']=['길동'];
console.log('firstName2',firstName2)
console.log('lastName2',lastName2)