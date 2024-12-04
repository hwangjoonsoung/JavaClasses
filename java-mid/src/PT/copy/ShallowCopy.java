package PT.copy;

public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {
        ShallowPeople test1 = new ShallowPeople("test", 100);
        ShallowPeople test2 = test1;

        test1.setAge(1000);
        System.out.println(test1);
        System.out.println(test2);


    }
}

class ShallowPeople implements Cloneable{
    String name;
    int age;

    public ShallowPeople(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ShallowPeople{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}