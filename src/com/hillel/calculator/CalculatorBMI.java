package com.hillel.calculator;

import java.text.DecimalFormat;

public class CalculatorBMI {

    public String calculate(double weight, double height) {
        String result = null;

        double BMI = weight / ((height/100) * (height/100));

        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println ("Your BMI is " + df.format(BMI));

        // Category	BMI range - kg / m 2
        // Severe Thinness	< 16
        // Moderate Thinness	16 - 17
        // Normal	17 - 25
        // Overweight	25 - 30
        // Obesity - 30+

        // Test data:
        // BMI < 16 - weight = 35,9; height = 150
        // BMI >= 16.00 && BMI < 17.00 - weight = 36, height = 150;
        //                               weight = 36,5, height = 150;
        //                               weight = 49, height = 170;
        // BMI >= 17.00 && BMI < 25 - weight = 68, height = 200;
        //                            weight = 50, height = 170;
        //                            weight = 72, height = 170;
        // BMI >= 25.00 && BMI < 30.00) - weight = 100, height = 200;
        //                                weight = 72,5, height = 100;
        //                                weight = 67,3, height = 150;
        // BMI >= 30.00 - weight = 86,7, height = 170;
        //                weight = 87, height = 170;

         if (BMI < 16) {
            result = "Severe Thinness";
        } else if
            (BMI >= 16.00 && BMI < 17.00)
        {result = "Moderate Thinness";
        } else if
            (BMI >= 17.00 && BMI < 25)
        {result = "Normal";
        }else if
            (BMI >= 25.00 && BMI < 30.00)
        {result = "Overweight";
        }else if (BMI >= 30.00)
        {result = "Obesity";
    }
        return result;
    }
}
