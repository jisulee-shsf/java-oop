package chap_06;

class Data1 {
    int x;
}

public class _23_Example {
    public static void main(String[] args) {
        Data1 d = new Data1();
        d.x = 10;
        System.out.println(d.x); // 10
        change(d.x); // 123
        System.out.println(d.x); // 10
    }

    static void change(int x) { // 기본형 매개 변수
        x = 123;
        System.out.println(x);
    }
}