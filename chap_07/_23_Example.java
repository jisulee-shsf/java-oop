package chap_07;

// 1) 조상 클래스
class Phone5 {
    String name;
    String type;
    int capacity;
    int price;
}

// 2) 자손 클래스
class UpgradedPhone6 extends Phone5 {
    void useStandBy() {}
    void useNameDrop() {}
}

public class _23_Example {
    public static void main(String[] args) {
        // 3) 참조 변수와 객체의 타입이 일치할 경우
        // 3-1) 자손 타입의 참조 변수로 같은 타입의 객체를 참조할 경우
        UpgradedPhone6 u1 = new UpgradedPhone6();
        System.out.println(u1.name);
        System.out.println(u1.type);
        System.out.println(u1.capacity);
        System.out.println(u1.price);
        u1.useStandBy();
        u1.useNameDrop();

        // 4) 참조 변수와 객체의 타입이 일치하지 않는 경우
        // 4-1) 조상 타입의 참조 변수로 자손 타입의 객체를 참조할 경우
        Phone5 p = new UpgradedPhone6();
        System.out.println(p.name);
        System.out.println(p.type);
        System.out.println(p.capacity);
        System.out.println(p.price);
        // p.useStandBy(); -> 에러 발생
        // p.useNameDrop(); -> 에러 발생

        // 4-2) 자손 타입의 참조 변수로 조상 타입의 객체를 참조할 경우
        // UpgradedPhone6 u2 = new Phone5(); -> 에러 발생
    }
}