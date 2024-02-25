package day7;

import java.sql.SQLOutput;

public class Overriding {

    public static void main(String[] args) {

        Parent parent = new Parent();
        System.out.println(parent.value);
        parent.method();

        Child child = new Child();
        System.out.println(child.value);
        child.method();

        Parent parent1 = new Child();
        System.out.println(parent1.value);
        parent1.method();
        //value 는 overriding이 안되지만 
        //method는 overriding이 된다
        //특이하게 overriding된 method가 있으면 해당 method가 우선권을 가진다.
    }

}
