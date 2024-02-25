package day5.ExtendCar;

public class GasCar extends Car{


    int sss = super.test;
    @Override
    public void move(){
        super.move();
        System.out.println("가솔린 차량을 이동합니다");
    }

    public void fillUp(){
        System.out.println("주유를 시작합니다.");
    }
}
