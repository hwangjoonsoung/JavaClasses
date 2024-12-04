package day1.lang.equals;

public class EqualsNameV2 {
    public static void main(String[] args) {
        UserV2 userV2 = new UserV2("id-100");
        UserV2 userV1 = new UserV2("id-100");

        System.out.println(userV2 == userV1);
        System.out.println(userV2.equals(userV1));

    }
}
