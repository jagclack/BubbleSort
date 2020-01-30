package com.sparta.jc.javabasic;

public class ArrayPrinter {
    public void printArray(int arr[]) {
        int arrayLength = arr.length;
        for (int i = 0; i < arrayLength; i++)
            System.out.print(arr[i] + " ");
        System.out.println("\n");
    }
}