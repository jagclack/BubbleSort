package com.sparta.jc.javabasic;

public class BubbleSorter {
    public static void bubbleSort(int arr[]) {
        int arrayLength = arr.length;

        for (int i = 0; i < arrayLength - 1; i++)
            for (int j = 0; j < arrayLength - i - 1; j++) //run through this loop for each iteration of i
                if (arr[j] > arr[j + 1]) {

                    //swapping two ints in the array if integer j is greater than j+1
                    int spare = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = spare;
                }
    }
}