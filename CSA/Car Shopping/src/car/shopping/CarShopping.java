package car.shopping;

import static car.shopping.CarShopping.kb;
import java.util.Scanner;

public class CarShopping {

    public static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int totalCost = 0;
        totalCost += base();
        totalCost += automaticWindows();
        totalCost += onStarSystem();
        totalCost += ABS();
        totalCost += TSWAP();
        totalCost += sunroof();
        totalCost += CWP();
        totalCost += GPSN();
        totalCost += hydrogenBomb();
        totalCost += APH();
        totalCost += kneecap();
        System.out.println("The total cost of your car is $" + totalCost);
    }

    public static int base() {
        System.out.println("Our inventory:");
        System.out.println("Model 1 - $15,000");
        System.out.println("Model 2 - $24,000");
        System.out.println("Model 3 - $40,000");
        System.out.println("Which base model did the customer choose?"
                + "(enter full model name ex. Model 1): ");
        String model = kb.nextLine();
        if (model.equalsIgnoreCase("Model 1")) {
            return 15000;
        } else if (model.equalsIgnoreCase("Model 2")) {
            return 24000;
        } else if (model.equalsIgnoreCase("Model 3")) {
            return 40000;
        } else {
            System.out.println("Please restart and try again");
            return 0;
        }
    }

    public static int automaticWindows() {
        System.out.print("Automatic Windows for $500? (y/n) > ");
        String answer = kb.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Yes")) {
            return 500;
        } else {
            return 0;
        }
    }

    public static int onStarSystem() {
        System.out.println("OnStar System for $1000 (y/n) > ");
        String answer = kb.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Yes")) {
            return 1000;
        } else {
            return 0;
        }
    }

    public static int ABS() {
        System.out.println("Anti-Lock Brakes for $500 (y/n) > ");
        String answer = kb.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Yes")) {
            return 500;
        } else {
            return 0;
        }
    }

    public static int TSWAP() {
        System.out.println("Telescoping Steering Wheel and Adjustable Pedals for $1000 (y/n) > ");
        String answer = kb.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Yes")) {
            return 1000;
        } else {
            return 0;
        }
    }

    public static int sunroof() {
        System.out.println("Sunroof for $800 (y/n) > ");
        String answer = kb.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Yes")) {
            return 800;
        } else {
            return 0;
        }
    }

    public static int CWP() {
        System.out.println("Cold Weather Package for $1500 (y/n) > ");
        String answer = kb.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Yes")) {
            return 1500;
        } else {
            return 0;
        }
    }

    public static int GPSN() {
        System.out.println("GPS Navigation for $750 (y/n) > ");
        String answer = kb.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Yes")) {
            return 750;
        } else {
            return 0;
        }
    }

    public static int hydrogenBomb() {
        System.out.println("Pre-installed hydrogen bomb for $10 (y/n) > ");
        String answer = kb.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Yes")) {
            return 10;
        } else {
            return 0;
        }
    }

    public static int APH() {
        System.out.println("Automatic Pothole Hitter for $20 (y/n) > ");
        String answer = kb.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Yes")) {
            return 20;
        } else {
            return 0;
        }
    }

    public static int kneecap() {
        System.out.println("Kneecaps for $1,000,000 (y/n) > ");
        String answer = kb.nextLine();
        if (answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("Yes")) {
            return 1000000;
        } else {
            return 0;
        }
    }
}
