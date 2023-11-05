package chap_06;

class Data2 {
    int x;
}

public class _24_Example {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println(d.x); // 10
        change(d); // 123
        System.out.println(d.x); // 123
    }

    static void change(Data2 d) { // 참조형 매개 변수
        d.x = 123;
        System.out.println(d.x);
    }
}