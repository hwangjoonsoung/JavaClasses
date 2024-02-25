package day7.interfacePackage;

public class Cat implements InterfaceAnimal{

    @Override
    public void sound() {
        System.out.println("미아우");
    }

    @Override
    public void move() {
        System.out.println("고양이가 이동합니다");
    }
}
