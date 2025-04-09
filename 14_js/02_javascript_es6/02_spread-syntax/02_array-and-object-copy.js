// 스프레드 문법을 활용한 배열 및 객체 복사
// 1. 배열 복사
let arr=[10,40,80];
let arrCopy=[...arr]; // 스프레드 문법을 사용하여 배열 복사
console.log(arr);
console.log(arrCopy); // [10, 40, 80]
console.log(arr===arrCopy); // false

// 2. 객체 복사
let obj={
    name:'홍길동',
    age:20,
    address:'서울시',
    hobbies:['독서','영화감상']
};

let objCopy={...obj}; // 스프레드 문법을 사용하여 객체 복사
console.log(obj);
console.log(objCopy); // { name: '홍길동', age: 20, address: '서울시', hobbies: [ '독서', '영화감상' ] }
console.log(obj===objCopy); // false

// 객체 내부에 추가적인 객체들(객체 또는 배열)이 있을 경우 완벽한 복사를 위해서 추가적으로 작업해 주어야 한다.
console.log(objCopy.hobbies===obj.hobbies); // true // 얕은 복사로 인해 참조가 동일하기 때문에 같은 주소를 가리킴
objCopy.hobbies=[...obj.hobbies];
console.log(objCopy.hobbies===obj.hobbies); // false

let classNum=30;                // 추가
let name='강감찬';                // 수정

// 프로퍼티 값 단축 문법 + 스프레드 문법
let newObj={classNum,...obj,name};  // 수정해야할 프로퍼티는 뒤에 위치시켜야 한다. (순서에 유의)
console.log(newObj); // { classNum: 30, name: '강감찬', age: 20, address: '서울시', hobbies: [ '독서', '영화감상' ] }