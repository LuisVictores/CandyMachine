/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whatisthearea;

/**
 *
 * @Luis Victores 21384
 */
import java.util.Scanner;

public class WhatIsTheArea {

    private static Scanner kb = new Scanner(System.in);

    public static void main(String[] args) {
        int surfaceArea = 0;
        surfaceArea += triangle();
        surfaceArea += triangle();
        surfaceArea += square();
        surfaceArea += circle();
        surfaceArea += circle();
        surfaceArea += circle();
        surfaceArea += parallelogram();
        System.out.println("\nThe total area of Michael’s truck is : " + surfaceArea);
    }

    public static int triangle() {
        System.out.println("\nThe area of a triangle is: 1/2 * base * height");
        System.out.print("base > ");
        int base = kb.nextInt();
        System.out.print("height > ");
        int height = kb.nextInt();
        int area = (int) (0.5 * base * height);
        System.out.println("The area of this shape is: " + area);
        return area;
    }

    public static int square() {
        System.out.println("\nThe area of a square is side * side or side^2");
        System.out.print("side length of the inner square > ");
        int innerSide = kb.nextInt();
        int innerArea = (int) Math.pow(innerSide, 2);
        System.out.print("side length of outer square > ");
        int outerSide = kb.nextInt();
        int outerArea = (int) Math.pow(outerSide, 2);;
        int totalArea = outerArea - innerArea;
        System.out.println("The area of this shape is: " + totalArea);
        return totalArea;
    }

    public static double circle() {
        System.out.println("\nThe area of a circle is radius squared times pi");
        System.out.print("radius length > ");
        int radius = kb.nextInt();
        double circleArea = Math.pow(radius, 2) * Math.PI;
        System.out.println("The area of this shape is: " + circleArea);
        return circleArea;
    }

    public static int parallelogram() {
        System.out.println("\nThe area of a parallelogram is base times height");
        System.out.print("base length > ");
        int base = kb.nextInt();
        System.out.print("height length > ");
        int height = kb.nextInt();
        int parallelogramArea = height * base;
        System.out.println("The area of this shape is: " + parallelogramArea);
        return parallelogramArea;
    }
}
