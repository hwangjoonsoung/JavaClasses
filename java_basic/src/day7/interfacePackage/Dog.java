package day7.interfacePackage;

public class Dog implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("왈왈");
    }

    @Override
    public void move() {
        System.out.println("개가 이동합니다");
    }
}
