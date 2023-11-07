package chap_07.chap_07_21_Example2;

import chap_07.chap_07_21_Example1.Parent;

class Child extends Parent {
    public void method() {
        // 2-3) 다른 패키지의 자손 클래스에서 멤버 변수에 접근할 경우
        System.out.println(publicValue);
        System.out.println(protectedValue);
        // System.out.println(defaultValue); -> 에러 발생
        // System.out.println(privateValue); -> 에러 발생
    }
}

public class Example {
    public static void main(String[] args) {
        Child c = new Child();
        // 2-4) 다른 패키지의 다른 클래스에서 멤버 변수에 접근할 경우
        System.out.println(c.publicValue); // 0
        // System.out.println(c.protectedValue); -> 에러 발생
        // System.out.println(c.defaultValue); -> 에러 발생
        // System.out.println(c.privateValue); -> 에러 발생
    }
}