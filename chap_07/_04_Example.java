package chap_07;

// 1) 단위로 작성된 클래스
class Point1 {
    double latitude;
    double longitude;
}

// 2-1) 단위로 작성된 클래스와 포함 관계를 맺는 경우
class Location1 {
    int accuracy;
    Point1 p = new Point1(); // 참조 변수 초기화
}

// 2-2) 단위로 작성된 클래스와 포함 관계를 맺지 않는 경우
class Location2 {
    int accuracy;
    double latitude;
    double longitude;
}

public class _04_Example {
    public static void main(String[] args) {
        // 3-1) 포함 관계를 맺는 클래스의 객체 접근 방법
        Location1 l1 = new Location1();
        l1.p.longitude = 127;
        System.out.println(l1.p.longitude); // 127.0

        // 3-2) 포함 관계를 맺지 않는 클래스의 객체 접근 방법
        Location2 l2 = new Location2();
        l2.longitude = 127;
        System.out.println(l2.longitude); // 127.0
    }
}