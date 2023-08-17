import java.util.HashMap;

public class MakingAnagrams {

        public static void main(String[] args) {
            System.out.println(makeAnagram("cde", "abc"));
        }

        public static int makeAnagram(String a, String b) {
//            Create an integer array of size 26 (representing 26
//            letters of the alphabet) initialized with zeros.
            int[] charCount = new int[26];
            // Increment the frequency for characters in the string 'a'
            for (char c : a.toCharArray()) {
                charCount[c - 'a']++;
            }
            // Decrement the frequency for characters in the string 'b'
            for (char c : b.toCharArray()) {
                charCount[c - 'a']--;
            }
            // Calculate the sum of absolute values
            int result = 0;
            for (int i : charCount) {
                result += Math.abs(i);
            }
            return result;
        }

    public static int makeAnagramHashMap(String a, String b) {
        HashMap<Character, Integer> charFrequencies = new HashMap<>();

        // Populate the hashmap with frequencies from the first string
        for (char c : a.toCharArray()) {
            charFrequencies.put(c, charFrequencies.getOrDefault(c, 0) + 1);
        }

        int numDeletions = 0;

        // Process the second string
        for (char c : b.toCharArray()) {
            if (charFrequencies.containsKey(c) && charFrequencies.get(c) > 0) {
                charFrequencies.put(c, charFrequencies.get(c) - 1);
            } else {
                numDeletions++;
            }
        }

        // Add up any characters left over in the hashmap
        for (int frequency : charFrequencies.values()) {
            numDeletions += frequency;
        }

        return numDeletions;
    }
}

//    A student is taking a cryptography class and has found anagrams to be very useful. Two strings are anagrams of each other if the first string's letters can be rearranged to form the second string. In other words, both strings must contain the same exact letters in the same exact frequency. For example, bacdc and dcbac are anagrams, but bacdc and dcbad are not.
//
//        The student decides on an encryption scheme that involves two large strings. The encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. Determine this number.
//
//        Given two strings,  and , that may or may not be of the same length, determine the minimum number of character deletions required to make  and  anagrams. Any characters can be deleted from either of the strings.
//
//        Example
//
//
//        Delete  from  and  from  so that the remaining strings are  and  which are anagrams. This takes  character deletions.
//
//        Function Description
//
//        Complete the makeAnagram function in the editor below.
//
//        makeAnagram has the following parameter(s):
//
//        string a: a string
//        string b: another string
//        Returns
//
//        int: the minimum total characters that must be deleted
//        Input Format
//
//        The first line contains a single string, .
//        The second line contains a single string, .
