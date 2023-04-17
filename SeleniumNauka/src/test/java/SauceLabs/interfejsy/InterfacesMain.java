package SauceLabs.interfejsy;

public class InterfacesMain {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal monkey = new Monkey();
        Monkey monkey2 = new Monkey();
//        monkey = dog; //TAK  MOZNA BO SA JEDNYM INTERFEJSEM
//        monkey2 = dog; //TAK NIE MOZNA
        dog.eat();
    }
}

