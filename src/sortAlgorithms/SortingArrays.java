package sortAlgorithms;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        Arrays.parallelSort(intArray);

        for (int print: intArray)
            System.out.println(print);
    }
}
