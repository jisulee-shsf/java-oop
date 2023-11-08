package chap_07;

// 1) 물품 클래스
class JavaProduct1 {
    int price;
    int point;

    JavaProduct1 () {}
    JavaProduct1(int price) {
        this.price = price;
        this.point = price / 10;
    }
}

// 2-1) 세부 물품 클래스
class JavaPhone1 extends JavaProduct1 {
    JavaPhone1() {
        super(200);
    }
    public String toString() {
        return "자바폰";
    }
}

// 2-2) 세부 물품 클래스
class JavaPad1 extends JavaProduct1 {
    JavaPad1() {
        super(100);
    }
    public String toString() {
        return "자바패드";
    }
}

// 2-3) 세부 물품 클래스
class JavaPods1 extends JavaProduct1 {
    JavaPods1() {
        super(50);
    }
    public String toString() {
        return "자바팟";
    }
}

// 3-1) 구매 고객 클래스
class Customer1 {
    int budget = 1000;
    int point = 0;

    // 3-2) 물품 구매 메서드 정의
    void buyProduct(JavaProduct1 jProduct) { // new JavaPhone(), new JavaPad(), new JavaPods()
        if (budget < jProduct.price) {
            System.out.println("예산 초과");
            return;
        }
        budget -= jProduct.price;
        point += jProduct.point;
        System.out.println(jProduct.toString() + " 구매 완료"); // System.out.println(jProduct + " 구매 완료");
    }
}

public class _28_Example {
    public static void main(String[] args) {
        // 4-1) 구매 고객 객체 생성
        Customer1 c = new Customer1();
        // 4-2) 물품 구매 메서드 호출
        c.buyProduct(new JavaPhone1());
        c.buyProduct(new JavaPad1());
        c.buyProduct(new JavaPods1());
        /*
        자바폰 구매 완료
        자바패드 구매 완료
        자바팟 구매 완료
        */
    }
}