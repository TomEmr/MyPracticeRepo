import java.util.List;

public class SlidingWindow {

    public static void main(String[] args) {
        System.out.println(birthday(List.of(1, 2, 1, 3, 2), 3, 2));
    }
    public static int birthday(List<Integer> s, int d, int m) {
        int count = 0;
        int windowSum = 0;

        // If the chocolate bar is shorter than m, return 0
        if (s.size() < m) return 0;

        // Initialize the sum for the first window
        for (int i = 0; i < m; i++) {
            windowSum += s.get(i);
        }

        if (windowSum == d) {
            count++;
        }

        // Slide the window through the list
        for (int i = m; i < s.size(); i++) {
            // Move the window: subtract the first element, add the next one
            windowSum += s.get(i) - s.get(i - m);
            if (windowSum == d) {
                count++;
            }
        }

        return count;
    }
}
