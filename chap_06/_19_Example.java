package chap_06;

class MathExample1 {
    // 1) 메서드 정의
    // 4) 메서드 실행
    long add(long x, long y) {
        long result = x + y;
        return result;
    }
}

public class _19_Example {
    public static void main(String[] args) {
        // 2) 객체 생성
        MathExample1 m = new MathExample1();
        // 3) 메서드 호출
        // 5) 메서드 종료 후 호출 메서드로 복귀
        long value = m.add(10, 20);
    }
}