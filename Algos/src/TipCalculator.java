import java.util.HashMap;
import java.util.Map;

public class TipCalculator {

//    zadání
//    Complete the function, which calculates how much you need to tip based on the total amount of the bill and the service.
//    You need to consider the following ratings:
//    Terrible: tip 0%
//    Poor: tip 5%
//    Good: tip 10%
//    Great: tip 15%
//    Excellent: tip 20%
//    The rating is case insensitive (so "great" = "GREAT"). If an unrecognised rating is received, then you need to return:
//    Because you're a nice person, you always round up the tip, regardless of the service.
    public static void main(String[] args) {
        System.out.println(dummySolution(100, "Excellent"));
        System.out.println(coolSolutionWithMap(100, "Excellent"));
        System.out.println(masterSwitchSolution(100, "Excellent"));
    }
// dummy solution jedu if pro každý případ a vracím výsledek s castěním (int) .ceil zaokrouhluje nahoru
//    pro nic case vracím null
    public static Integer dummySolution(double amount, String rating) {

        if(rating.equalsIgnoreCase("Terrible")){
            return 0;
        }
        if(rating.equalsIgnoreCase("Poor")){
            return (int) Math.ceil(amount * 0.05);
        }
        if (rating.equalsIgnoreCase("Good")){
            return (int) Math.ceil(amount * 0.1);
        }
        if (rating.equalsIgnoreCase("Great")){
            return (int) Math.ceil(amount * 0.15);
        }
        if (rating.equalsIgnoreCase("Excellent")){
            return (int) Math.ceil(amount * 0.2);
        }
        return null;
    }
//    bacha na import import java.util.HashMap; a import java.util.Map; nevím jestli v leet code prosředí to bude fungovat
// uložím jednotlivé kombinace do mapy a pak jenom zkontroluji jestli je v mapě klíč a pokud ano tak vracím výsledek
//    výsledek je zaokrouhlené vynásobení amount a hodnoty z mapy
    public static Integer coolSolutionWithMap(double amount, String rating){
        Map<String, Integer> map = new HashMap<>();
        map.put("terrible", 0);
        map.put("poor", 5);
        map.put("good", 10);
        map.put("great", 15);
        map.put("excellent", 20);
        if (!map.containsKey(rating.toLowerCase())){
            return null;
        }
        return (int) Math.ceil(amount * map.get(rating.toLowerCase()) / 100);
    }

    public static Integer masterSwitchSolution(double amount, String rating){
        switch (rating.toLowerCase()){
            case "terrible":
                return 0;
            case "poor":
                return (int) Math.ceil(amount * 0.05);
            case "good":
                return (int) Math.ceil(amount * 0.1);
            case "great":
                return (int) Math.ceil(amount * 0.15);
            case "excellent":
                return (int) Math.ceil(amount * 0.2);
            default:
                return null;
        }
//brutál switch
//        return switch (rating.toLowerCase()) {
//            case "terrible" -> 0;
//            case "poor" -> (int) Math.ceil(amount * 0.05);
//            case "good" -> (int) Math.ceil(amount * 0.1);
//            case "great" -> (int) Math.ceil(amount * 0.15);
//            case "excellent" -> (int) Math.ceil(amount * 0.2);
//            default -> null;
//        };


    }
}
