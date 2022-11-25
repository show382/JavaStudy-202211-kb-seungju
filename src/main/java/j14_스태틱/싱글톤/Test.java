package j14_스태틱.싱글톤;

import lombok.Getter;

public class Test {

    private static Test instance = null;
//    @Getter
    private String abc;

//    public String getAbc() {
//        return abc;
//    }

    private Test(){
        abc = "abc";
        System.out.println(abc);
    }
    public static Test instance(){
        if(instance == null){
            instance = new Test();
        }
        return instance;
    }
    public static void main(String[] args) {
        Test test = new Test();
//        test.abc;
    }
}
