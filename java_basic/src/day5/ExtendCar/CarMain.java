package day5.ExtendCar;

public class CarMain {

    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        Car.test = 11;

        GasCar gasCar =new GasCar();
        gasCar.move();
        gasCar.fillUp();
        System.out.println(gasCar.sss);
        System.out.println(Car.test);

    }

}
