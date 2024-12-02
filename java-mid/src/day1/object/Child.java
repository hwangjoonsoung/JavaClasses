package day1.object;

public class Child extends Parent{

    // 명시적으로 상속 받았다.
    // 결론적으로 보면 모든 클래스는 object를 상속받는다.
    public void childMethod(){
        System.out.println("Child.childMethod");
    }

}
