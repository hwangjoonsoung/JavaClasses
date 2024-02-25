package day8;

public class SantafeCar implements Car {

    @Override
    public void startEngine(){
        System.out.println("Santafe car engine start");
    }

    @Override
    public void offEngine(){
        System.out.println("Santafe car engine off");
    }

    @Override
    public void pressAccelerator(){
        System.out.println("Santafe car press accelerator");
    }

}
