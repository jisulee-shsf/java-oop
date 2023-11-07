package chap_07.chap_07_21_Example1;

public class Parent {
    // 1) 접근 제어자별 멤버 변수 선언
    public int publicValue;
    protected int protectedValue;
    int defaultValue;
    private int privateValue;

    public void method() {
        // 2-1) 같은 클래스에서 멤버 변수에 접근할 경우
        System.out.println(publicValue);
        System.out.println(protectedValue);
        System.out.println(defaultValue);
        System.out.println(privateValue);
    }
}

class Example {
    public static void main(String[] args) {
        Parent p = new Parent();
        // 2-2) 같은 패키지에서 멤버 변수에 접근할 경우
        System.out.println(p.publicValue); // 0
        System.out.println(p.protectedValue); // 0
        System.out.println(p.defaultValue); // 0
        // System.out.println(p.privateValue); -> 에러 발생
    }
}