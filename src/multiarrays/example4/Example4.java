package multiarrays.example4;

public class Example4 {

    public static String[][] shorterStringsMatrix(String[][] input1, String[][] input2) {
        if (input1.length != input2.length) {
            throw new RuntimeException("Invalid input");
        }
        String[][] result = new String[input1.length][input1[0].length];
        for (int i = 0; i < input1.length; i++) {
            for (int j = 0; j < input1[0].length; j++) {

                String s1 = input1[i][j];
                String s2 = input2[i][j];

                result[i][j] = s1.length() <= s2.length() ? s1 : s2;
            }
        }
        return result;
    }
}
