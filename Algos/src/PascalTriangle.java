import java.util.*;

public class PascalTriangle {
    public static long[] generate(int level) {
        // Create a List to store the generated numbers
        List<Long> res = new ArrayList<>();

        // Initialize a variable 'k' to 1
        long k = 1;

        // Iterate 'level' times to generate the rows of Pascal's Triangle
        for(int i = 0; i < level; i++) {

            // Iterate from 0 to 'i' to generate each element in the current row
            for (int j = 0; j <= i; j++) {

                // Calculate the binomial coefficient value using the formula (i choose j)
                if (j != 0) {
                    k = k * (i - j + 1) / j;
                }

                // Add the calculated value to the result List
                res.add(k);
            }
        }

        // Convert the List of Long to a primitive long array and return it
        return res.stream().mapToLong(i -> i).toArray();
    }

}
