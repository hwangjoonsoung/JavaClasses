package day1.lang.poly;

public class ObjectPolyExample2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();
        Object obj = new Object();
        Object[] objectArr = {dog, car, obj};

        size(objectArr);
    }

    private static void size(Object [] objects) {
        System.out.println(objects.length);
    }


}
