package chap_06;

class MathExample2 {
    // 1) 반환값이 변수인 경우 / 반환값의 타입과 반환 타입이 서로 다르나, 자동 형변환이 가능한 경우
    double method1(long x, long y) {
        long result = x + y;
        return result;
    }

    // 2) 반환값이 변수가 아닌 경우 / 반환값의 타입과 반환 타입이 서로 일치하는 경우
    int method2(int x, int y) {
        return x + y;
    }
}

public class _21_Example {
    public static void main(String[] args) {
        MathExample2 m = new MathExample2();
        System.out.println(m.method1(10L, 20L)); // 30.0
        System.out.println(m.method2(10, 20)); // 30
    }
}