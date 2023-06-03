package datastructures.map2;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentWord {

    public static String mostFrequentWord(String sentence) {

        String result = sentence.replaceAll("[^a-zA-Z0-9\\s]", "");
        String[] words = result.split(" ");

        Map<String, Integer> results = new HashMap<>();
        for (String word : words) {
            if (results.containsKey(word)) {
                results.put(word, results.get(word) + 1);
            } else results.put(word, 1);
        }

            Map.Entry<String, Integer> maxOccurenccies = null;
            for (Map.Entry<String, Integer> entry : results.entrySet()) {
                if (maxOccurenccies == null || entry.getValue().compareTo(maxOccurenccies.getValue()) > 0) {
                    maxOccurenccies = entry;
                }
            }
            result = maxOccurenccies.getKey();
        return result;
    }

    public static void main(String[] args) {
        String sentence = "But then they were married (she felt awful about being pregnant before but\n" +
                "Harry had been talking about marriage for a while and anyway laughed when\n" +
                "she told him in early February about missing her period and said Great she\n" +
                "was terribly frightened and he said Great and lifted her put his arms around\n" +
                "under her bottom and lifted her like you would a child he could be so\n" +
                "wonderful when you didn’t expect it in a way it seemed important that you\n" +
                "didn’t expect it there was so much nice in him she couldn’t explain to\n" +
                "anybody she had been so frightened about being pregnant and he made her\n" +
                "be proud) they were married after her missing her second period in March\n" +
                "and she was still little clumsy dark-complected Janice Springer and her\n" +
                "husband was a conceited lunk who wasn’t good for anything in the world Daddy\n" +
                "said and the feeling of being alone would melt a little with a little drink.";
        System.out.println(mostFrequentWord(sentence));

    }
}