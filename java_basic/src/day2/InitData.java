package day2;

public class InitData {
    public static void main(String[] args) {
        testClass aClass = new testClass();
        System.out.println(aClass.a);
        System.out.println(aClass.b);
        System.out.println(aClass.c);
    }
}

class testClass {
    int a;
    boolean b;
    String c;
}
