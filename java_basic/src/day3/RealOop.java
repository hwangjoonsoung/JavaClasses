package day3;

public class RealOop {
    public static void main(String[] args) {
        valueObject object = new valueObject();

        System.out.println("value = "+ object.value);
        object.addValue();
        System.out.println("value = "+ object.value);
        object.addValue();
        System.out.println("value = "+ object.value);
        object.addValue();
        System.out.println("value = "+ object.value);
        object.addValue();
        System.out.println("value = "+ object.value);
        object.subVaule();
        System.out.println("value = "+ object.value);
        object.subVaule();
        System.out.println("value = "+ object.value);
        object.subVaule();
        System.out.println("value = "+ object.value);

    }
}

class valueObject{

    int value = 0;

    void addValue(){
        value ++;
    }
    void subVaule(){
        value--;
    }
}
