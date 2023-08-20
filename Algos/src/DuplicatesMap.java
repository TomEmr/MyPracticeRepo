import java.util.*;

public class DuplicatesMap {

    public static void main(String[] args) {

        Map<Integer, List<String>> obj = new HashMap<>();
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("D");
        list2.add("A");
        obj.put(1, list1);
        obj.put(2, list2);

        System.out.println(removeDuplicateIds(obj));
        System.out.println("-----------------");
        System.out.println(betterSolution(obj));
    }

    public static Map<Integer, List<String>> removeDuplicateIds(Map<Integer, List<String>> obj) {
//        výsledek
        Map<Integer, List<String>> result = new HashMap<>();
//        mapa pro přiřazení klíče k hodnotě
        Map<String, Integer> charToKeyMap = new HashMap<>();
//        procházím vstupní mapu
        for (Map.Entry<Integer, List<String>> entry : obj.entrySet()) {
//            klíč
            int key = entry.getKey();
//            hodnoty z arraylistu
            List<String> values = entry.getValue();
//            unikátní hodnoty do výsledku (mohl by to být Set?)
            List<String> uniqueValues = new ArrayList<>();
//            procházím hodnoty
            for (int i = 0; i < entry.getValue().size(); i++) {
//                hodnota
                String value = values.get(i);
//                pokud ještě není v mapě, přidám
                if (!charToKeyMap.containsKey(value)) {
                    charToKeyMap.put(value, key);
                    uniqueValues.add(value);
//                pokud už je v mapě, porovnám klíče, pokud je větší, nahradím a odstraním původní hodnotu z výsledku
                } else if (charToKeyMap.get(value) < key) {
                    int previousKey = charToKeyMap.get(value);
                    charToKeyMap.put(value, key);
                    result.get(previousKey).remove(value);
                    uniqueValues.add(value);
                }
            }
            result.put(key, uniqueValues);
        }
        return result;
    }
    public static Map<Integer, List<String>> betterSolution(Map<Integer, List<String>> obj) {
        Map<Integer, List<String>> map = new HashMap<>();
        Set<String> seen = new HashSet<>();
        List<Integer> sortedKeys = new ArrayList<>(obj.keySet());
        sortedKeys.sort(Collections.reverseOrder());

        for (int key : sortedKeys) {
            List<String> chars = obj.get(key);
            List<String> newChars = new ArrayList<>();
            for (String ch : chars) {
                if (!seen.contains(ch)) {
                    seen.add(ch);
                    newChars.add(ch);
                }
            }
            map.put(key, newChars);
        }
        return map;
    }
}

//    You are given a table, in which every key is a stringified number, and each corresponding value is an array of characters, e.g.
//
//        {
//        "1": ["A", "B", "C"],
//        "2": ["A", "B", "D", "A"],
//        }
//        Create a function that returns a table with the same keys, but each character should appear only once among the value-arrays, e.g.
//
//        {
//        "1": ["C"],
//        "2": ["A", "B", "D"],
//        }
//        Rules
//        Whenever two keys share the same character, they should be compared numerically, and the larger key will keep that character. That's why in the example above the array under the key "2" contains "A" and "B", as 2 > 1.
//        If duplicate characters are found in the same array, the first occurance should be kept.
