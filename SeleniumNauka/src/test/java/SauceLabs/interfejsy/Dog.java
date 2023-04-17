package SauceLabs.interfejsy;

//IMPLEMENTACJA INTERFEJSU
public class Dog implements Animal {

    @Override
    public void move() {
        System.out.println("Im dog and Im moving");
    }

    @Override
    public void eat() {
        System.out.println("Im dog and Im eating");
    }
}
