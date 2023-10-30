package chap_06;

// 1) 클래스 정의
class Speaker1 {
    boolean power;
    int volume;
    void power() { power = !power; }
    void volumeUp() { ++volume; }
    void volumeDown() { --volume; }
}

public class _06_Example {
    public static void main(String[] args) {
        // 2) 객체의 생성 및 사용
        Speaker1 s;
        s = new Speaker1();
        s.volume = 3;
        System.out.println(s.volume);
        s.volumeUp();
        System.out.println(s.volume); // 4
    }
}