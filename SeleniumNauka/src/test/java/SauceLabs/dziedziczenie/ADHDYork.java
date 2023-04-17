package SauceLabs.dziedziczenie;


import SauceLabs.dziedziczenie.York;

//DZIEDZICZENIE extends
public class ADHDYork extends York {

    public ADHDYork(String name) {
        super(name);
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem yorkiem hau hau mam adhd z imieniem " + name);
    }
}
