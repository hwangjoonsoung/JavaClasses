package day1.lang.equals;

public class EqualsNameV1 {
    public static void main(String[] args) {
        UserV1 userV1 = new UserV1("id-100");
        UserV1 userV2 = new UserV1("id-100");

        System.out.println("idemtity = "+(userV2 == userV1));
        System.out.println("equals = "+(userV2.equals(userV1)));
    }
}
