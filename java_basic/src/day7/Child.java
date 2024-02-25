package day7;

public class Child extends Parent {

    public String value = "child";

    public void childMethod(){
        System.out.println("childMethod");
    }

    @Override
    public void method() {
        System.out.println("childMethod");
    }
}
