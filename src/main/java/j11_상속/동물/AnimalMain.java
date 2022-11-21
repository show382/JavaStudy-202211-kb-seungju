package j11_상속.동물;

import j11_상속.A;

public class AnimalMain {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        Tiger tiger = new Tiger();

        Animal hAnimal = (Animal) human; //업캐스팅(생략가능)
        Animal tAnimal = tiger;
        Animal[] animals = new Animal[3];

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Animal();

        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }

        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Human) {
                Human h = (Human) animals[i];
                h.readBooks();
            } else if (animals[i] instanceof Tiger){
                Tiger t = (Tiger) animals[i];
                t.hunting();
            }else{
                System.out.println("다운캐스팅 불가");
            }

        }
    }

}
