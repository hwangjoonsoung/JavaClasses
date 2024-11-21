package pt;

import javax.lang.model.SourceVersion;
import java.util.Collection;
import java.util.HashMap;

public class TestClass2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();

        for (int i = 0; i < 100; i++) {
            map.put(i, i);
        }

        Collection values = map.values();
        for (Object value : values) {
            if (!map.containsKey(value)) {
                System.out.println("fail");
            }
        }

    }
}
