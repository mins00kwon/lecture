// 자바스크립트 엔진은 boolean 타입이 아닌데도 true로 판달될 값을 Truthy값
// 또는 false로 판단될 값을 Falsy 값으로 구분하고
// Truthy값은 true로 변환하고
// Falsy 값은 false로 변환한다

if(true) console.log('if(true)'); // if문은 true로 변환
if(false) console.log('if(false)'); // if문은 false로 변환
if(undefined) console.log('if(undefined)'); // if문은 undefined로 변환
if(null) console.log('if(null)'); // if문은 null로 변환
if(0) console.log('if(0)'); // if문은 0으로 변환
if(NaN ) console.log('if(NaN)'); // if문은 NaN으로 변환
if('') console.log('if("")'); // if문은 ''로 변환
if(' ') console.log('if(" ")'); // if문은 ' '로 변환
if('JavaScript') console.log('if("JavaScript")'); // if문은 'JavaScript'로 변환