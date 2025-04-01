// 함수, 배열, 정규식 등은 모두 객체이다. 
var name='홍씨';
var age=10;

var student={
    // 속성 프로퍼티
    name: '유관순',
    age: 16,

    // 기능 프로퍼티
    // 속성의 값이 함수인 프로퍼티는 '메소드'이다.
    // 메소드 안에서는 this.을 반드시 쓰자. 사용하지 않으면 전역 변수가 나올 수 있음(에러 잡기 힘듬)
    getInfo:function(){ // 무기명 함수는 프로퍼티에 할당되어 기명함수가 된다.
        console.log(this); // this는 student를 가리킨다.
        return `${this.name}은 ${this.age}세입니다.`;       // this는 메소드가 포함된 객체
    }
}

console.log('student',student)
console.log('student.name',student.name)
console.log('student.age',student.age)
console.log('student.getInfo()',student.getInfo())  // 메소드는 접근하면 소괄호를 통해 실행 가능

console.log(this);