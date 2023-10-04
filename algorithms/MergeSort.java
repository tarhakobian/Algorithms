package algorithms;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> {
    public static void main(String[] args) {
        Integer[] array = {12, 11, 13, 5, 6, 7};
        MergeSort<Integer> sorter = new MergeSort<>();
        sorter.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }

    public void mergeSort(T[] array) {
        if (array == null || array.length <= 1)
            return; // No need to sort

        int middle = array.length / 2;

        T[] left = Arrays.copyOfRange(array, 0, middle);
        T[] right = Arrays.copyOfRange(array, middle, array.length);

        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    private void merge(T[] arr, T[] left, T[] right) {
        int leftLength = left.length;
        int rightLength = right.length;
        int i = 0, j = 0, k = 0;

        while (i < leftLength && j < rightLength) {
            if (left[i].compareTo(right[j]) <= 0) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            arr[k] = left[i];
            i++;
            k++;
        }

        while (j < rightLength) {
            arr[k] = right[j];
            j++;
            k++;
        }
    }
}
