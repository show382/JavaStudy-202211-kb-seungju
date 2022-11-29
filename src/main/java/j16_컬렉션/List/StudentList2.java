package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList2 {

    public static void main(String[] args) {
//        List<Hobby> hobbyList = Arrays.asList(new Hobby[]{
//                new Hobby(1, "축구"),
//                new Hobby(2, "농구"),
//                new Hobby(3, "골프"),
//                new Hobby(4, "음악감상")});
//
//        String[] names = new String[]{"문승주1", "문승주2", "문승주3"};
//
//        List<String> nameList;
//
//        nameList = Arrays.asList(names);
//
//        for(Hobby h : hobbyList){
//            System.out.println(h);
//        }
//
//        Object[] nameArray = nameList.toArray();
//        System.out.println((String)nameArray[0]);

        List<Hobby> hl = Arrays.asList(new Hobby[]{
                new Hobby(1, "축구"),
                new Hobby(2, "농구"),
                new Hobby(3, "골프"),
                new Hobby(4, "음악감상")});

        Student s1 =Student.builder()
                .studentId(20220001)
                .name("문승주")
                .age(31)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(0), hl.get(2)}))
//                .hobbyList(hl)
                .build();
        System.out.println(s1);

        Student s2 =Student.builder()
                .studentId(20220001)
                .name("장건녕")
                .age(23)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(1), hl.get(2)}))
                .build();
        System.out.println(s2);

        Student s3 =Student.builder()
                .studentId(20220001)
                .name("문경원")
                .age(27)
                .hobbyList(Arrays.asList(new Hobby[]{hl.get(0), hl.get(2)}))
                .build();
        System.out.println(s1);

        List<Student> sl = new ArrayList<Student>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);
        for(Student s : sl){
            System.out.println("<학생정보>");
            System.out.println(s);
            System.out.println("<" + s.getName() + "학생취미>");
            for(Hobby h : s.getHobbyList()){
                System.out.println(h);
            }
            System.out.println();
        }
    }

}
