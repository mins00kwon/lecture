// 프로퍼티 값 단축

var id= 'p-0001';
var price=30000;

var product={
    id: id,
    price: price
};
console.log('product:', product);

// 변수명이 곧 프로퍼티 키, 변수값이 프로퍼티 값이 된다
var product2={id,price};
console.log(product2);