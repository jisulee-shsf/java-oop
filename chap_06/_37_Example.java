package chap_06;

class MathExample5 {
    int x; // 인스턴스 변수(this.x)
    int y; // 인스턴스 변수(this.y)

    // 1-1) 생성자에 참조 변수 this를 사용하는 경우
    MathExample5(int x, int y) {
        this.x = x; // 인스턴스 변수 x = 지역 변수 x
        this.y = y; // 인스턴스 변수 y = 지역 변수 y
    }

    // 1-2) 인스턴스 메서드에 참조 변수 this를 사용하는 경우
    int add() {
        return this.x + this.y; // 인스턴스 변수 x + 인스턴스 변수 y
    }

    // 1-3) static 메서드에 참조 변수 this를 사용하는 경우
    static int add(int x, int y) {
        return x + y; // this.x + this.y; -> 에러 발생
    }
}

public class _37_Example {
    public static void main(String[] args) {
        // 2-1) static 메서드 호출
        System.out.println(MathExample5.add(10, 20)); // 30

        // 2-2) 인스턴스 메서드 호출
        MathExample5 m = new MathExample5(10, 20);
        System.out.println(m.add()); // 30
    }
}