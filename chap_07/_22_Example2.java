// 3) Setter 내부 조건식을 메서드로 정의할 경우

package chap_07;

class Location8 {
    private int accuracy; // 0~10
    private double latitude;
    private double longitude;

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        if (isNotValidAccuracy(accuracy)) {
            return;
        }
        this.accuracy = accuracy;
    }

    // 3-1) Setter 내부 조건식을 메서드로 정의
    private boolean isNotValidAccuracy(int accuracy) {
        return accuracy < 0 || accuracy > 10;
    }
}

public class _22_Example2 {
    public static void main(String[] args) {
        Location8 l = new Location8();
        l.setAccuracy(100);
        System.out.println(l.getAccuracy()); // 0
    }
}