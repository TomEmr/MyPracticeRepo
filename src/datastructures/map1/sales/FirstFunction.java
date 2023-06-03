package datastructures.map1.sales;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstFunction {

    Path east = Paths.get("assets/east.csv");
    Path west = Paths.get("assets/west.csv");
    Path central = Paths.get("assets/central.csv");

    public static int mostProfitableYear(String regionName) throws FileNotFoundException {

        List<String> lines;
        Map<Integer, Integer> tempMap = new HashMap<>();
        try {
            lines = Files.readAllLines(Path.of(regionName));
        } catch (IOException e) {
            throw new FileNotFoundException("Cannot find sales data for" + regionName + ", please try again.");
        }
        for (int i = 1; i < lines.size(); i++) {
            String[] line = lines.get(i).split(",");
            int year = Integer.parseInt(line[1]);
            int value = Integer.parseInt(line[4]);
            if (tempMap.containsKey(year)) {
                tempMap.put(year, tempMap.get(year) + value);
            } else tempMap.put(year, value);
        }

        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : tempMap.entrySet()) {
            if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                maxEntry = entry;
            }
        }
        return maxEntry.getKey();
    }

    public static List<String> topProducts(String regionName, int n) throws FileNotFoundException {
        List<String> lines;
        Map<String, Integer> tempMap = new HashMap<>();
        try {
            lines = Files.readAllLines(Path.of(regionName));
        } catch (IOException e) {
            throw new FileNotFoundException("Cannot find sales data for" + regionName + ", please try again.");
        }
        for (int i = 1; i < lines.size(); i++) {
            String[] line = lines.get(i).split(",");
            String product = line[2];
            int value = Integer.parseInt(line[4]);
            if (tempMap.containsKey(product)) {
                tempMap.put(product, tempMap.get(product) + value);
            } else tempMap.put(product, value);
        }
        if (n > tempMap.size()) {
            n = tempMap.size();
        }

        List<String> products = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            Map.Entry<String, Integer> maxEntry = null;
            for (Map.Entry<String, Integer> entry : tempMap.entrySet()) {
                if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
                    maxEntry = entry;
                }
            }
            products.add(maxEntry.getKey());
            tempMap.remove(maxEntry.getKey());
        }
        return products;
    }

    public static Map<String, Integer> monthlyRevenue(String regionName, int year) throws FileNotFoundException {
        List<String> lines;
        Map<String, Integer> results = new HashMap<>();
        try {
            lines = Files.readAllLines(Path.of(regionName));
        } catch (IOException e) {
            throw new FileNotFoundException("Cannot find sales data for" + regionName + ", please try again.");
        }

        for (int i = 1; i < lines.size(); i++) {
            String[] line = lines.get(i).split(",");
            String month = line[0];
            int value = Integer.parseInt(line[4]);
            if (Integer.parseInt(line[1]) == year) {
                results.put(month, value);
            }
        }
        return results;
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println(mostProfitableYear("assets/west.csv"));
        System.out.println(topProducts("assets/east.csv", 3));
        System.out.println(mostProfitableYear("assets/south.csv"));
        System.out.println(monthlyRevenue("assets/east.csv", 2021));
    }
}
