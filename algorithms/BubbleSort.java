package algorithms;

public class BubbleSort<T extends Comparable<T>> {
    public static void main(String[] args) {
        Integer[] array = {1, -1, 11, 21, 31, 0, 0};
        BubbleSort<Integer> sorter = new BubbleSort<>();
        sorter.bubbleSort(array);
        sorter.printArray(array);
    }

    public void bubbleSort(T[] array) {
        if (array == null || array.length <= 1) {
            return; // No need to sort
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

}
