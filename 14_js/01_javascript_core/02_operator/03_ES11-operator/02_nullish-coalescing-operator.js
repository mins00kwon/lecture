// null 병합 연산자

var test=null ?? '기본값';
console.log('test',test)        // console.log는 매개변수를 두개 이상 쓰면 중간에 띄어쓰기를 포함해서 문자열을 이어붙임


// null 병합 연산자
// 좌항의 피연산자가 null 이거나 undefined라면 우항의 결과가 남고(함수면 실행)
// 그렇지 않으면 좌항이 남는다(함수면 실행)
var value1='' || '기본값';
var value2='' ?? '기본값';
value1.log('value1',value1)        // console.log는 매개변수를 두개 이상 쓰면 중간에 띄어쓰기를 포함해서 문자열을 이어붙임
value2.log('value2',value2)        // console.log는 매개변수를 두개 이상 쓰면 중간에 띄어쓰기를 포함해서 문자열을 이어붙임