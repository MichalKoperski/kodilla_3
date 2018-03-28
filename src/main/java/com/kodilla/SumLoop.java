package com.kodilla;

import java.util.*;

class SumLoop {

    public static void main(String[] args) {
        int sumA = 1000;
        int sumB = 0;
        int counter=0;
        Random randomGenerator = new Random();
        while (sumA > sumB) {
            counter++;
            sumA+=randomGenerator.nextInt(10);
            sumB+=randomGenerator.nextInt(50);
            System.out.println("Attempt no: "+counter+", sumA = "+sumA+", sumB = "+sumB);
        }

        System.out.println("End");
    }
}