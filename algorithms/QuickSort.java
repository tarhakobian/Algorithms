package algorithms;

import java.util.Arrays;

public class QuickSort<T extends Comparable<T>> {
    public static void main(String[] args) {
        QuickSort<Integer> sorter = new QuickSort<>();
        Integer[] array = {1, -1, 0, 11, 3, 2, 1};
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public void sort(T[] array) {
        if (array == null || array.length <= 1)
            return; //No need to sort

        sort(array, 0, array.length - 1);
    }

    private void sort(T[] array, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(array, low, high);
            sort(array, low, pivotIndex - 1);
            sort(array, pivotIndex + 1, high);
        }
    }

    private int partition(T[] array, int low, int high) {
        T pivot = array[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (array[j].compareTo(pivot) <= 0) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, high);
        return i + 1;
    }

    private void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
