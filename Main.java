package com.sparta.jc.javabasic;

public class Main {

    public static void main(String[] args) {
        int arr[] = {6, 17, 2, 30, 22, 10, 54, 1};

        BubbleSorter bubbleSorter = new BubbleSorter();
        ArrayPrinter arrayPrinter = new ArrayPrinter();

        System.out.println("Original Array: ");
        arrayPrinter.printArray(arr); //retrieving method from ArrayPrinter and printing original array

        bubbleSorter.bubbleSort(arr); // retrieving method from BubbleSorter and sorting the array

        System.out.println("Sorted Array: ");
        arrayPrinter.printArray(arr); //retrieving method from ArrayPrinter and printing sorted array
    }
}
