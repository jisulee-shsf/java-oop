// 1) 조상 클래스와 자손 클래스의 멤버 변수 이름이 중복되는 경우

package chap_07;

class Parent1 {
    int x = 10; // super.x
}

class Child1 extends Parent1 {
    int x = 20; // this.x

    void method() {
        // 1-1) 자손 클래스의 멤버 변수
        System.out.println(x); // 20
        // 1-2) 자손 클래스의 멤버 변수
        System.out.println(this.x); // 20
        // 1-3) 조상 클래스의 멤버 변수
        System.out.println(super.x); // 10
    }
}

public class _10_Example1 {
    public static void main(String[] args) {
        Child1 c = new Child1();
        c.method();
    }
}