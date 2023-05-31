package pl.coderslab;

import java.util.Arrays;
import java.util.Random;

//Uzupełnij ciało metody tak by zwracała tablicę losowych liczb z zakresu [1 - interval].
//Elementy tablicy mają być jednocześnie podzielne przez 2 i niepodzielne przez 3.
//Ilość elementów w tablicy ma być równa parametrowi size.
//Tablica nie może zawierać pustych elementów. (pamiętaj że domyślna wartość w tablicy dla typu int to 0)

public class Main03 {

    public static void main(String[] args) {

        int[] result = div(4,20);
        System.out.println(Arrays.toString(result));
    }

    static int[] div (int size, int interval) {

        Random random = new Random();
        int[] array = new int[size];
        int count = 0;

        while (count < size) {
            int randomNumber = random.nextInt(interval + 1);
            if (randomNumber % 2 == 0 && randomNumber % 3 != 0) {
                array[count] = randomNumber;
                count++;
            }
        }

        for (int i = array.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            int temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

}
