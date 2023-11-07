// 3) 조상 클래스에 선언된 멤버 변수를 조상 클래스의 생성자로 초기화하는 경우

package chap_07;

class Point5 {
    double latitude;
    double longitude;

    // 3-1) 조상 클래스의 기본 생성자 정의
    Point5() {};
    Point5(double latitude, double longitude) {
        // 3-2) 생성자 첫 줄에서 다른 생성자 호출 누락 -> 컴파일러에 의해 super() 추가 -> Object() 호출
        this.latitude = latitude;
        this.longitude = longitude;
    }

    String getLocation() {
        return "latitude: " + latitude + " longitude: " + longitude;
    }
}

class Location6 extends Point5 {
    int accuracy;

    Location6(double latitude, double longitude, int accuracy) {
        // 3-3) 조상 클래스에 선언된 멤버 변수를 조상 클래스의 생성자로 초기화 함
        super(latitude, longitude); // Point5(double latitude, double longitude) 호출
        this.accuracy = accuracy;
    }

    String getLocation() {
        return "latitude: " + latitude + " longitude: " + longitude + " accuracy: " + accuracy;
    }
}

public class _11_Example4 {
    public static void main(String[] args) {
        Location6 l = new Location6(37, 127, 10);
        System.out.println(l.getLocation()); // latitude: 37.0 longitude: 127.0 accuracy: 10
    }
}