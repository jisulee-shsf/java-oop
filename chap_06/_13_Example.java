package chap_06;

class NameTag {
    // 1-1) 인스턴스 변수 선언
    String name;
    String affiliation;
    // 1-2) 클래스 변수 선언
    static int width = 100;
    static int height = 200;
}

public class _13_Example {
    public static void main(String[] args) {
        // 2-1) 클래스 변수 사용
        System.out.println(NameTag.width); // 100
        System.out.println(NameTag.height); // 200

        // 2-2) 인스턴스 변수 사용
        NameTag n1 = new NameTag();
        n1.name = "AAA";
        n1.affiliation = "aaaaa";
        System.out.println(n1.name); // AAA
        System.out.println(n1.affiliation); // aaaaa
        
        NameTag n2 = new NameTag();
        n2.name = "BBB";
        n2.affiliation = "bbbbb";
        System.out.println(n2.name); // BBB
        System.out.println(n2.affiliation); // bbbbb

        // 3) 클래스 변수 변경
        NameTag.width = 120;
        System.out.println(NameTag.width); // 100 -> 120
        System.out.println(n1.width); // 100 -> 120
        System.out.println(n2.width); // 100 -> 120
    }
}
