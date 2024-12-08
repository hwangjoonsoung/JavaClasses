package day2;

public class InitData {
    public static void main(String[] args) {

        Student1 student1 = new Student1();
        student1.age = 20;
        student1.name = "hwang";
        student1.grade = 100;

        System.out.println(student1.toString());
        Student1 student2 = student1;
        System.out.println(student2.toString());

        student1.grade = 10;
        student1.name = "Kim";
        student1.age = 0;
        System.out.println(student2.toString());
    }
}

class Student1 {

    String name;
    int age;
    int grade;

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
