package arrays_bigO;

public class arrayy {
    public static void main(String[] args) {

        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] =  1;
        intArray[6] =  -22;

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("index " + (i+1)+ ": " + intArray[i]);
        }

        int index = -1;
        for (int i = 0; i< intArray.length; i++) {
            if (intArray[i] == 7) {
                index = i;
                break;
            }
        }

        System.out.printf("The index for 7 is: %d", index);
    }
}