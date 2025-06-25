package br.com.bootcampdio.exercisies;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex06Tonnie {
    public static void main(String[] args) {
        /*
        Write a code where the user enters their height and weight, their BMI is calculated
        (BMI = weight/(height * height)) and a message is displayed according to the result:
            - If it is less than or equal to 18.5 "Underweight";
            - If it is between 18.6 and 24.9 "Ideal weight";
            - If it is between 25.0 and 29.9 "Slightly overweight";
            - If it is between 30.0 and 34.9 "Obesity Grade I";
            - If it is between 35.0 and 39.9 "Obesity Grade II (Severe)";
            - If it is greater than or equal to 40.0 "Obesity Grade III (Morbid)";
            */
        Scanner sc = new Scanner(System.in);

        // height
        System.out.println("What is your height? in M: (example 1.80)");
        float height = sc.nextFloat();
        // weight
        System.out.println("What is your weight? in KG: (80.00)");
        float weight = sc.nextFloat();

        DecimalFormat df = new DecimalFormat("0.00");

        double imcCalc = weight / (height * height);
        if (imcCalc >= 40.0)
        {
            System.out.println("Obesity Grade III (Morbid): " + df.format(imcCalc));

        } else if (imcCalc >= 35.00)
        {
            System.out.println("Obesity Grade II (Severe): " + df.format(imcCalc));
        } else if (imcCalc >= 30.00)
        {
            System.out.println("Obesity Grade I: " + df.format(imcCalc));
        } else if (imcCalc >= 25.00)
        {
            System.out.println("Slightly overweight: " + df.format(imcCalc));

        } else if (imcCalc >= 18.6)
        {
            System.out.println("Ideal weight: " + df.format(imcCalc));

        } else
        {
            System.out.println("Underweight: " + df.format(imcCalc));
        }
        sc.close();
    }
}
