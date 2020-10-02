package com.alyssa;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] numberList = {13, 5, 24, 105, 10};
	    printSpecificNumber(numberList);
        sumOfSubArray(numberList);
	    sortArray(numberList);
    }

    private static void printSpecificNumber(int[] numberList) {
        int number = numberList[2];
        System.out.println(number);
    }

    private static void sumOfSubArray(int[] numberList) {
        int[] subArray = Arrays.copyOfRange(numberList, 1, 4);
        int total = 0;
        for(int counter = 0; counter < subArray.length; counter++) {
            total += subArray[counter];
        }
        System.out.println("The sum of the sub array is " + total + ".");
    }

    private static void sortArray(int[] numberList) {
        for(int counter = 1; counter < numberList.length; counter++) {
            int order = numberList[counter];
            int space = counter - 1;
            while ((space >= 0) && (numberList[space] > order))
                numberList[space + 1] = numberList[space--];
            numberList[space + 1] = order;
        }
        for(int number = 0; number < numberList.length; number++) {
            System.out.println(numberList[number]);
        }
    }
}
