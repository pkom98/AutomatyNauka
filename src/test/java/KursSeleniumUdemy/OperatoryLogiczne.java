package KursSeleniumUdemy;

public class OperatoryLogiczne {
    public static void main(String[] args) {

        boolean firstValue = true;
        boolean secondValue = false;
        boolean thirdValue = true;
        boolean fourthValue = false;

        System.out.println(firstValue && secondValue);
        System.out.println(firstValue && thirdValue);
        System.out.println(fourthValue || secondValue);
        System.out.println(!firstValue);
    }
}
// && = true, wtedy gdy oba wyrazenia są true. Jezeli jest true i false to bedzie "False" (LOGIKA) 0 , 1 = 0
// || = true, wtedy gdy jedno z wyrazen jest true "||" to lub. Jezeli oba sa false, to wynik bedzie false.
// ! negacja - zwraca wartosc przeciwna. Jezeli firstValue jest rowne true, to zwroci false.