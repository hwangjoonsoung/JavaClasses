package PT.copy;

import java.util.Objects;

public class DeepCopy {

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepPeople person1 = new DeepPeople("person1", 100);
        DeepPeople person2 = person1.clone();

        person1.setAge(2000);
        System.out.println(person1);
        System.out.println(person2);
    }

}

class DeepPeople implements Cloneable{
    String name;
    int age;

    public DeepPeople(String name, int age) {
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
    protected DeepPeople clone() throws CloneNotSupportedException {
        return (DeepPeople)super.clone();
    }

    @Override
    public String toString() {
        return "DeepPeople{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DeepPeople that = (DeepPeople) o;
        return age == that.age && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

