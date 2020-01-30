# BubbleSort
* Overview
The purpose of this program is to sort a given array of integers into ascending order using a bubble sort algorithm. The algorithm reads through the array and compares each pair of adjacent elements. If the elements are in the wrong order (i.e. the first element is larger than the second element) their positions are swapped. The program continues to read through the array of integers until the list is arranged in ascending order. The program operates using three classes: "BubbleSorter.java" implements the bubble sort algorithm; "ArrayPrinter.java" handles the output of the array before and after sorting; and "Main.java" contains the given array and handles the execution of the program by calling the methods from "BubbleSorter.java" and "ArrayPrinter.java".

* BubbleSorter.java
 The method within this class sorts the elements in the array iteratively using a nested IF statement for swapping elements within a FOR loop that runs through each element of the array. The IF statement checks if the left element in a given iteration is greater than the element to its right; if this true the two elements are swapped.
 
 * ArrayPrinter.java
 This class contains a simple method that prints the elements of the array and divides them up using a concatenation with a String of an empty space " ". 
 
 * Main.java
 This class hardcodes the contents of the array and calls the array printing method from "ArrayPrinter.java" before and after calling the sorting method from "BubbleSorter.java", so that the console can clearly display the changes made to the array.
 
