package day1;

public class PrimetiveAndReference {

    public static void main(String[] args) {
        int a = 10 ;
        int b = a ;
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        a = 20;
        System.out.println("a 변경");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        b = 30;
        System.out.println("b 변경");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        /*
        A를 복사해서 B에 널기 때문에 서로 독립적인 구조로 움직인다.
         */

        System.out.println("===============================");
        Data dataA = new Data(10);
        Data dataB = dataA;

        System.out.println(dataA.value);
        System.out.println(dataB.value);

        dataA.value= 20;
        System.out.println(dataA.value);
        System.out.println(dataB.value);

        dataB.value= 30;
        System.out.println(dataA.value);
        System.out.println(dataB.value);


    }
}

class Data{
    int value ;

    public Data(int value) {
        this.value = value;
    }
}
