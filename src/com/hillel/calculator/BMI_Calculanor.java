package com.hillel.calculator;
import java.text.DecimalFormat;
import java.util.Scanner;
public class BMI_Calculanor {
 // weight (kg) / height (m)^2
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in kilograms: ");
        double weight = input.nextDouble();
// weight { -0,001, 0, 250, 250,001}
        if (weight >= 0 && weight <= 250) {
            System.out.println(weight);
        }
        else if (weight < 0 || weight > 250) {
            System.out.println("Please enter a valid value from 0 to 250");
            weight = input.nextDouble();
        }

        System.out.println("Enter height in in centimeters: ");
        double height = input.nextDouble();
// height {-0,01, 0, 250, 250,01}
        if (height >= 0 && height <= 250) {
            System.out.println(height);
        }
        else if (height < 0 || height > 250) {
            System.out.println("Please enter a valid value from 0 to 250");
            height = input.nextDouble();
        }

        input.close();

        System.out.println("Your weight and height: ");
        System.out.println(weight);
        System.out.println(height);


        CalculatorBMI calculator = new CalculatorBMI();
        String result = calculator.calculate(weight, height);
        String resultBMI = calculator.calculate(weight, height);
        System.out.println(result);


    }
}
