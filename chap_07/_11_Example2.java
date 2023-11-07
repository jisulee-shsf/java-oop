// 2) 조상 클래스에 선언된 멤버 변수를 조상 클래스의 생성자로 초기화하는 경우

package chap_07;

class Point3 {
    double latitude;
    double longitude;

    Point3() {}
    Point3(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

class Location4 extends Point3 {
    int accuracy;

    Location4(double latitude, double longitude, int accuracy) {
        // 2-1) 조상 클래스에 선언된 멤버 변수를 조상 클래스의 생성자로 초기화 함
        super(latitude, longitude); // Point3(double latitude, double longitude) 호출
        this.accuracy = accuracy;
    }

    public String toString() {
        return "latitude: " + latitude + " longitude: " + longitude + " accuracy: " + accuracy;
    }
}

public class _11_Example2 {
    public static void main(String[] args) {
        Location4 l = new Location4(37, 127, 10);
        System.out.println(l.toString()); // latitude: 37.0 longitude: 127.0 accuracy: 10
    }
}