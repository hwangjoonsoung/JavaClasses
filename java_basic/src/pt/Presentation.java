package pt;


import com.sun.jdi.IntegerType;
import jdk.jfr.Enabled;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Presentation {

    public static void main(String[] args) {
        int test2 = 2;
        System.out.println("test2 = " + test2);
        int test3 = 3;
        System.out.println(test2-test3);
        TestClass testClass = new TestClass();
        System.out.println("testClass = " + testClass);

        String number = "2";
        Integer integerTest = (Integer) test2;

//        int test54 = null;


        Integer test44 = null;
        //자료형은 null 입력이 가능하다.
//        ArrayList<int> test = new ArrayList<int>();
        ArrayList<Integer> test222 = new ArrayList<Integer>();

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

//        Map<String, int> test = new HashMap<String, int>();
    }

}

class TestClass {
    String name;
    int age;
    int year;
    boolean man;

    public static void main(String[] args) {

        int test = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100000000; i++) {
            test += i;
        }
        long end = System.currentTimeMillis();
        System.out.println("spend : "+(end - start));

        start = System.currentTimeMillis();
        Integer test2 = 0;
        for (int i = 0; i < 100000000; i++) {
            test2 += Integer.valueOf(i);
        }
        end = System.currentTimeMillis();
        System.out.println("spend : "+(end - start));
    }

}

