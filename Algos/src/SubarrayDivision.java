import java.util.List;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {

        int count = 0;  // Track the number of valid sequences.

        // If the list has fewer elements than m, then it's impossible to find a valid sequence.
        if (s.size() < m) {
            return 0;
        }
        // Calculate the initial sum for the first 'm' numbers in the list.
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }

        // If the sum of the first 'm' elements is equal to 'd', count it.
        if (sum == d) {
            count++;
        }

        // Slide the window of size 'm' across the list and update the sum accordingly.
        for (int i = m; i < s.size(); i++) {
            sum = sum - s.get(i - m) + s.get(i);  // Update the sum by subtracting the leftmost element and adding the current one.
            if (sum == d) {
                count++;
            }
        }

        return count;  // Return the final count.
    }
}


