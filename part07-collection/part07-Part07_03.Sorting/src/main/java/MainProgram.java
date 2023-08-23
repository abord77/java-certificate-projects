import java.util.*;

public class MainProgram {

    public static void main(String[] args) {

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        sort(numbers);                
    }

    public static int smallest(int[] array) {
        int smallest = 100000;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = 100000;
        int smallIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = 100000;
        int smallIndex = 0;
        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndex = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndex);
        }
    }
}
