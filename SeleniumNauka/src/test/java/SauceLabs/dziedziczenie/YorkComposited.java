package SauceLabs.dziedziczenie;


//PODEJSCIE NR 2 do reuzywania kodu czyli kompozycja
//KOMPOZYCJA
public class YorkComposited {

    private Dog dog;

    public YorkComposited(Dog dog) {
        this.dog = dog;
    }

    public void eat(String foodName) {
        dog.eat(foodName);
    }

    public void szczekaj() {
        dog.szczekaj();
    }

    public void przedstawSie() {
        System.out.println("Jestem yorkiem z imieniem " + dog.name);
    }
}
