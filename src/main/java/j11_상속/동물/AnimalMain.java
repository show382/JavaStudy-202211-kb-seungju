package j11_상속.동물;

import j11_상속.A;

public class AnimalMain {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Human human = new Human();
        Tiger tiger = new Tiger();


        Animal hAnimal =  human; //업캐스팅(생략가능)
        Animal tAnimal = tiger;
        Animal[] animals = new Animal[5];

        animals[0] = new Human();
        animals[1] = new Tiger();
        animals[2] = new Human();
        animals[3] = new Tiger();
        animals[4] = new Human();
        ((Human)animal).readBooks();
        ((Human)hAnimal).readBooks();
        hAnimal.move();
        human.move2();
        System.out.println("[업캐스팅]");
        for (int i = 0; i < animals.length; i++) {
            animals[i].move();
        }
        System.out.println("[다운캐스팅]");
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Human) {
                ((Human) animals[i]).readBooks();
            } else if (animals[i] instanceof Tiger) {
                ((Tiger) animals[i]).hunting();
            }

        }
    }

}
