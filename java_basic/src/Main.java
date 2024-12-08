import day1.ClassStart1;

import java.sql.DatabaseMetaData;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Data2 data1 = new Data2();
        data1.count++;

        Data2 Data2 = new Data2();
        Data2.count++;

        System.out.println("Data2.count = " + Data2.count);
        System.out.println("Data2.count = " + data1.count);

        int count = new Data2().count;
        System.out.println(count);
        int count1 = Data2.count;
    }

}

class Data2 {
    public String name;
    public static int count;
}