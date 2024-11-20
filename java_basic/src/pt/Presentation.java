package pt;

import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.Map;

public class Presentation {

    public static void main(String[] args) {
        TestClass testClass = new TestClass();
        TestClass testClass2 = new TestClass();

//        testClass2 = testClass + testClass2; // 연산 불가능으로 인한 컴파일 오류

        testClass2.age = testClass.age - testClass2.age; //기본형 자료 구조로 연산 가능

//        int a = null; // null 초기화 불가능

        int a = 10;
        Integer aInteger = (Integer) a;
        Integer aaa = null; // null 초기화 가능
        aaa = 10; // data입력 가능
        System.out.println("aaa = " + aaa);
        System.out.println(aaa instanceof Integer);
//        System.out.println(a instanceof Integer); // 자료형과 기본형을 instanceof 할 수 없다. 따라서 진행하기 위해서는 boxing을 진행한다.
        System.out.println(aInteger instanceof Integer);
        Boolean testst = aInteger == aInteger;

        Map<String, int> test = new HashMap<String, int>();
    }

}

class TestClass {
    String name;
    int age;
    int year;
    boolean man;
}