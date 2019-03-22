package hendricks.lab86;


public class Main {

    public static void main(String[] args) {
        int keyvalue = 22;
        int[] sortedArray = new int[] {
                11,
                16,
                22,
                23,
                34,
                46,
                48,
                58,
                75,
                78
        };
        int[] index = binarySearch(sortedArray, 0, 9, keyvalue);
        if (index[0] != -1) {
            System.out.println("The number was found at " + index[0]);
            System.out.println("It took " + index[1] + " comparisons");
        } else {
            System.out.println("Unfortunately the number was not found.");
        }
    }

    /**
     * Takes a sorted array and runs a binary search
     * @param array The array to be searched
     * @param min The lower bound of the array
     * @param max The upper bound of the array
     * @param key The target number to be found
     * @return An integer array, the first value of which is the index of the result and the second value is the number of comparisons it took.
     * The return will return -1 in the first array index if the key is not found in the array.
     */
    @SuppressWarnings("WeakerAccess")
    public static int[] binarySearch(int[] array, int min, int max, int key) {
        int[] returnValue = new int[2];
        int position;
        int comparisons = 0;

        position = (min + max) / 2;

        while(array[position] != key && min <= max) {
            if (array[position] > key) {
                max = position - 1;
            } else if (array[position] < key) {
                min = position + 1;
            } else if (array[position] == key) {
                break;       //Yes, technically under this condition the loop will break anyway, but I don't trust while loops.
            }
            position = (max + min) / 2;
            comparisons++;
        }
        if (min <= max) {
            returnValue[0] = position;
            returnValue[1] = comparisons;
            return returnValue;
        } else {
            returnValue[0] = position;
            return returnValue;
        }
    }
}
