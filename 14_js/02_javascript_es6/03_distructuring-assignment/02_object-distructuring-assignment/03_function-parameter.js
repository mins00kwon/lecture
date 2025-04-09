let exampleProduct={
    items:['Coffee','Donut'],
    producer:'산사임당'
};

// 객체를 단순하게 받아내는 매개변ㄴ수 사용 시
function displayProduct(obj){
    console.log(obj.producer);
    console.log(obj.items);
}

displayProduct(exampleProduct); // Coffee, Donut, 산사임당