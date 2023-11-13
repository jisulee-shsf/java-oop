package chap_07;

class Outer1 {
    // 1) 인스턴스 내부 클래스
    class InstanceInner {
        int iv = 100;
        // 1-1) 인스턴스 내부 클래스에서 static 변수를 선언하는 경우
        // static int cv = 100; -> 에러 발생
        // 1-2) 인스턴스 내부 클래스에서 static 상수를 선언하는 경우
        final static int CONST = 100;
    }

    // 2) static 내부 클래스
    static class StaticInner {
        int iv = 200;
        // 2-1) static 내부 클래스에서 static 변수를 선언하는 경우
        static int cv = 200;
        // 2-2) static 내부 클래스에서 static 상수를 선언하는 경우
        final static int CONST = 200;
    }

    void method() {
        // 3) 지역 내부 클래스
        class LocalInner {
            int iv = 300;
            // 3-1) 지역 내부 클래스에서 static 변수를 선언하는 경우
            // static int cv = 300; -> 에러 발생
            // 3-2) 지역 내부 클래스에서 static 상수를 선언하는 경우
            final static int CONST = 300;
        }
    }
}

public class _46_Example {
    public static void main(String[] args) {
        System.out.println(Outer1.InstanceInner.CONST); // 100
        System.out.println(Outer1.StaticInner.CONST); // 200
        // 3-3) 지역 내부 클래스의 static 상수를 사용하는 경우
        // System.out.println(Outer1.LocalInner.CONST); -> 에러 발생
    }
}