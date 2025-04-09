// 객체 구조분해 할당 기본 문법
let pants={
    productname: '배기팬츠',
    color: '검정색',
    price: 30000,
    getInfo(){
        console.log(this.color, this.productname, '좋아!');
    }
}
pants.getInfo(); // 검정색 배기팬츠 좋아!


let productName123=pants.productname;
let color123=pants.color;

// 배열 구조분해 할당과 달리 프로퍼티 순서는 중요하지 않지만 프로퍼티명과 일치하는 변수명을 써 주어야 한다.
let {productname,color,price}=pants; // 객체 구조분해 할당
let{color:co,price:pr}=pants; // 객체 구조분해 할당