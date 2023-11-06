package chap_07;

// 1) 조상 클래스
class Phone1 {
    String name;
    String type;
    int capacity;
    int price;
}

// 2-1) 조상 클래스를 상속받는 경우
class UpgradedPhone1 extends Phone1 {
    void useStandBy() {}
    void useNameDrop() {}
}

// 2-2) 조상 클래스를 상속받지 않은 경우
class UpgradedPhone2 {
    String name;
    String type;
    int capacity;
    int price;

    void useStandBy() {}
    void useNameDrop() {}
}

public class _02_Example1 {
    public static void main(String[] args) {
        // 3-1) 조상 클래스를 상속받는 자손 클래스의 객체를 생성하는 경우
        UpgradedPhone1 u1 = new UpgradedPhone1();
        // 3-2) 조상 클래스를 상속받지 않는 클래스의 객체를 생성하는 경우
        UpgradedPhone2 u2 = new UpgradedPhone2();
    }
}