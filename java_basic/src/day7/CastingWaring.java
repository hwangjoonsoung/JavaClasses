package day7;

public class CastingWaring {
    
    //다운캐스팅을 자동으로 하지 않는 이유
    public static void main(String[] args) {

        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //parent2는 child를 가지고 있지 않기 때문에 classcastexception이 발생한다.
        child2.childMethod();

        //이게 문제가 되는 이유는 하위 클래스는 상위클래스를 모든 메모리에 생성하지만
        // 반대는 그렇지않기 때문이다.
        // 만약 강제로 다운캐스팅을 하는 경우에는 컴파일 하는 과정에서 발생하지 않기 때문에 컴파일 에러가 아닌 런타임에러가 발생한다.

    }
}
