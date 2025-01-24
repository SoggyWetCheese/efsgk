public class InsertionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Insertion Sort!!!");

        // Loop through the array starting from the second element
        for (int i = 1; i < input.length; i++) {
            int key = input[i];  // The current element to be inserted
            int j = i - 1;       // The last index of the sorted portion

            // Shift elements of input[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }

            // Insert the key element at its correct position
            input[j + 1] = key;
        }
    }
}
