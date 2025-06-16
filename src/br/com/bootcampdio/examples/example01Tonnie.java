package br.com.bootcampdio.examples;

import java.util.Scanner;

public class example01Tonnie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name?: ");
        String personName = sc.nextLine();

        System.out.println("What's your age?: ");
        int personAge = sc.nextInt();

        if (personAge >= 18) {
            System.out.printf("%s you're %d, you can drive!", personName, personAge);
        } else {
            System.out.printf("%s you're %d, you can't drive!", personName, personAge);
        }

    }
}
