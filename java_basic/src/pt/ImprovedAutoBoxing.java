package pt;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class ImprovedAutoBoxing implements Runnable {
    private final Map<Integer, ImprovedBoxingObject> improvedMap = new HashMap<>();

    public ImprovedAutoBoxing() {
        for (int i = 0; i < 1000000; i++) {
            improvedMap.put(Integer.valueOf(i), new ImprovedBoxingObject(Integer.valueOf(i)));
        }
    }

    @Override
    public void run() {
        long yieldCounter = 0;
        while (true) {
            Collection<ImprovedBoxingObject> copyOfValues = improvedMap.values();
            for (ImprovedBoxingObject value : copyOfValues) {
                if (!improvedMap.containsKey(value.getElement())) {
                    System.out.println("fail!");
                }
                if (++yieldCounter % 1000 == 0) {
                    System.out.println("still running");
                }
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        ThreadGroup threadGroup = new ThreadGroup("Workers");
        Thread[] threads = new Thread[8];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(threadGroup, new ImprovedAutoBoxing(), "Allocator Thread " + i);
            threads[i].setDaemon(true);
            threads[i].start();
        }
        System.out.print("Press to quit!");
        System.out.flush();
        System.in.read();
    }
}

class ImprovedBoxingObject {
    Integer element = 0;

    public ImprovedBoxingObject(Integer element) {
        this.element = element;
    }

    public Integer getElement() {
        return element;
    }
}
