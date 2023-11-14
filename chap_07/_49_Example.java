package chap_07;

// 1) 외부 클래스
class Outer2 {
    // 2) 인스턴스 내부 클래스
    class InstanceInner {
        int iv = 100;
    }

    // 3) static 내부 클래스
    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }

    void method() {
        // 4) 지역 내부 클래스
        class LocalInner {
            int lv = 300;
        }
    }
}

public class _49_Example {
    public static void main(String[] args) {
        // 5-1) 인스턴스 내부 클래스의 멤버에 접근하는 경우
        // System.out.println(InstanceInner.iv); -> 에러 발생
        Outer2 o = new Outer2();
        Outer2.InstanceInner i = o.new InstanceInner();
        System.out.println(i.iv); // 100

        // 5-2) static 내부 클래스의 멤버에 접근하는 경우
        // System.out.println(StaticInner.cv); -> 에러 발생
        System.out.println(Outer2.StaticInner.cv); // 200
        // System.out.println(Outer2.StaticInner.iv); -> 에러 발생
        Outer2.StaticInner s = new Outer2.StaticInner();
        System.out.println(s.iv); // 200
    }
}