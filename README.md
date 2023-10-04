# Sorting Algorithms Implementation

This project provides Java implementations of several widely used sorting algorithms. Sorting algorithms are essential in computer science and are used to rearrange elements in a specific order. Below are the sorting algorithms implemented in this project, along with their time complexities.

## Implemented Sorting Algorithms

1. **Bubble Sort:**
    - Time Complexity: O(n^2)
    - Description: Bubble Sort is a simple comparison-based sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

2. **Selection Sort:**
    - Time Complexity: O(n^2)
    - Description: Selection Sort is an in-place, comparison-based sorting algorithm. It sorts an array by repeatedly finding the minimum element from the unsorted part and putting it at the beginning.

3. **Insertion Sort:**
    - Time Complexity: O(n^2)
    - Description: Insertion Sort builds the final sorted array one item at a time. It is much less efficient on large lists than other sorting algorithms such as quicksort, heapsort, or merge sort.

4. **Quick Sort:**
    - Time Complexity: O(n log n) on average, O(n^2) in the worst case
    - Description: Quick Sort is an efficient, divide-and-conquer sorting algorithm that works by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays.

5. **Heap Sort:**
    - Time Complexity: O(n log n)
    - Description: Heap Sort is a comparison-based sorting algorithm that uses a binary heap data structure. It sorts elements by building a max-heap or min-heap and repeatedly removing the root element.

6. **Merge Sort:**
    - Time Complexity: O(n log n)
    - Description: Merge Sort is an efficient, stable, and comparison-based sorting algorithm that works by dividing the unsorted list into n sub-lists, each containing one element, and then repeatedly merging sub-lists to produce new sorted sub-lists until there is only one sub-list remaining.