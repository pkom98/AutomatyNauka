package SauceLabs.dziedziczenie;

//W JAVIE MOZNA DZIEDZICZYC TYLKO PO 1 klasie
//DZIEDZICZENIE extends
public class York extends Dog { // <---- DOG jest klasa nadrzedna dla Yorka

    public York(String name) {
        super(name); // <---- WYWOLUJE KONSTRUKTOR  KLASY NADRZEDNEJ
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem yorkiem z imieniem " + name);
    }
}
