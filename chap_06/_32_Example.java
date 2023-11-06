package chap_06;

class ConstructorExample {
    int x;
    int y;

    // 1) 생성자 정의
    ConstructorExample() {}
    ConstructorExample(int a, int b) {
        x = a;
        y = b;
    }
}

public class _32_Example {
    // 2) 객체 생성 및 생성자 호출
    ConstructorExample c1 = new ConstructorExample();
    ConstructorExample c2 = new ConstructorExample(10, 20);
}