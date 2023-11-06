package chap_06;

class Phone2 {
    String name;
    String type;
    int capacity;
    int price;

    Phone2() {}
    Phone2(String n, String t, int c, int p) {
        name = n;
        type = t;
        capacity = c;
        price = p;
    }
}

public class _35_Example2 {
    public static void main(String[] args) {
        Phone2 p = new Phone2("jPhone", "Pro", 128, 1000000);
        System.out.println("p: " + p.name + " / " + p.type + " / " + p.capacity + " / " + p.price);
        /*
        p: jPhone / Pro / 128 / 1000000
        */
    }
}