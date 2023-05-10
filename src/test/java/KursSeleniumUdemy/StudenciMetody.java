package KursSeleniumUdemy;

public class StudenciMetody {

    public String firstName;
    public String lastName;
    public int age;
    public String dateOfBirth;
    public String email;

    public void studentInformation(){
        System.out.println("Imie: " + firstName);
        System.out.println("Nazwisko: " + lastName);
        System.out.println("Wiek: " + age);
        System.out.println("Data urodzenia: " + dateOfBirth);
    }

    public void studentEmail(){
        System.out.println("Email: " + email);
    }

}
