package day7.abstractpackage;

public class Animal {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        dog.sound();
        cat.sound();
        cow.sound();

    }
}
