package chap_07;

// 1) 조상 클래스
class Phone7 {
    String name;
    String type;
    int capacity;
    int price;
}

// 2) 자손 클래스
class UpgradedPhone9 extends Phone7 {
    void useStandBy() {}
    void useNameDrop() {}
}

public class _24_Example2 {
    public static void main(String[] args) {
        // 3) 참조 변수 및 객체 생성
        Phone7 p = null;
        UpgradedPhone9 u1 = new UpgradedPhone9();
        UpgradedPhone9 u2 = null;

        // 4-1) 자손 타입의 참조 변수로 같은 타입의 객체 멤버를 호출하는 경우
        u1.useStandBy();
        // 4-2) 자손 타입의 참조 변수를 조상 타입의 참조 변수로 형변환하는 경우
        p = u1; // p = (Phone7)u1;
        // 4-3) 조상 타입의 참조 변수로 자손 타입의 객체 멤버를 호출하는 경우
        // p.useStandBy(); -> 에러 발생
        // 4-4) 조상 타입의 참조 변수를 자손 타입의 참조 변수로 형변환하는 경우
        u2 = (UpgradedPhone9)p;
        // 4-5) 자손 타입의 참조 변수로 같은 타입의 객체 멤버를 호출하는 경우
        u2.useStandBy();
    }
}