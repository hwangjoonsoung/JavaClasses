package day8;

public class Model3Car implements Car{

    @Override
    public void startEngine(){
        System.out.println("Model3 car engine start");
    }

    @Override
    public void offEngine(){
        System.out.println("Model3 car engine off");
    }

    @Override
    public void pressAccelerator(){
        System.out.println("Model3 car press accelerator");
    }

}
