package day1;

public class ClassStart1 {
    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름 :" + student1Name + " 나이 : " + student1Age + " 성적 : " + student1Grade);
        System.out.println("이름 :" + student2Name + " 나이 : " + student2Age + " 성적 : " + student2Grade);
        /*
        효율적이지 않다...
        해결하기 위해서는 변수명의 통일이 필요한데 사용할 수 있는건 배열을 사용할 수 있다.
         */
        System.out.println("=======================================================================");

        String[] studentName = {"학생1", "학생2"};
        int[] studentAge = {15, 16};
        int[] studentGrade = {90, 80};

        for (int i = 0; i < studentAge.length; i++) {
            System.out.println("이름 :" + studentName[i] + " 나이 : " + studentAge[i] + " 성적 : " + studentGrade[i]);
        }
        /*
        효율적이지 않다...
        학생을 지운다고 했을때 해당 모든 배열의 인덱스에 접근해서 삭제해 줘야 하기 때문에 사람이 관리하기 불편하다.

         */

        System.out.println("=======================================================================");
        Student student1 = new Student();
        student1.name = "hwang";
        student1.age = 20;
        student1.grade = 80;

        Student student2;
        student2 = new Student();
        student2.name = "park";
        student2.age = 30;
        student2.grade = 90;

        System.out.println("이름 :" + student1.name + " 나이 : " + student1.age + " 성적 : " + student1.grade);
        System.out.println("이름 :" + student2.name + " 나이 : " + student2.age + " 성적 : " + student2.grade);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println("=======================================================================");
        Student[] students = new Student[2];

        //자바의 대입은 항상 변수를 복사해서 대입한다.
        students[0] = student1;
        students[1] = student2;
        System.out.println("이름 :" + students[0].name + " 나이 : " + students[0].age + " 성적 : " + students[0].grade);
        System.out.println("이름 :" + students[1].name + " 나이 : " + students[1].age + " 성적 : " + students[1].grade);
        System.out.println("============================리팩터링==================================");
        String newInstance = new String();

        Student[] studentArr = {student1, student2};
        for (int i = 0; i < studentArr.length; i++) {
            System.out.println("이름 :" + students[i].name + " 나이 : " + students[i].age + " 성적 : " + students[i].grade);
        }
        for (Student s : studentArr) {
            System.out.println("이름 :" + s.name + " 나이 : " + s.age + " 성적 : " + s.grade);
        }
        for (Student student : studentArr) {

        }

    }
}

class Student {
    String name;
    int age;
    int grade;

}