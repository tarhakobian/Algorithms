package algorithms;

import java.util.Arrays;

public class SelectionSort<T extends Comparable<T>> {
    public static void main(String[] args) {
        Integer[] array = {1, -1, 0, 21, 11};
        SelectionSort<Integer> sorter = new SelectionSort<>();
        sorter.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public void sort(T[] array) {

        if (array == null || array.length <= 1)
            return; //No need to sort

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            T temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

}

