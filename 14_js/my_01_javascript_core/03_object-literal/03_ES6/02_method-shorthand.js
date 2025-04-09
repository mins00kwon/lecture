var pika1={
    name: '피카츄',
    eat: function(food){
        console.log(`${food}를 먹는다`);
    }
}
pika1.eat('라이츄');


var pika2={
    name: '피카츄',
    eat(food){
        console.log(`${food}를 먹는다`);
    }
}
pika2.eat('꼬부기');