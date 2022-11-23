package j13_Object;

import lombok.*;

import java.util.Objects;

/*
    정보를 담는 클래스 Entity
    그리고 objects 와 같이 기능들을 담는 클래스
 */

@NoArgsConstructor//기본 생성자 noArgs = 매개변수가 없다 = 기본생성자라는 말
@AllArgsConstructor//매서드
//@Getter
//@Setter
//@EqualsAndHashCode
//@ToString
@Data//위에 기능들을 다 포함한다
public class Entity {
    private String name;
    private int age;
    private Object address;

    public  boolean cmp(){
        return this.getClass()== Entity.class;
    }
}