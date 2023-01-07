package SortAlgorithms;

public class bubbleSort {
    public static void main(String[] args) {

        int[] intArray = {20, 35, -15, 7, 55, 1, -22, 543};

        //Loop to set the last unsorted number
        for (int lastOne = intArray.length - 1; lastOne > 0; lastOne--) {
            //Loop to check numbers
            for (int i = 0; i < lastOne; i++) {
                if (intArray[i] > intArray[i + 1]) {
                    swap(intArray, i, i + 1);
                }
            }
        }

        //Printer
        for (int i = 0; i < intArray.length ; i++) {
            System.out.println(intArray[i]);
        }
    }

    //Swap method
    public static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        }

        int temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }
}
