package KursSeleniumUdemy;

public class ListOfStudents {
    public static void main(String[] args) {

        StudenciMetody student1 = new StudenciMetody();
        student1.firstName = "Tomek";
        student1.lastName = "Kowalski";
        student1.age = 22;
        student1.dateOfBirth = "21-10-1998";
        student1.email = "tomekk@gmail.com";

        StudenciMetody student2 = new StudenciMetody();
        student2.firstName = "Pablo";
        student2.lastName = "Tera";
        student2.age = 18;
        student2.dateOfBirth = "22-09-2000";
        student2.email = "pablot@gmail.com";

        StudenciMetody student3 = new StudenciMetody();
        student3.firstName = "Natalia";
        student3.lastName = "Toruńska";
        student3.age = 21;
        student3.dateOfBirth = "18-07-1997";
        student3.email = "nataliat@gmail.com";

        StudenciMetody[] tablicaStudentow = new StudenciMetody[3];
        tablicaStudentow[0] = student1;
        tablicaStudentow[1] = student2;
        tablicaStudentow[2] = student3;

        for (int i = 0; i < tablicaStudentow.length; i++){
            tablicaStudentow[i].studentInformation();
            tablicaStudentow[i].studentEmail();
            System.out.println("\n");


        }
    }


}
