package datastructures.map1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Example2 {

    public static void findLongestWord(String inputFile, String outputFile) {
        Path inputPath = Paths.get(inputFile);
        Path outpuPath = Paths.get(outputFile);
        String sentence;
        try {
            sentence = Files.readString(inputPath);
        } catch (IOException e) {
            throw new RuntimeException("Error: Can't manipulate file - original error message: <Cannot read file>");
        }
        String alphaAndDigits = sentence.replaceAll("[^a-zA-Z0-9\\s]","");
        String[] words = alphaAndDigits.split(" ");
        int longestWords = 0;
        for (String word : words) {
            if (word.length() > longestWords) {
                longestWords = word.length();
            }
        }
        String output = String.valueOf(longestWords);
        try {
            Files.write(outpuPath, output.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) {
        findLongestWord("assets/input.txt", "assets/output.txt");

    }
}
