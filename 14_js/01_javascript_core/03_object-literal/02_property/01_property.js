
var obj={
    normal: 'normal value',
    '@ s p a c e': 'space value',   // 가능은 하지만 지양 (특수 기호는 _, $ 두개를 제외하고 쓰지 말기)
    0: 1,                   // 숫자형 프로퍼티명은 내부적으로 문자열로 변환
    var: 'var',             // 예약어 사용 지양
    normal: 'new value'     // 프로퍼티명이 중복되면 나중에 작성된 것으로 덮어 씌워짐
};

console.log(obj[normal])