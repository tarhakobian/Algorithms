package algorithms;

import java.util.Arrays;

public class InsertionSort<T extends Comparable<T>> {
    public static void main(String[] args) {
        Integer[] array = {-1, 1, 0, 1, 11, 21};
        InsertionSort<Integer> sorter = new InsertionSort<>();
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public void sort(T[] array) {
        if (array == null || array.length <= 1) {
            return; // No need to sort
        }

        for (int i = 1; i < array.length; i++) {
            T key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j].compareTo(key) > 0) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = key;
        }
    }
}

