package chap_06;

class MathExample3 {
    int x, y;

    // 1) 인스턴스 메서드 정의
    int add() {
        return x + y; // 인스턴스 변수
    }
    // 2) static 메서드 정의
    static int subtract(int a, int b) { // 매개 변수(지역 변수)
        return a - b; // 지역 변수
    }
}

public class _27_Example {
    public static void main(String[] args) {
        // 3) static 메서드 호출
        System.out.println(MathExample3.subtract(20, 10)); // 10
        // 4) 인스턴스 메서드 호출
        MathExample3 m = new MathExample3();
        m.x = 20;
        m.y = 10;
        System.out.println(m.add()); // 30
    }
}