// 1) 조상 클래스에 선언된 멤버 변수를 자손 클래스의 생성자로 초기화하는 경우

package chap_07;

class Point2 {
    double latitude;
    double longitude;

    Point2() {}
    Point2(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }
}

class Location3 extends Point2 {
    int accuracy;

    Location3(double latitude, double longitude, int accuracy) {
        // 1-1) 조상 클래스에 선언된 멤버 변수를 자손 클래스의 생성자로 초기화 함
        this.latitude = latitude;
        this.longitude = longitude;
        this.accuracy = accuracy;
    }

    public String toString() {
        return "latitude: " + latitude + " longitude: " + longitude + " accuracy: " + accuracy;
    }
}

public class _11_Example1 {
    public static void main(String[] args) {
        Location3 l = new Location3(37, 127, 10);
        System.out.println(l.toString()); // latitude: 37.0 longitude: 127.0 accuracy: 10
    }
}