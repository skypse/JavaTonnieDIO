package br.com.bootcampdio.exercisies;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class ex01TonnieJava {
    /*
     * 1-) Write a code that receives someone's year and date of birth and prints the following message on the screen:
     * “Hello ‘Joe’ you are ‘X’ years old”
    * */


    public static void main(String[] args) {
        // scanner
        Scanner sc = new Scanner(System.in);

        // name
        System.out.println("What is your name? ");
        String name = sc.nextLine();

        // user birthdate
        LocalDate birthDate = null; // initialize birthdate null
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // loop valid date
        while(birthDate == null){
            System.out.println("What is your birthday? (DD/MM/YYYY): ");
            String birthdayDate = sc.nextLine();

            try {
                // Attempt to parse the string into a LocalDate object
                birthDate = LocalDate.parse(birthdayDate, formatter);
            } catch (DateTimeParseException e) {
                // If parsing fails, print an error message and the loop continues
                System.out.println("Invalid date format! Please use DD/MM/YYYY (example: 31/07/2005).");
            }

            // calculate age
            LocalDate currentDate = LocalDate.now();
            Period agePeriod = Period.between(birthDate, currentDate);
            int ageInYears = agePeriod.getYears();

            System.out.printf("Hello %s! you are %d",name, ageInYears);
            sc.close();
        }
    }
}
