package PT.tostring;

import java.sql.SQLOutput;
import java.util.Base64;

public class ObjectMain extends BadObject {
    public static void main(String[] args) {
//        Car car = new Car("부릉부릉");
//        Bear bear = new Bear("쿠오오오오오");
//
//        BadObject badObject = new BadObject();
//        String string = badObject.toString(bear);
//        System.out.println("string = " + string);
//
//        String carSound2 = car.toString();
//        System.out.println(carSound2);
//        String bearSound2 = bear.toString();
//        System.out.println(bearSound2);

        Person person = new Person("고성방가");
        System.out.println(person);

    }
}
