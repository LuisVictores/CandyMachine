/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candy.machine;

import java.util.Scanner;

/**
 * @author Luis Victores
 * @id 21384
 */
public class CandyMachine {

    public static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the CBT Computer Candy Machine!");
        System.out.println("All candy provided here is virtual.");
        System.out.println();
        pickCandy();
    }

    public static void pickCandy() {
        System.out.print("How much money do ya got? ");
        double money = kb.nextDouble();
        System.out.println("$" + money + ", that's all?");
        System.out.println("Well, lemme tell ya what we got here.");
        System.out.println();
        System.out.println("A   $0.50   Twix");
        System.out.println("B   $5.00   Face");
        System.out.println("C   $1.00   Raw Egg");
        System.out.println("D   $0.01   Eukaryotic Cells");
        System.out.println("E   $0.39   Jolly Rancher");
        System.out.println();
        System.out.print("So, What'll ya have? > ");
        String candy = kb.next();
        System.out.println();
        if (candy.equalsIgnoreCase("A") || candy.equalsIgnoreCase("Twix")) {
            if (money > .49) {
                money -= .50;
                System.out.println("Thank you for purchasing candy through us. \n"
                        + "Please take your candy, and your $" + money + " change!");
            } else {
                System.out.println("You're broke. Take your $" + money + " change elsewhere.");
            }
        } else if(candy.equalsIgnoreCase("B") || candy.equalsIgnoreCase("Face")) {
            if (money > 4.99) {
                money -= 5.00;
                System.out.println("Thank you for purchasing candy through us. \n"
                    + "Please take your candy, and your $" + money + " change!");    
            } else {
                System.out.println("You're broke. Take your $" + money + " change elsewhere.");
            }
        } else if(candy.equalsIgnoreCase("C") || candy.equalsIgnoreCase("Raw Egg")) {
            if (money > 0.99) {
                money -= 1.00;
                System.out.println("Thank you for purchasing candy through us. \n"
                    + "Please take your candy, and your $" + money + " change!");    
            } else {
                System.out.println("You're broke. Take your $" + money + " change elsewhere.");
            }
        } else if(candy.equalsIgnoreCase("D") || candy.equalsIgnoreCase("Eukaryotic Cell")) {
            if (money > 0.00) {
                money -= 0.01;
                System.out.println("Thank you for purchasing candy through us. \n"
                    + "Please take your candy, and your $" + money + " change!");    
            } else {
                System.out.println("You're broke. Take your $" + money + " change elsewhere.");
            }
        } else if(candy.equalsIgnoreCase("E") || candy.equalsIgnoreCase("Jolly Rancher")) {
            if (money > 0.38) {
                money = money - 0.39;
                System.out.println("Thank you for purchasing candy through us. \n"
                    + "Please take your candy, and your $" + money + " change!");    
            } else {
                System.out.println("You're broke. Take your $" + money + " change elsewhere.");
            }
        }
    }
} 