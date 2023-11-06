package chap_06;

class MathExample4 {
    int add(int x, int y) { return x + y; }
    long add(int x, long y) { return x + y; }
    long add(long x, int y) { return x + y; }
    long add(long x, long y) { return x + y; }
    int add(int[] x) {
        int result = 0;
        for (int i = 0; i < x.length; i++) {
            result += x[i];
        }
        return result;
    }
}

public class _31_Example {
    public static void main(String[] args) {
        MathExample4 m = new MathExample4();
        System.out.println(m.add(3, 3)); // 6
        System.out.println(m.add(3, 3L)); // 6
        System.out.println(m.add(3L, 3)); // 6
        System.out.println(m.add(3L, 3L)); // 6
        int[] x = {1, 2, 3, 4, 5};
        System.out.println(m.add(x)); // 15
    }
}