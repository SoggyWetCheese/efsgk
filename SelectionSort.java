public class SelectionSort implements Sorter {

    public void sort(int[] input) {
        System.out.println("Selection Sort!!!");

        int inputLength = input.length;

        for (int i = 0; i < inputLength - 1; i++) {  // Fix: We only need to go until n-1
            int smallestIndex = i;
            // Fix: Inner loop should start from i + 1, not 1 + i
            for (int j = i + 1; j < inputLength; j++) {  // Corrected this line
                if (input[j] < input[smallestIndex]) {
                    smallestIndex = j;
                }
            }

            // Check if a swap is needed
            if (smallestIndex != i) {  // Fix: Comparing smallestIndex, not input[smallestIndex] with i
                int temp = input[smallestIndex];
                input[smallestIndex] = input[i];
                input[i] = temp;
            }
        }
    }
}
