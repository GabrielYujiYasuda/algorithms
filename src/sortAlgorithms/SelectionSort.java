package sortAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {

        int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };

        for (int lastIndex = intArray.length - 1; lastIndex > 0; lastIndex--) {
            int largest = 0;

            for (int i = 1; i <= lastIndex ; i++) {
                if (intArray[i] > intArray[largest]) {
                    largest = i;
                }
            }
            swap(intArray, largest, lastIndex);
        }

        //Printer
        for (int j : intArray) {
            System.out.println(j);
        }
    }

    public static void swap(int[] array, int i, int j) {
        if(i == j) {
            return;
        }

        int temporary = array[i];
        array[i] = array[j];
        array[j] = temporary;
    }
}
