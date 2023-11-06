package chap_07;

// 1) Object 클래스를 상속받는 경우
class Phone4 { // class Phone4 extends Object
    String name;
    String type;
    int capacity;
    int price;
}

class UpgradedPhone5 extends Phone4 {
    void useStandBy() {}
    void useNameDrop() {}

    UpgradedPhone5() {}
    UpgradedPhone5(String name, String type, int capacity, int price) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }

    // 2) Object 클래스의 메서드를 오버라이딩하는 경우
    public String toString() {
        return "u: " + name + " / " + type + " / " + capacity + " / " + price;
    }
}

public class _07_Example {
    public static void main(String[] args) {
        UpgradedPhone5 u = new UpgradedPhone5("jPhone", "Pro", 128, 1000000);
        System.out.println(u.toString()); // u: jPhone / Pro / 128 / 1000000
        System.out.println(u); // u: jPhone / Pro / 128 / 1000000
    }
}