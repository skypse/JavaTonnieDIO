package br.com.bootcampdio.exercisies;

import java.util.Scanner;

public class ex07Tonnie {
    public static void main(String[] args) {
        /*
        * Write a code in which the user enters a first number,
        * a second number greater than the first and chooses between the even and odd option,
        * the code must then enter all the odd or even numbers
        * (according to the initial selection) in the range of numbers entered,
        * including the numbers entered and in descending order;
        * */
        Scanner sc = new Scanner(System.in);
        // first number sc
        System.out.println("Write the first number: ");
        int firstNum = sc.nextInt();
        System.out.println("Remember that the second number has to be bigger than the first!");
        // second number sc
        System.out.println("Write the first second: ");
        int secondNum = sc.nextInt();
        // even or odd
        System.out.println("Choose between ‘even’ or ‘odd’: ");
        String escolha = sc.next().trim().toLowerCase();

        if (escolha.equals("even"))
        {
            System.out.println("You chose ``even``");
            for (int i = firstNum; i <= secondNum; i++)
            {
                if(i % 2 ==0 )
                {
                    System.out.println(i + " is even");
                }
            }
        } else if (escolha.equals("odd"))
        {
            System.out.println("You chose ``odd``");
            for (int i = firstNum; i <= secondNum; i++)
            {
                if(i % 2 != 0 )
                {
                    System.out.println(i + " is odd");
                }
            }
        } else
        {
            System.out.println("Invalid choice. Please enter ‘even’ or ‘odd’.");
        }
        sc.close();
    }
}
