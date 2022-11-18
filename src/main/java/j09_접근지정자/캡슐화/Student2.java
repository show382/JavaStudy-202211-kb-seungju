package j09_접근지정자.캡슐화;

public class Student2 {
    /*
     */
    private String school;
    private String name;
    private int year;
    private boolean gender;
    public String getSchool() {
        return school;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }

    public boolean setGender(boolean gender) {
        return this.gender = gender;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public boolean isGender() {
        return gender;
    }

}
