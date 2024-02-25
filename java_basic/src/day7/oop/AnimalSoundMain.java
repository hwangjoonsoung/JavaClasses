package day7.oop;


public class AnimalSoundMain {
    public static void main(String[] args) {
        Dog dog =new Dog();
        Cat cat = new Cat();
        Cow cow = new Cow();

        System.out.println("동물소리 테스트 시작");
        dog.sound();
        System.out.println("동물소리 테스트 끝");

        System.out.println("동물소리 테스트 시작");
        cat.sound();
        System.out.println("동물소리 테스트 끝");

        System.out.println("동물소리 테스트 시작");
        cow.sound();
        System.out.println("동물소리 테스트 끝");

//        soundCow(cat); 타입이 달라서 안됨
        
        //배열로 해결
//        Cow [] cows = {cow , cat , dog}
//        해결할 수 없다.
        

    }

    /*이 방식은 중복을 제거하는 방법아 아니다.*/
    private static void soundCow(Cow cow){
        System.out.println("동물소리 테스트 시작");
        cow.sound();
        System.out.println("동물소리 테스트 끝");
    }

    private static void soundCat(Cat cat){
        System.out.println("동물소리 테스트 시작");
        cat.sound();
        System.out.println("동물소리 테스트 끝");
    }

}
