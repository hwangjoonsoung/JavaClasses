package day1.object;

import java.util.BitSet;

public class Parent {

    // 아무것도 없으면 extends obejct를 한다. (묵시적으로)
    public void parentMethod(){
        System.out.println("Parent.parentMethod");
    }

    public static void main(String[] args) {
        Parent parent = new Parent();
        String name = parent.getClass().getSuperclass().getName();
        System.out.println("name = " + name);
    }
}
