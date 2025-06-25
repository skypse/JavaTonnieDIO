package br.com.bootcampdio.exercisies;

import java.util.Scanner;

public class ex05Tonnie {
    public static void main(String[] args) {
        // Write a code where the user enters a number and the table from 1 to 10 of that number is generated
        Scanner sc = new Scanner(System.in);

        System.out.println("----------_Multiplication_Table_----------");
        // Enter a number
        System.out.println("Please enter the number you want to make the multiplication table:");
        int tabuadaNumber = sc.nextInt();
        int contador = 1;

        while (contador <= 10) {
            System.out.printf("%d x %d = %d\n", tabuadaNumber, contador, tabuadaNumber * contador);
            contador++;
        }
        sc.close();
    }
}
