package PT.tostring;

public class BadObject {
    public String toString (Car car){
        return car.sound;
    }

    public String toString (Bear bear){
        return bear.sound;
    }

    public String toString (Person person){
        return person.sound;
    }
}

class Car{
    public Car(String sound) {
        this.sound = sound;
    }

    String sound;

    @Override
    public String toString() {
        return "Car{" +
                "sound='" + sound + '\'' +
                '}';
    }
}
class Bear{
    public Bear(String sound) {
        this.sound = sound;
    }

    public String sound;

    @Override
    public String toString() {
        return "Bear{" +
                "sound='" + sound + '\'' +
                '}';
    }
}

class Person{
    public String sound;

    public Person(String sound) {
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Person{" +
                "sound='" + sound + '\'' +
                '}';
    }
}