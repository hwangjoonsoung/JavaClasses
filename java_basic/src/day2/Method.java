package day2;

import sun.util.resources.de.CurrencyNames_de_GR;

public class Method {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "hwang";
        student1.age = 20;
        student1.grade = 80;

        Student student2;
        student2 = new Student();
        student2.name = "park";
        student2.age = 30;
        student2.grade = 90;
        printStudent(student1);
        printStudent(student2);

        Student student3 = new Student();
        initStudent(student3 , "kim" , 15,20);
        printStudent(student3);

        Student student = createStudent("jang" , 20 ,50);
        printStudent(student);
    }

    static void printStudent(Student student){
        System.out.println("이름 :"+ student.name + " 나이 : "+student.age + " 성적 : "+student.grade);
    }
    static void initStudent(Student student , String name , int age , int grade){
        student.age = age;
        student.grade =grade;
        student.name = name;
    }

    static Student createStudent( String name , int age , int grade){
        Student student = new Student();
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }
}


class Student{
    String name;
    int age;
    int grade;



}