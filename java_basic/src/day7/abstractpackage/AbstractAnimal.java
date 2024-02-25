package day7.abstractpackage;

public abstract class AbstractAnimal {

    //무적권 오버라이딩 해야한다
    public abstract void sound();
    
    public void move(){
        System.out.println("동물이 움직입니다");
    }

}
