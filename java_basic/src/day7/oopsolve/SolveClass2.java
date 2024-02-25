package day7.oopsolve;

import static sun.rmi.transport.TransportConstants.Ping;

public class SolveClass2 {

    public static void main(String[] args) {

        Animal animalA = new Animal();
        animalA.sound();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        Animal animals[] ={dog , cat , cow};
        for (Animal animal:animals) {
            getSound(animal);
        }

        System.out.println();
        Animal animals2[] ={new Dog() , new Cat(), new Cow()};
        for (Animal animal:animals2) {
            getSound(animal);
        }

        //문제가 있다.
        //1. Animal class를 직접 참조하는 경우
        //2. 자식클래스에서 상속받은 method를 overriding하지 않는 경우
        Animal animals3[] ={new Dog() , new Cat(), new Cow() , new Pig()};
        for (Animal animal:animals3) {
            getSound(animal);
        }
    }

    private static void getSound(Animal animal) {
        System.out.println("울음소리 시작");
        animal.sound();
        System.out.println("울음소리 끝");
    }


}
