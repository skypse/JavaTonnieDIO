package br.com.bootcampdio.exercisies;

import java.util.Scanner;

public class ex02Tonnie {
    public static void main(String[] args) {
        /*
        * -> Write a code that takes the size of the side of a square, calculates its area and displays it on the screen
        * -> Formula: area = side X side
        * */
        Scanner sc = new Scanner(System.in);
        // SIDE A
        System.out.println("Write the side A: ");
        double sideA = sc.nextDouble();
        // SIDE B
        System.out.println("Write the side B: ");
        double sideB = sc.nextDouble();
        double resultArea = sideA * sideB;
        System.out.println("The area of the side is " + resultArea);
        sc.close();
    }
}
