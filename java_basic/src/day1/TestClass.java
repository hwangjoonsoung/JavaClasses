package day1;

public class TestClass {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.age = 2020;
        car1.name = "쏘렌토";
        car1.category = "SUV";

        Car car2 = new Car();
        car2.age = 2040;
        car2.name = "그렌져";
        car2.category = "RV";

        Car[] carArray = new Car[2];
        carArray[0] = car1;
        carArray[1] = car2;

        if(car1.equals(carArray[0])){
            System.out.println("same");
        }else{
            System.out.println("Not same");
        }

        if(car2.equals(carArray[1])){
            System.out.println("same");
        }else{
            System.out.println("Not same");
        }

    }
}

class Car{

    int age;
    String name;
    String category;

}