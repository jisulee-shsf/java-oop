package chap_06;

class Data3 {
    int x;
}

class _25_Example {
    public static void main(String[] args) {
        Data3 a = new Data3();
        a.x = 10;
        Data3 b = copy(a);
        System.out.println(a.x + " / " + b.x); // 10 / 10
    }

    static Data3 copy(Data3 a) { // 참조형 반환 타입
        Data3 c = new Data3();
        c.x = a.x;
        return c; // 참조형 반환값인 객체 주소 반환
    }
}