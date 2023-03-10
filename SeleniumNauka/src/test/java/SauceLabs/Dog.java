package SauceLabs;

public class Dog {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public void eat(String foodName) {
        System.out.println("I'm " + name + " and I'm eating " + foodName);
    }

    public void szczekaj() {
        System.out.println(name + " Hau hau hau");
    }

    public void przedstawSie() {
        System.out.println("Jestem " + name);
    }


}
