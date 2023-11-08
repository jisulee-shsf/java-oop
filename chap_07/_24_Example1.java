package chap_07;

// 1) 조상 클래스
class Phone6 {
    String name;
    String type;
    int capacity;
    int price;
}

// 2-1) 자손 클래스
class UpgradedPhone7 extends Phone6 {
    void useStandBy() {}
    void useNameDrop() {}
}

// 2-2) 자손 클래스
class UpgradedPhone8 extends Phone6 {
    void useStandBy() {}
    void useNameDrop() {}
}

public class _24_Example1 {
    public static void main(String[] args) {
        // 3-1) 자손 타입의 참조 변수로 같은 타입의 객체를 참조하는 경우
        UpgradedPhone7 u1 = new UpgradedPhone7();
        System.out.println(u1.name);
        System.out.println(u1.type);
        System.out.println(u1.capacity);
        System.out.println(u1.price);
        u1.useStandBy();
        u1.useNameDrop();

        // 3-2) 자손 타입의 참조 변수를 조상 타입의 참조 변수로 형변환하는 경우
        Phone6 p = u1; // Phone6 p = (Phone6)u1;
        System.out.println(p.name);
        System.out.println(p.type);
        System.out.println(p.capacity);
        System.out.println(p.price);
        // p.useStandBy(); -> 에러 발생
        // p.useNameDrop(); -> 에러 발생

        // 3-3) 조상 타입의 참조 변수를 자손 타입의 참조 변수로 형변환하는 경우
        UpgradedPhone7 u2 = (UpgradedPhone7)p;
        System.out.println(u2.name);
        System.out.println(u2.type);
        System.out.println(u2.capacity);
        System.out.println(u2.price);
        u2.useStandBy();
        u2.useNameDrop();

        // 3-4) 자손 타입의 참조 변수를 다른 자손 타입의 참조 변수로 형변환하는 경우
        // UpgradedPhone8 u3 = (UpgradedPhone8)u1; -> 에러 발생
    }
}