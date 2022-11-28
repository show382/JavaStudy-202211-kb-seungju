package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();

//        Student student = new Student(20220001,"문승주", 4 );

        students.add(new Student(20220001, "이승아", 21));
        students.add(new Student(20220002, "문승주", 31));
        students.add(new Student(20220003, "문경원", 27));
        students.add(new Student(20220004, "홍지혜", 24));
        students.add(new Student(20220005, "고동현", 25));

//        Student student2 = students.get(2);
//
//        student2.setAge(26);
//        //이름이 문경원인 학생의 나이를 26세로 바꾸세요.
//        System.out.println(student2);
//        for (int i = 0; i < students.size(); i++) {
//            Student s = students.get(i);
//            if (s.getName().equals("문경원")) {
//                s.setAge(26);
//                break;
//            }
//        }
//        for (Student s : students) {
//            if (s.getName().equals("문경원")) {
//                s.setAge(26);
//                break;
//            }
//        }
//        System.out.println(students);
//        System.out.println("====================");
        // 0번 인덱스 학생의 이름을 다음 인덱스의 학생 이름으로 변경
        //제일 마지막 인덱스의 학생 이름으로 0번 인덱스로 이동
        String lastName = null;
        for (int i = 0; i < students.size(); i++){
            int nowIndex = students.size()-1-i;
            int proIndex = nowIndex -1;
            Student s = students.get(nowIndex);

            if(nowIndex==0){
                s.setName(lastName);
                break;
            }

            if(nowIndex==students.size()-1){
                lastName = s.getName();
            }
            s.setName(students.get(proIndex).getName());
        }
        System.out.println(students);
    }
}