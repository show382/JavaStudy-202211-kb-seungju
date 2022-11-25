package j15_제네릭;

public class ResponseMain {
//<?extends people> people을 상속 받은 것들만 가능
    //<?super teacher> teacher 하고 people만 가능하다.
    public static CMRespDto<?extends Object> response(String msg, Object data){
        return new CMRespDto<>(msg, data);
    }

    public static void main(String[] args) {
        Student student = Student.builder()
                .Name("문승주")
                .StudentCode(20220001)
                .build();

        System.out.println(response("학생데이터 응답",student));
        System.out.println(response("student code error!!","학번에 오류가 있습니다."));


    }
}
