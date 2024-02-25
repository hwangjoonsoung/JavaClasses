package day8;

public class K3Car implements Car {

    @Override
    public void startEngine(){
        System.out.println("K3 car engine start");
    }

    @Override
    public void offEngine(){
        System.out.println("K3 car engine off");
    }

    @Override
    public void pressAccelerator(){
        System.out.println("K3 car press accelerator");
    }

}
