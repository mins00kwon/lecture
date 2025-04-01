var str="안녕하세요";
console.log(typeof str); // string
console.log(str);

// 백틱 (``)을 사용하면 여러 줄의 문자열을 작성할 수 있다.
var str2= `안녕하세요. 
반갑습니다.`;
console.log(str2); 
// 문자열은 홑따옴표 또는 쌍따옴표 모두 사용 가능

// Template Literal
// 표현식 삽입(${}, Template Literal)과 백틱 (``)을 사용하여 
// 가독성도 챙기고, 문자열을 쉽게 작성할 수 있다.
var lastName="길동";
var firstName="홍";
console.log(`제 이름은 ${lastName}${firstName}입니다.`); // 안녕하세요. 길동홍입니다.
console.log('제 이름은'+ lastName + firstName + '입니다.'); // 안녕하세요. 길동홍입니다.