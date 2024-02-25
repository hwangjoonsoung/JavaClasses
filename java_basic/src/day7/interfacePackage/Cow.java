package day7.interfacePackage;

public class Cow implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("음머");
    }

    @Override
    public void move() {
        System.out.println("cow가 이동합니다");
    }
}
