/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmicalculator;

/**
 *
 * @Luis Victores 21384
 */
import java.util.Scanner;

public class BMICalculator {

    private static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Your height in meters: ");
        double m = kb.nextDouble();
        System.out.print("Your weight in kilograms: ");
        double k = kb.nextDouble();
        BMICalculator(k, m);
    }

    public static void BMICalculator(double weight, double height) {
        double BMI = weight / height / height;
        System.out.println("Your BMI is " + BMI);
    }
}
