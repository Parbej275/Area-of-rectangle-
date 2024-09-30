package com.parbej1;
import java.util.Scanner;

public class area {
    int length;
    int width;

    int area(int length, int width) {
        return length * width;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.println("Enter the width of the rectangle: ");
        int width = scanner.nextInt();
        
        area suman = new area();
        int rectanglearea = suman.area(length, width);
        System.out.println("The area of rectangle is " + rectangleArea);

        scanner.close();

    }
}
