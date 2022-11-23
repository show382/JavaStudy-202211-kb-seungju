package j11_상속.동물;
/*\
    상속을 받은 클래스를 new 하면 상위 클래스도 같이 생성된다.
 */
public class Human extends Animal {
    public Human() {
        super();//상위 객체
        System.out.println("Human 객체 생성");
    }
public void  move2(){
        super.move();
}
    @Override // @붙은 문법 -> 어노테이션
    public void move(){
                System.out.println("사람이 두 발로 걷습니다.");
    }


    public void readBooks(){
        System.out.println("사람이 책을 읽습니다.");
    }

}
