package day7.interfacePackage;

public class Animal {

    public static void main(String[] args) {
        Cat cat =new Cat();
        Dog dog =new Dog();
        Cow cow = new Cow();

        cat.move();
        cat.sound();

        dog.move();
        dog.sound();

        cow.move();
        cow.sound();
    }
}
