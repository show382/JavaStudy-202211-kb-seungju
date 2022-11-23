package j13_Object;

import java.util.Objects;

public class Student {
    private  int code;
    private  String name;

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return code == student.code && Objects.equals(name, student.name);
    }
//hash 코드는 데이터 값을 합쳐서 만든 코드
//그래서 hash끼리 비교해서 값이 같으면 참조형 클래스 안에 내용이 같다
//equals는
    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }
}
