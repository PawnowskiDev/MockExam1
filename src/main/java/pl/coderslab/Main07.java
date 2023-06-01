package pl.coderslab;

//Uzupełnij ciało metody tak aby zwracała sumę cyfr umieszczonych w napisie
//Przykład 1: Dla napisu: Wynik dodawania 1 i 2 to 3 zwróci 6.
//Przykład 2: Dla napisu: PO5ZUK4J I DOD4J UKRYT3 CYFRY zwróci 16.
//Aby zamienić napis na wartość liczbową typu int możesz skorzystać z poniższego przykładu:
//Dodaj obsługę możliwego wyjątku.

public class Main07 {

    public static void main(String[] args) {

        String str = "wynik dodawania 2 + 2 wynosi 4";

        System.out.println("Wynik sumy wynosi : " + countNumbers(str));

    }

    static int countNumbers (String str) {

        int sum = 0;

        try {
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (Character.isDigit(c)) {
                    int digit = Character.getNumericValue(c);
                    sum += digit;
                }
            }
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        return sum;
    }
}
