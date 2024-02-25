package day7.oopsolve;

public class SolveClass1 {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        soundAnimal(dog);
        soundAnimal(cat);
        soundAnimal(cow);

//        overriding으로 해결할 수 있음
//        method는 오버라이딩 된 것이 우선권을 가지기 때문에 해당 인스턴스의 method가 실행된다.
    }

    private static void soundAnimal(Animal animal){
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
    
    
}
