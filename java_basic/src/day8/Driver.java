package day8;

public class Driver {
    private K3Car k3Car;
    private Model3Car model3Car;

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }
    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void drive(){
        System.out.println("자동차를 운전합니다");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();

    }

    public void drive(Car car){
        System.out.println("자동차를 운전합니다");
        car.startEngine();
        car.pressAccelerator();
        car.offEngine();

    }

}
