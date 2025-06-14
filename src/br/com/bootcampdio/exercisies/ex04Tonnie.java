package br.com.bootcampdio.exercisies;

import java.util.Scanner;

public class ex04Tonnie {
    public static void main(String[] args) {
        /*
        * Write a code that receives the name and age of 2 people and prints the age difference between them
        * */
        Scanner sc = new Scanner(System.in);

        System.out.println("---- Age Difference Calculator ----");
        // first person
        System.out.println("Write your name: ");
        String firstPersonaName = sc.nextLine();
        System.out.print("Type the age of: " + firstPersonaName + ": ");
        int firstPersonaAge = sc.nextInt();

        // ignore, just for not break the scanner
        sc.nextLine();
        System.out.println();

        // second person
        System.out.println("Write your name: ");
        String secondPersonaName = sc.nextLine();
        System.out.print("Type the age of: " + secondPersonaName + ": ");
        int secondPersonaAge = sc.nextInt();

        // age difference
        int ageDifference = Math.abs(firstPersonaAge -secondPersonaAge);
        System.out.printf("the difference between %s and %s is %d years\n", firstPersonaName, secondPersonaName, ageDifference);
        sc.close();
    }
}
