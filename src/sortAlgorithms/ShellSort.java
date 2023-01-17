package sortAlgorithms;

import java.util.Random;

public class ShellSort {
    public static void main(String[] args) {

        /*
        Shell sort is a kind of insertion sort.
        We make a loop with a gap and sort the values using the gap.
        The gap reduces until it becomes 1.
         */

        int[] intArray = new int[10];

        Random random = new Random();
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(50);
        }


        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j -= gap;
                }

                intArray[j] = newElement;
            }
        }

        for (int p: intArray)
            System.out.println(p);

    }
}
