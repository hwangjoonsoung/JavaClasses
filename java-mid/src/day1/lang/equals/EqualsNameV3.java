package day1.lang.equals;

public class EqualsNameV3 {
    public static void main(String[] args) {
        UserV3 test = new UserV3(1L, "test");
        UserV3 test2 = new UserV3(1L, "test");

        boolean equals = test.equals(test2);
        System.out.println("equals = " + equals);
    }
}
