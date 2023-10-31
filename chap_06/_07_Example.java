class Speaker2 {
    boolean power;
    int volume;
    void power() { power = !power; }
    void volumeUp() { ++volume; }
    void volumeDown() { --volume; }
}

public class _07_Example {
    public static void main(String[] args) {
        Speaker2 s1 = new Speaker2();
        Speaker2 s2 = new Speaker2();

        // 1) 객체마다 서로 다른 멤버 변수 값을 가지는 경우
        s1.volume = 3;
        System.out.println(s1.volume); // 3
        System.out.println(s2.volume); // 0

        // 2) 여러 참조 변수가 하나의 객체를 참조하는 경우
        s2 = s1;
        System.out.println(s1.volume); // 3
        System.out.println(s2.volume); // 3
    }
}