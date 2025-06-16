package br.com.bootcampdio.examples;

import java.util.Scanner;

public class example01Tonnie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What's your name?: ");
        String personName = sc.nextLine();

        System.out.println("What's your age?: ");
        int personAge = sc.nextInt();
        System.out.println("");
        sc.nextLine();
        System.out.println("Are you emancipated?: (y/n)");
        String isEmancipated = sc.nextLine().equalsIgnoreCase("y") ? "yes" : "no";

        // short way
        boolean canDrive = (personAge >= 18) || (personAge >= 16 && isEmancipated.equalsIgnoreCase("yes"));
        String message = canDrive ?
                personName + ", you can drive! \n":
                personName + ", you can't drive! \n";
        System.out.println(message);

        /*if (personAge >= 18) {
            System.out.printf("%s you're %d, you can drive!", personName, personAge);
        } else if (personAge >= 16 && isEmancipated.equalsIgnoreCase("yes")) {
            System.out.printf("%s, although you are %d years old, you are emancipated and can drive!", personName, personAge);
        }
        else {
            System.out.printf("%s you're %d, you can't drive!", personName, personAge);
        }*/
        sc.close();
    }
}
