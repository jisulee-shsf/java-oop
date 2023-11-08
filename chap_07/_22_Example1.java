// 2) 접근 제한자로 캡슐화를 구현한 경우

package chap_07;

class Location7 {
    // 2-1) 멤버 변수의 접근 제한자 변경
    private int accuracy; // 0~10
    private double latitude;
    private double longitude;

    // 2-2) Getter 추가
    public int getAccuracy() {
        return accuracy;
    }

    // 2-3) Setter 추가
    public void setAccuracy(int accuracy) {
        if (accuracy < 0 || accuracy > 10) {
            return;
        }
        this.accuracy = accuracy;
    }
}

public class _22_Example1 {
    public static void main(String[] args) {
        Location7 l = new Location7();
        // 2-4) 멤버 변수를 잘못된 값으로 변경하는 경우
        l.setAccuracy(100);
        System.out.println(l.getAccuracy()); // 0
    }
}