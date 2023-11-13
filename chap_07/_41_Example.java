package chap_07;

// 1. 조상 클래스
class Parent3 {
    public void method1() {
        System.out.println("Parent3 method1");
    }
}

// 2-1) 인터페이스
interface TestInterface1 {
    default void method1() {
        System.out.println("TestInterface1 method1");
    }
    default void method2() {
        System.out.println("TestInterface1 method2");
    }
}

// 2-2) 인터페이스
interface TestInterface2 {
    default void method2() {
        System.out.println("TestInterface2 method2");
    }
}

// 3) 자손 클래스 및 구현 클래스
class Child3 extends Parent3 implements TestInterface1, TestInterface2 {
    @Override
    public void method2() {
        System.out.println("Child3 method2");
    }
}

public class _41_Example {
    public static void main(String[] args) {
        Child3 c = new Child3();
        // 4-1) 디폴트 메서드와 조상 클래스의 메서드 간에 충돌이 발생하는 경우
        c.method1(); // Parent3 method1
        // 4-2) 여러 인터페이스의 디폴트 메서드 간에 충돌이 발생하는 경우
        c.method2(); // Child3 method2
    }
}