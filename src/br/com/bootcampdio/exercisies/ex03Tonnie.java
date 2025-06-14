package br.com.bootcampdio.exercisies;

import java.util.Scanner;

public class ex03Tonnie {
    public static void main(String[] args) {
        /*
        * -> Write a code that takes the base and height of a rectangle, calculates its area and displays it on the screen.
        * -> Formula: Area = Base X Height
        * */
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your base: ");
        double base = sc.nextDouble();

        System.out.println("Write your height: ");
        double height = sc.nextDouble();

        double areaResult = base * height;
        System.out.println("The area of the side is " + areaResult);
        sc.close();
    }
}
