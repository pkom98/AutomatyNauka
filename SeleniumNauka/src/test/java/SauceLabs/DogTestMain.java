package SauceLabs;

public class DogTestMain {
    public static void main(String[] args) {
        Dog reksio = new Dog("reksio");
        Dog kacper = new Dog("kacper");

        reksio.szczekaj();
        kacper.szczekaj();

        reksio.przedstawSie();
        kacper.przedstawSie();

        reksio.eat("Szynka");
    }
}
