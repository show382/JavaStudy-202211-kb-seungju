package j13_Object;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StudentMain {

    public static void print(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Student student = new Student(20220001, "문승주");
        Student student2 = new Student(20220001, "문승주");
        System.out.println(student.toString());
        System.out.println(student == student2);
        System.out.println(student.equals(student2));

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        Class c = student.getClass();
        System.out.println(c);
        System.out.println(c.getName());//패키지_클래스명
        System.out.println(c.getSimpleName());//클래스 이름만
        Field[] fields = c.getDeclaredFields();//해당 클래스의 변수명을 가져온다
        for(int i = 0; i < fields.length; i++){
            System.out.println(fields[i].getName());
        }
        Method[] methods = c.getDeclaredMethods();
        for(int i = 0; i < methods.length; i++){
            System.out.println(methods[i].getName());
            }
    }
}
