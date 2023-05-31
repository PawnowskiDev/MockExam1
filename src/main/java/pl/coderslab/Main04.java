package pl.coderslab;

//Uzupełnij ciało metody tak by pobierała z konsoli parametr n, tworzyła tablicę o ilości elementów n.
//Elementy tablicy mają być kolejnymi liczbami naturalnymi zaczynając od 1.

import java.util.Arrays;
import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Insert size of array: ");
        int arraySize = scan.nextInt();
        int[] array = returnTab(arraySize);
        System.out.println(Arrays.toString(array));

    }
    static int[] returnTab(int n) {

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = i + 1;
        }
        return array;
    }
}
