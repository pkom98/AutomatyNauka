package SauceLabs.dziedziczenie;

public class DogTestMain {
    public static void main(String[] args) {
        Dog reksio = new Dog("reksio");
        Dog kacper = new Dog("kacper");
        York czilala = new York("czilala");
        Dog harry = new Dog("harry");
        YorkComposited czilalaComposited = new YorkComposited(czilala);
        ADHDYork czilalaadhd = new ADHDYork("czilala");
/*
        reksio.szczekaj();
        kacper.szczekaj();
        czilala.szczekaj();
        czilalaComposited.szczekaj();
        czilalaadhd.szczekaj();*/


        harry.szczekaj();
        reksio.przedstawSie();
        kacper.przedstawSie();
        czilala.przedstawSie();
        czilalaComposited.przedstawSie();



    }
}
