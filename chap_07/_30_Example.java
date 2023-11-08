package chap_07;

// 1) 물품 클래스
class JavaProduct2 {
    int price;
    int point;

    JavaProduct2 () {}
    JavaProduct2(int price) {
        this.price = price;
        this.point = price / 10;
    }
}

// 2-1) 세부 물품 클래스
class JavaPhone2 extends JavaProduct2 {
    JavaPhone2() {
        super(200);
    }
    public String toString() {
        return "자바폰";
    }
}

// 2-2) 세부 물품 클래스
class JavaPad2 extends JavaProduct2 {
    JavaPad2() {
        super(100);
    }
    public String toString() {
        return "자바패드";
    }
}

// 2-3) 세부 물품 클래스
class JavaPods2 extends JavaProduct2 {
    JavaPods2() {
        super(50);
    }
    public String toString() {
        return "자바팟";
    }
}

// 3-1) 구매 고객 클래스
class Customer2 {
    int budget = 1000;
    int point = 0;

    // 3-2) 장바구니 배열 생성
    JavaProduct2[] cart = new JavaProduct2[3];
    int i = 0; // 배열 인덱스

    // 3-3) 물품 구매 메서드 정의
    void buyProduct(JavaProduct2 jProduct) { // new JavaPhone(), new JavaPad(), new JavaPods()
        if (budget < jProduct.price) {
            System.out.println("예산 초과");
            return;
        }
        budget -= jProduct.price;
        point += jProduct.point;
        // 3-4) 물품 구매 시 장바구니에 저장
        cart[i++] = jProduct;
        System.out.println(jProduct + " 구매 완료"); // System.out.println(jProduct.toString() + " 구매 완료");
    }

    // 3-5) 구매 정보 요약 메서드 정의
    void printSummary() {
        int sum = 0;
        for (int i = 0; i < cart.length; i++) {
            if (cart[i] == null) {
                break;
            }
            sum += cart[i].price;
        }
        System.out.println("총 구매 비용: " + sum);
        System.out.println("남은 잔액: " + budget);
        System.out.println("적립 점수: " + point);
    }
}

public class _30_Example {
    public static void main(String[] args) {
        // 4-1) 구매 고객 객체 생성
        Customer2 c = new Customer2();
        // 4-2) 물품 구매 메서드 호출
        c.buyProduct(new JavaPhone2());
        c.buyProduct(new JavaPad2());
        c.buyProduct(new JavaPods2());
        // 4-3) 구매 정보 요약 메서드 호출
        c.printSummary();
        /*
        자바폰 구매 완료
        자바패드 구매 완료
        자바팟 구매 완료
        총 구매 비용: 350
        남은 잔액: 650
        적립 점수: 35
        */
    }
}