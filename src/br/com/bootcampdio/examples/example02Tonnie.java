package br.com.bootcampdio.examples;

import java.util.Scanner;

public class example02Tonnie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número de 1 até 7: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                System.out.println("Sábado");
                break;
                case 2:
                    System.out.println("Segunda-Feira");
                    break;
                    case 3:
                        System.out.println("Terça-Feira");
                        break;
                        case 4:
                            System.out.println("Quarta-Feira");
                            break;
                            case 5:
                                System.out.println("Quinta-Feira");
                                break;
                                case 6:
                                    System.out.println("Sexta-Feira");
                                    break;
                                    case 7:
                                        System.out.println("Domingo");
                                        break;
                                        default:
                                            System.out.println("Opção invalida!");
        }
    }
}
