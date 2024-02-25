package day8;

public class SorantoCar implements Car {

    @Override
    public void startEngine(){
        System.out.println("Soranto car engine start");
    }

    @Override
    public void offEngine(){
        System.out.println("Soranto car engine off");
    }

    @Override
    public void pressAccelerator(){
        System.out.println("Soranto car press accelerator");
    }

}
