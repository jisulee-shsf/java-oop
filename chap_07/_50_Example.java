package chap_07;

// 1) 외부 클래스
class Outer3 {
    // 1-1) 외부 클래스의 멤버 변수
    int value = 100; // Outer3.this.value

    // 2) 인스턴스 내부 클래스
    class InstanceInner {
        // 2-1) 인스턴스 내부 클래스의 멤버 변수
        int value = 200; // this.value

        // 3) 외부 클래스에 포함된 메서드
        void method1() {
            // 3-1) 외부 클래스에 포함된 메서드의 지역 변수
            int value = 300; // value
        }
        void method2() {
            System.out.println("Outer3.this.value: " + Outer3.this.value);
            System.out.println("this.value: " + this.value);
            System.out.println("value: " + value);
        }
    }
}

public class _50_Example {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        Outer3.InstanceInner i = o.new InstanceInner();
        i.method2();
        /*
        Outer3.this.value: 100
        this.value: 200
        value: 200
        */
    }
}