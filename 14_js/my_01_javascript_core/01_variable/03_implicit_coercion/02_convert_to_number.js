console.log(10-'5'); // + 를 제외한 연산의 경우 문자열로 바뀌는게 아니라 숫자로 바뀜
console.log(10*'5');
console.log(10/'5');
console.log(10%'javascript');       // NaN
var isNan=10%'javascript';
console.log(isNan); // NaN
console.log(typeof isNan); // number
console.log(typeof 5);

console.log('양수로 바꿔서 number로 변환');
console.log(+'');
console.log(+'1');
console.log(+'JavaScript');
console.log(+true);
console.log(+false);
console.log(+null);
console.log(+undefined);
// console.log(+Symbol());
console.log(+[]);
console.log(+{});
console.log(+function(){});



console.log(10>'5');

// 빈 문자열, 빈 배열, null, false는 -으로, true는 1로 변환