package j13_Object;

public class ObjectArray {

    public static Object getObject(Object obj){
        return obj;
    }

    public static void main(String[] args) {
        Object[] object = new Object[7];
        object[0] = new Student(20220001, "문승주");
        object[1] = new Car("EV6","인터스텔라 그레이");
        object[2] = new Student(20220002, "김건영");
        object[3] = new Car("K5", "블랙");
        object[4] = new Student(20220003, "임지현");
        object[5] ="문경원";
        object[6] = 20221123;

        for(int i = 0; i <object.length; i++) {
            System.out.println(object[i]);
        }
        System.out.println(object[5].getClass());
        System.out.println(object[6].getClass());
    }
}
