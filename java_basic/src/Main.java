import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put(1,"test");
        map.put(2,"test");
        map.put(3,"test");
        map.put(4,"test");

        Main main =new Main();
        main.testzzzz((HashMap) map);



    }
    private void testzzzz(HashMap map){
        System.out.println(map);
    }


}
