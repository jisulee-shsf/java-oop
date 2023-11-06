package chap_06;

class Phone3 {
    String name;
    String type;
    int capacity;
    int price;

    // 2-1) 공통 코드를 작성한 생성자 호출로 중복 코드 제거
    Phone3() {
        this("jPhone1", "Pro1", 128, 1000000); // Phone(String n, String t, int c, int p) 호출
    }

    // 2-2) 공통 코드를 작성한 생성자 호출로 중복 코드 제거
    Phone3(String n, String t) {
        this(n, t, 256, 1500000);  // Phone(String n, String t, int c, int p) 호출
    }

    // 1) 공통 코드를 작성한 생성자
    Phone3(String n, String t, int c, int p) {
        name = n;
        type = t;
        capacity = c;
        price = p;
    }
}

public class _36_Example {
    public static void main(String[] args) {
        Phone3 p1 = new Phone3();
        Phone3 p2 = new Phone3("jPhone2", "Pro2");
        Phone3 p3 = new Phone3("jPhone3", "Pro3", 512, 2000000);

        System.out.println("p1: " + p1.name + " / " + p1.type + " / " + p1.capacity + " / " + p1.price);
        System.out.println("p2: " + p2.name + " / " + p2.type + " / " + p2.capacity + " / " + p2.price);
        System.out.println("p3: " + p3.name + " / " + p3.type + " / " + p3.capacity + " / " + p3.price);
        /*
        p1: jPhone1 / Pro1 / 128 / 1000000
        p2: jPhone2 / Pro2 / 256 / 1500000
        p3: jPhone3 / Pro3 / 512 / 2000000
        */
    }
}