package com.example.java;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int[] myArray = {5, 6, 7, 12, -5, 32, 43, 6, 12};
        for (int i = 0; i < myArray.length; i++) {
            for (int n = i + 1; n < myArray.length; n++) {
                if (myArray[i] == myArray[n]) {
                    System.out.println(myArray[i]);
                }
            }
        }
    }
}

