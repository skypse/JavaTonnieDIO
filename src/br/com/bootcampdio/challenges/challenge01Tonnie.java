package br.com.bootcampdio.challenges;

import java.util.Scanner;

public class challenge01Tonnie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String expectedDomain = "@company.com";
        String email = scanner.nextLine();

        // verificar se o email contém o dominio esperado:
        if (email.contains("@company.com"))
        {
            System.out.println("E-mail valido");
        } else {
            System.out.println("E-mail invalido");
        }
    }
}
