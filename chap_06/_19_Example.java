package chap_06;

class MathExample1 {
    long add(long x, long y) {
        long result = x + y;
        return result;
    }
}

public class _19_Example {
    public static void main(String[] args) {
        MathExample1 m = new MathExample1();
        long value = m.add(10, 20);
    }
}