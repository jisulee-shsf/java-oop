package chap_07;

// 1) 추상 클래스
abstract class Player1 {
    // 1-1) 멤버 변수 선언
    int x, y;

    // 1-2) 생성자 정의
    Player1() {
        x = 0;
        y = 0;
    }

    // 1-3) 추상 메서드 선언
    abstract void move(int x, int y);
    abstract void stop();

    // 1-4) 추상 메서드를 호출하는 인스턴스 메서드 정의
    void move() { move(x, y); }
}

// 2) 자손 클래스
class Footballer1 extends Player1 {
    // 2-1) 추상 메서드 구현
    @Override
    void move(int x, int y) { System.out.println("지정 위치로 이동"); }
    @Override
    void stop() { /* 내용 생략 */ }
}

public class _32_Example {
    public static void main(String[] args) {
        // 3-1) 객체 생성
        Footballer1 f = new Footballer1();
        // 3-2) 추상 메서드를 호출하는 인스턴스 메서드 호출
        f.move(); // 지정 위치로 이동
    }
}