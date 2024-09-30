package com.parbej1;

public class area {
    int length;
    int width;

    int area(int length, int width) {
        return length * width;
    }


    public static void main(String[] args) {
        area suman = new area();
        int rectanglearea = suman.area(8, 8);
        System.out.println("The area of rectangle is " + suman.area(8, 8));

    }
}
