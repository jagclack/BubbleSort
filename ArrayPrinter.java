package com.sparta.jc.javabasic;

public class ArrayPrinter {
    public static void printArray(int arr[]) {
        int arrayLength = arr.length;

        //printing the array as it is displayed in Main.java
        System.out.println("Original Array:");
        for (int i = 0; i < arrayLength; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\n");

        //calling method from BubbleSorter.java and sorting the array
        BubbleSorter.bubbleSort(arr);

        //printing the array after it has been sorted
        System.out.println("Sorted Array:");
        for (int i = 0; i < arrayLength; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
    }
}