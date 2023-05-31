package pl.coderslab;

//pobierała z konsoli promień r,
//zwracała obliczoną objętość kuli.

import java.util.Scanner;

public class Main05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius : ");
        double radius = scanner.nextDouble();

        double volume = sphere(radius);
        System.out.println("Volume of sphere is : " + volume);

    }

    static double sphere(double radius) {

        double volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
        return volume;
    }
}
