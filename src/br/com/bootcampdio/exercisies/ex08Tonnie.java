package br.com.bootcampdio.exercisies;

import java.util.Scanner;

public class ex08Tonnie {
    public static void main(String[] args) {
        /*
        * Escreva um código onde o usuário informa um número inicial,
        * posteriormente irá informar outros N números,
        * a execução do código irá continuar até que o número informado dividido pelo primeiro número
        * tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados
        * */
        Scanner sc = new Scanner(System.in);

        int initialNumber;
        int currentNumber;

        // scanning first number
        System.out.println("Digite o número inicial (um número inteiro positivo):");
        initialNumber = sc.nextInt();

        if (initialNumber <= 0) {
            System.out.println("O número inicial deve ser um inteiro positivo. Por favor, reinicie o programa.");
            sc.close();
            return;
        }

        System.out.println("\nNúmero inicial definido como: " + initialNumber);
        System.out.println("Agora, digite outros números. O programa continuará até que um número,");
        System.out.println("dividido pelo número inicial, tenha resto diferente de zero.");
        System.out.println("Números menores que o número inicial serão ignorados.");

        while (true) {
            System.out.println("Digite o próximo número:");
            currentNumber = sc.nextInt();

            // ignore numbers smaller than initialNumber
            if (currentNumber < initialNumber) {
                System.out.println("Número ignorado: é menor que o número inicial.");
                continue; // go to the next iteration of the loop
            }

            // check the division remainder
            if (currentNumber % initialNumber != 0) {
                System.out.println("O número " + currentNumber + " dividido por " + initialNumber + " tem resto diferente de zero!");
                break;
            } else {
                System.out.println("O número " + currentNumber + " é divisível por " + initialNumber + ", continue digitando....");
            }
        }
        sc.close();

    }
}
