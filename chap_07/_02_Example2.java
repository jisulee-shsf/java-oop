package chap_07;

// 1) 조상 클래스
class Phone2 {
    String name;
    String type;
    int capacity;
    int price;
}

// 2) 자손 클래스
class UpgradedPhone3 extends Phone2 {
    void useStandBy() {}
    void useNameDrop() {}

    UpgradedPhone3() {}
    UpgradedPhone3(String name, String type, int capacity, int price) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }
}

public class _02_Example2 {
    public static void main(String[] args) {
        // 3) 자손 클래스의 객체 생성
        UpgradedPhone3 u = new UpgradedPhone3("jPhone", "Pro", 128, 1000000);
        System.out.println("u: " + u.name + " / " + u.type + " / " + u.capacity + " / " + u.price);
        /*
        p: jPhone / Pro / 128 / 1000000
        */
    }
}