package j14_스태틱.빌더;

import j15_제네릭.Information;
import j15_제네릭.Teacher;

public class StudentMain {
    public static void main(String[] args) {
        Student student = Student.builder()
                .studentCode(20220001)
                .address("부산")
                .name("승주")
                .build();
        System.out.println(student);
        Student.StudentBuilder sb =new Student.StudentBuilder();

        Teacher teacher = Teacher.builder()
                .name("김준일")
                .techerCode(200)
                .build();


    }
}
