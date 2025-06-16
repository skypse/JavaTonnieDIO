package br.com.bootcampdio.examples;

import java.util.Scanner;

public class example04Tonnie {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++ ) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
