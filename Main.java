import java.util.Random;

public class Main {
    public static void main(String[] args)
    {

        Random rand = new Random();
        int rand_int1 = rand.nextInt(1000);
        int rand_int2 = rand.nextInt(1000);
        int rand_int3 = rand.nextInt(1000);

        // Task:
        // 1. Implement missing sorting algorithms.
        //    - InsertionSort.java
        //    - SelectionSort.java
        //
        //  2. Add a method to class Main to generate a random array.
        //  3. Provide random input to test suite and ensure your implementations
        //     of InsertionSort and Selection sort continue to work.
        //  4. Increase the loop count for TestSuite to get better performance results.
        
        int[] randomArray = {rand_int1, rand_int2, rand_int3};

        int[] testInput = { 1, 2, 3, 1 };

        // Increase the loop count to get better results once it works.
        // TestSuite.run(testInput, 10000);
        TestSuite.run(randomArray, 1);
    }
}
