package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student {
    private int studentCode;
    private String name;
    private String address;

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    //위에 것들이 똑같이 들어간다.
    public static class StudentBuilder{//내부 클래스,Student를 생성해서 다시 생성할 필요가 없다 스테틱 클래스라
        private int studentCode;
        private String name;
        private String address;

        public StudentBuilder studentCode(int studentCode){
            this.studentCode = studentCode;
            return this;//자기자신의 주소를 리턴함
        }
        public StudentBuilder name(String name){
            this.name = name;
            return this;//자기자신의 주소를 리턴함
        }
        public StudentBuilder address(String address){
            this.address = address;
            return this;//자기자신의 주소를 리턴함
        }

        public Student build() {
            return new Student(studentCode, name, address);
        }
    }

}
