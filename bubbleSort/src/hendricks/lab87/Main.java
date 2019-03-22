package hendricks.lab87;

import org.jetbrains.annotations.Contract;

import java.util.Arrays;

@SuppressWarnings("SameParameterValue")
public class Main {

    public static void main(String[] args) {
        int[] toBeSorted = new int[]{
                65,
                45,
                34,
                12,
                99,
                54,
                39,
                2,
                88,
                18
        };
        double[] doubleSort = new double[]{
                43.2,
                13.6,
                91.4,
                23.6,
                72.1
        };
        char[] charSort = new char[]{
                'a',
                'g',
                'k',
                'j',
                't',
                'i',
                'f',
                's',
                'w',
                'b'
        };
        System.out.println("Array before sorting: " + Arrays.toString(toBeSorted));
        int[] sorted = bubbleSort(toBeSorted, 10);
        System.out.println("Array after sorting: " + Arrays.toString(sorted));

        System.out.println("Array before sorting: " + Arrays.toString(doubleSort));
        double[] sortedDoubles = exchangeSort(doubleSort, 5);
        System.out.println("array after sorting: " + Arrays.toString(sortedDoubles));

        System.out.println("Array before sorting: " + Arrays.toString(charSort));
        char[] sortedChars = bubbleChar(charSort, 10);
        System.out.println("Array after sorting: " + Arrays.toString(sortedChars));
    }

    @Contract("_, _ -> param1")
    private static int[] bubbleSort(int[] array, int length) {
        int temp;
        boolean swaps;
        for (int i = 0; i < length - 1; i++) {
            swaps = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    //swap
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps = true;
                }
            }
            if (!swaps) {
                break;
            }
        }
        return array;
    }

    @Contract("_, _ -> param1")
    private static double[] exchangeSort(double[] array, int length) {
        double temp;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (array[i] > array[j]) {
                    //swap
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    @Contract("_, _ -> param1")
    private static char[] bubbleChar(char[] array, int length) {
        char temp;
        boolean swaps;
        for (int i = 0; i < length; i++) {
            swaps= false;
            for (int j = 0; j < length - 1; j++) {
                if (Character.compare(array[j], array[j + 1]) == 1) {
                    //swap

                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swaps = true;
                }
            }
            if (!swaps) {
                break;
            }
        }
        return array;
    }

}