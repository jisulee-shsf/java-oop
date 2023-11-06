package chap_07;

// 1) Object 클래스를 상속받는 경우
class Phone3 { // class Phone3 extends Object
    String name;
    String type;
    int capacity;
    int price;
}

class UpgradedPhone4 extends Phone3 {
    void useStandBy() {}
    void useNameDrop() {}

    UpgradedPhone4() {}
    UpgradedPhone4(String name, String type, int capacity, int price) {
        this.name = name;
        this.type = type;
        this.capacity = capacity;
        this.price = price;
    }
}

public class _06_Example {
    public static void main(String[] args) {
        UpgradedPhone4 u = new UpgradedPhone4("jPhone", "Pro", 128, 1000000);
        // 2) Object 클래스에 정의된 메서드 호출하는 경우
        System.out.println(u.toString()); // chap_07.UpgradedPhone4@75b84c92
        System.out.println(u); // chap_07.UpgradedPhone4@75b84c92
    }
}