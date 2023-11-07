// 2) 조상 클래스와 자손 클래스의 멤버 변수 이름이 중복되지 않는 경우

package chap_07;

class Parent2 {
    int x = 10; // super.x / this.x
}

class Child2 extends Parent2 {
    void method() {
        // 2-1) 조상 클래스의 멤버 변수
        System.out.println(x); // 10
        // 2-2) 조상 클래스의 멤버 변수
        System.out.println(this.x); // 10
        // 2-3) 조상 클래스의 멤버 변수
        System.out.println(super.x); // 10
    }
}

public class _10_Example2 {
    public static void main(String[] args) {
        Child2 c = new Child2();
        c.method();
    }
}