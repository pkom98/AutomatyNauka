package SauceLabs.polimorfizm;

//POLIMORFIZM
public class AnimalMain {

    public static void main(String[] args) {

        Animal animal = new Animal();
        Animal cat = new Cat(); //KAZDY TU JEST ANIMALEM
        Animal dog = new Dog();
        Animal human = new Human();

        cat.move();
        dog.move();
        human.move();

        human = dog; // PRZEZ TO ZE OBAJ SA ANIMALEM MOGE PRZYPISAC DOGA DO HUMANA
        human.move();
    }
}
