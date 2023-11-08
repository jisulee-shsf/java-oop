package chap_07;

// 1) 추상 클래스
abstract class Player2 {
    int x, y;

    Player2() {
        x = 0;
        y = 0;
    }

    abstract void move(int x, int y);
    abstract void stop();
}

// 2-1) 자손 클래스
class Footballer2 extends Player2 {
    @Override
    void move(int x, int y) { System.out.println("Footballer2: (" + x + ", " + y + ")로 이동"); }
    @Override
    void stop() { /* 내용 생략 */ }
    void run() { /* 내용 생략 */ }
    void kick() { /* 내용 생략 */ }
}

// 2-2) 자손 클래스
class Skater1 extends Player2 {
    @Override
    void move(int x, int y) { System.out.println("Skater1: (" + x + ", " + y + ")로 이동"); }
    @Override
    void stop() { /* 내용 생략 */ }
    void jump() { /* 내용 생략 */ }
    void spin() { /* 내용 생략 */ }
}

public class _33_Example {
    public static void main(String[] args) {
        // 3-1) 공통 조상 클래스 타입의 참조 변수 배열 생성 및 메서드 호출
        Player2[] g1 = { new Footballer2(), new Skater1() };
        for (int i = 0; i < g1.length; i++) {
            g1[i].move(100, 200);
        }
        /*
        Footballer2: (100, 200)로 이동
        Skater1: (100, 200)로 이동
        */

        // 3-2) Object 클래스 타입의 참조 변수 배열 생성 및 메서드 호출
        Object[] g2 = { new Footballer2(), new Skater1() };
//        for (int i = 0; i < g2.length; i++) {
//            g2[i].move(100, 200); -> 에러 발생
//        }
    }
}