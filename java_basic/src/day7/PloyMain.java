package day7;

public class PloyMain {
    public static void main(String[] args) {
        //부모가 부모 인스턴스
        System.out.println("Parent -> Parent");
        Parent parent = new Parent();
        parent.parentMethod();

        //자식 변수가 자신 인스턴스
        System.out.println("child -> child");
        Child child = new Child();
        child.parentMethod();
        child.childMethod();

        Parent poly = new Child();
        poly.parentMethod();

        //이건 불가능
//        Child child1 = new Parent();

        Child child2 = (Child) poly;
        child2.childMethod();
    }
}
