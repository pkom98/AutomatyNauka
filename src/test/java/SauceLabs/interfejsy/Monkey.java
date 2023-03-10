package SauceLabs.interfejsy;

public class Monkey implements Animal {
    @Override
    public void move() {
        System.out.println("Im monkey and Im moving");
    }

    @Override
    public void eat() {
        System.out.println("Im monkey and Im eating");
    }
}
