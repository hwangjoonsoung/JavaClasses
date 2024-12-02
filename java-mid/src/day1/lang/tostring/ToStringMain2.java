package day1.lang.tostring;

public class ToStringMain2 {
    public static void main(String[] args) {
        Car car1 = new Car("car1");

        Dog dog1 = new Dog("뿌꾸", 2);
        Dog dog2 = new Dog("진구", 11);

        System.out.println(car1.toString());
        System.out.println("dog1 = " + dog1.toString());
        System.out.println("dog2 = " + dog2.toString());

        System.out.println("car1 = " + car1);
        System.out.println("dog1 = " + dog1);
        System.out.println("dog2 = " + dog2);

        ObjectPrinter.print(car1);
        ObjectPrinter.print(dog1);
        ObjectPrinter.print(dog2);

        int i = System.identityHashCode(dog2);
        String hexString = Integer.toHexString(i);
        System.out.println("i = " + i);
        System.out.println("hexString = " + hexString);
    }
}
