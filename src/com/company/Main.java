package com.company;

import java.util.Scanner;

//Take two integer inputs from the user, compute its area.
public class Main {
//Methods - Prompt User & Compute Area
    public static void main(String[] args) {
	// write your code here

     promptUser();

    }
    public static void promptUser(){
        Scanner in = new Scanner (System.in);
        System.out.println("Enter a length");
        int length = in.nextInt();

        System.out.println("Enter a width");
        int width = in.nextInt();

        int area = computeArea(length, width);
        System.out.println(area);
    }

    public static int computeArea(int length, int width){
        int area = (length * width);

        return area;

    }

}
