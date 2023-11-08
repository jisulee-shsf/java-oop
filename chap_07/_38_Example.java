package chap_07;

// 1) 추상 클래스
abstract class Player4 {
    int x, y;
    abstract void move(int x, int y);
    abstract void stop();
}

// 2) 인터페이스
interface Kickable2 {
    // 2-1) 인터페이스가 매개 변수인 메서드 정의
    public abstract void kick(Kickable2 k);
    void cornerKick(Kickable2 k);
    void penaltyKick(Kickable2 k);
}

// 3) 추상 클래스의 자손 클래스 및 인터페이스의 구현 클래스
class Footballer4 extends Player4 implements Kickable2 {
    @Override
    void move(int x, int y) { System.out.println("(" + x + ", " + y + ")" + "로 이동합니다."); }
    @Override
    void stop() {}
    // 3-1) 인터페이스 구현
    @Override
    public void kick(Kickable2 k) { System.out.println( k + "가 킥을 찹니다."); }
    @Override
    public void cornerKick(Kickable2 k) { System.out.println( k + "가 코너킥을 찹니다."); }
    @Override
    public void penaltyKick(Kickable2 k) { System.out.println( k + "가 패널티킥을 찹니다."); }

    // 3-2) 인터페이스가 반환 타입인 메서드 정의
    Kickable2 getFootballer() {
        return new Footballer4(); // return (Kickable2)new Footballer4();
    }
}

public class _38_Example {
    public static void main(String[] args) {
        // 4-1) 인터페이스의 다형성
        Footballer4 f = new Footballer4();
        f.move(100, 200); // (100, 200)로 이동합니다.
        f.kick(new Footballer4()); // chap_07.Footballer4@75b84c92가 킥을 찹니다.

        Kickable2 k1 = new Footballer4();
        // k1.move(10, 20); -> 에러 발생
        k1.kick(new Footballer4()); // chap_07.Footballer4@6bc7c054가 킥을 찹니다.

        // 4-2) 인터페이스가 반환 타입인 메서드 호출
        Kickable2 k2 = f.getFootballer(); // Kickable2 k2 = new Footballer4();
        System.out.println(k2 + "가 선발로 참여합니다."); // chap_07.Footballer4@232204a1가 선발로 참여합니다.
    }
}