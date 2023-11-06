package chap_06;

class Phone1 {
    String name;
    String type;
    int capacity;
    int price;
}

public class _35_Example1 {
    public static void main(String[] args) {
        Phone1 p = new Phone1();
        p.name = "jPhone";
        p.type = "Pro";
        p.capacity = 128;
        p.price = 1000000;
        System.out.println("p: " + p.name + " / " + p.type + " / " + p.capacity + " / " + p.price);
        /*
        p: jPhone / Pro / 128 / 1000000
        */
    }
}