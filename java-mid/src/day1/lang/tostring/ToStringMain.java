package day1.lang.tostring;

public class ToStringMain {
    public static void main(String[] args) {
        Object object = new Object();
        String string = object.toString();

        System.out.println("string = " + string);
        System.out.println("object = " + object);
        //object의 toString()은 class정보와 해시코드를 제공한다.

    }
}
