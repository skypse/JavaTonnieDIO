package br.com.bootcampdio.examples;

import java.util.Scanner;

public class example03Tonnie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7: ");
        int option = sc.nextInt();
        String message = switch (option){
            case 1, 7 -> {
                String day = option == 1 ? "Domingo" : "Sábado";
                yield String.format("Hoje é %s, fim de semana!!", day);
            }
            case 2 -> "Segunda-feira";
            case 3 -> "Terça-feira";
            case 4 -> "Quarta-feira";
            case 5 -> "Quinta-feira";
            case 6 -> "Sexta-feira";
            default -> "Opção invalida!";
        };
        System.out.println(message);
    }
}
