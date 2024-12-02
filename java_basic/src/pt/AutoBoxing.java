package pt;

import com.sun.jdi.IntegerType;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AutoBoxing implements Runnable {
    private final Map<Integer, BoxingObject> map = new HashMap<>();

    public AutoBoxing() {
        for (int i = 0; i < 1000000; i++) {
            map.put(i, new BoxingObject(i));
        }
    }

    @Override
    public void run() {
        long yieldCounter = 0;
        while (true) {
            Collection<BoxingObject> copyOfValues = map.values();
            for (BoxingObject value : copyOfValues) {
                if (!map.containsKey(value.getElement())) {
                    System.out.println("fail!");
                }
                if (++yieldCounter % 1000 == 0) {
                    System.out.println("still running");
                }
                Thread.yield();// 작업 프로세스 넘김
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ThreadGroup threadGroup = new ThreadGroup("Workers");
        Thread[] threads = new Thread[8];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(threadGroup, new AutoBoxing(), "Allocator Thread " + i);
            threads[i].setDaemon(true);
            threads[i].start();
        }
        System.out.print("Press to quit!");
        System.out.flush();
        System.in.read();
    }
}


class BoxingObject {
    int element = 0;

    public BoxingObject(int element) {
        this.element = element;
    }

    public int getElement() {
        return element;
    }
}

