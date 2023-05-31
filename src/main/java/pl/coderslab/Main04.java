package pl.coderslab;

//Uzupełnij ciało metody tak by pobierała z konsoli parametr n, tworzyła tablicę o ilości elementów n.
//Elementy tablicy mają być kolejnymi liczbami naturalnymi zaczynając od 1.

import java.util.Arrays;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(returnTab()));

    }
    static int[] returnTab() {

        System.out.println("Input size of Array: ");
        int size = getInt();

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        return array;
    }

    static int getInt() {
        Scanner scanner = new Scanner(System.in);
        int size ;
        while (!scanner.hasNextInt()) {
            System.out.println("Waiting for a number!");
            scanner.nextInt();
        }
        size = scanner.nextInt();
        return size;
    }
}
