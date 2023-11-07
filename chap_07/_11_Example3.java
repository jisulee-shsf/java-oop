// 2) 조상 클래스에 기본 생성자를 정의해 에러를 해결하는 경우

package chap_07;

class Point4 {
    double latitude;
    double longitude;

    // 2-1) 조상 클래스의 기본 생성자 정의
    Point4() {};
    Point4(double latitude, double longitude) {
        // 2-2) 생성자 첫 줄에서 다른 생성자 호출 누락 -> 컴파일러에 의해 super() 추가 -> Object() 호출
        this.latitude = latitude;
        this.longitude = longitude;
    }

    String getLocation() {
        return "latitude: " + latitude + " longitude: " + longitude;
    }
}

class Location5 extends Point4 {
    int accuracy;

    Location5(double latitude, double longitude, int accuracy) {
        // 2-3) 생성자 첫 줄에서 다른 생성자 호출 누락 -> 컴파일러에 의해 super() 추가 -> Point4() 호출
        // 2-4) 조상 클래스에 선언된 멤버 변수를 자손 클래스의 생성자로 초기화 함
        this.latitude = latitude;
        this.longitude = longitude;
        this.accuracy = accuracy;
    }

    String getLocation() {
        return "latitude: " + latitude + " longitude: " + longitude + " accuracy: " + accuracy;
    }
}

public class _11_Example3 {
    public static void main(String[] args) {
        Location5 l = new Location5(37, 127, 10);
        System.out.println(l.getLocation()); // latitude: 37.0 longitude: 127.0 accuracy: 10
    }
}