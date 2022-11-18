package j08_클래스;

import j09_접근지정자.캡슐화.Student2;

public class StudentMain {
    public static void main(String[] args) {
        Student student;
        student = new Student();
        student.showStudentInfo("북경이공대", "문승주", 4, true);
        System.out.println(student.getName());
        Student2 student2 = new Student2() ;
        student2.setSchool("이공대");
        System.out.println(student2.getSchool());
        System.out.println(student2.setGender(true));

    }
}
