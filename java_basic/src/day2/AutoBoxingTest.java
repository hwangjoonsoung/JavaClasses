package day2;

import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class AutoBoxingTest {

    public static void main(String[] args) {
        int size = 10000000;
        int[] intArr = new int[size];
        Integer[] integerArr = new Integer[size];

        int sum = 0;
        long intStart = System.currentTimeMillis();
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = i;
            sum += intArr[i];
        }
        long intEnd = System.currentTimeMillis();

        Integer sumInterger = 0;
        long integerStart = System.currentTimeMillis();
        for (int i = 0; i < integerArr.length; i++) {
            integerArr[i] = i;
            sumInterger += integerArr[i];
        }
        long integerEnd = System.currentTimeMillis();
        String name = integerArr[9].getClass().getName();
        System.out.println("date type 확인 : " + name);
//        intArr[0]. 안됨 기본형이기때문에

        System.out.println("not proceeding auto boxing : " + (intEnd - intStart));
        System.out.println("proceeding auto boxing : "+ (integerEnd - integerStart));
    }
}
