package chap_06;

// 1) 기본 생성자가 자동으로 추가되는 경우
class Example1 {
    int x;
}

// 2) 기본 생성자가 자동으로 추가되지 않는 경우
class Example2 {
    int x;

    Example2(int a) { // 매개 변수가 있는 생성자 정의
        x = a;
    }
}

public class _33_Example {
    public static void main(String[] args) {
        Example1 c1 = new Example1();
        // Example2 c2 = new Example2(); -> 에러 발생
    }
}