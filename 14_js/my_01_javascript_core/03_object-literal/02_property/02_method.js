var dog={
    name:'뽀삐',
    eat: function(food){
        // this.은 프로퍼티, 안 붙으면 매개변수(혹은 전역 변수)
        console.log(`${this.name}는 ${food}를 맛있게 먹어요.`);
    }
};

// 매개변수 있는 메소드를 매개변수를 주지 않고 호출할 수 있음
// 매개변수의 갯수를 지키지 않고 호출할 수 있음
console.log(dog.eat());
console.log(dog.eat('고구마'));