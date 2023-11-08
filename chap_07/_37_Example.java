package chap_07;

// 1) 추상 클래스
abstract class Player3 {
    abstract void move(int x, int y);
    abstract void stop();
}

// 2) 인터페이스
interface Runnable1 {
    void run();
}
interface Kickable1 {
    void kick();
}

// 3) 추상 클래스의 자손 클래스 및 인터페이스의 구현 클래스
class Footballer3 extends Player3 implements Runnable1, Kickable1 {
    @Override
    void move(int x, int y) { System.out.println("(" + x + ", " + y + ")로 이동"); }
    @Override
    void stop() { /* 내용 생략 */ }
    @Override
    public void run() { /* 내용 생략 */ }
    @Override
    public void kick() { /* 내용 생략 */ }
}

public class _37_Example {
    public static void main(String[] args) {
        // 4) 객체 생성 및 메서드 호출
        Footballer3 f = new Footballer3();
        f.move(100, 200); // (100, 200)로 이동
    }
}