package datastructures.map1;

import java.util.HashMap;
import java.util.Map;

public class Example1 {

    public static Map<String, Integer> wordOccurrncies(String sentence, int frequency) {

        Map<String, Integer> results = new HashMap<>();

        Map<String, Integer> askedFrequency = new HashMap<>();

        String[] words = sentence.split(" ");

        for (String word : words
        ) {
            if (results.containsKey(word)) {
                results.put(word, results.get(word) + 1);
            } else results.put(word, 1);
        }
        for (Map.Entry<String, Integer> entry : results.entrySet()) {
            if (entry.getValue() == frequency) {
                askedFrequency.put(entry.getKey(), entry.getValue());
            }
        }

        return askedFrequency;
    }

    public static void main(String[] args) {
        String test = "This is really very very nice sentence, it is really good for practice!";
        System.out.println(wordOccurrncies(test, 2));
    }
}
