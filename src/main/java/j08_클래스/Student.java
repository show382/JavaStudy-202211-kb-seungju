package j08_클래스;

public class Student {
    private String schoolName = null;
    private String name = null;
    int grade = 0;
    public boolean genders = true;
    public void Student(){

    }
    public void Student(String schoolName, String name){
        this.schoolName = schoolName;
        this.name = name;

    }
    public String getName(){
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void showStudentInfo(String s, String n, int g, boolean x) {
        schoolName = s;
        name = n;
        grade = g;
        genders = x;

        System.out.println("학교명 : " + schoolName);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
        System.out.println("성별 : " + (genders ? "남" : "여"));
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.getName();

    }
}
