package day1.lang.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);
    }

    private static void action(Object object) {
        // object는 해당 method가 없기 때문에 사용할 수 없다,
//        object.sound();
//        object.move();
        if(object instanceof Dog){
            ((Dog) object).sound();
        }
        //이때 자동으로 down casting을 통해 사용 가능하다.
        if(object instanceof Car){
            ((Car) object).move();
        }

    }
}
