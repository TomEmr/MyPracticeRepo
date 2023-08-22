import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FoldAnArray {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(foldArray(new int[]{1, 2, 3, 4, 5}, 2)));
        System.out.println(Arrays.toString(foldArrayList(new int[]{1, 2, 3, 4, 5}, 2)));
    }

    public static int[] foldArrayList(int[] array, int runs) {

        for (int i = 0; i < runs; i++) {

            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < array.length / 2; j++) {

                list.add(array[j] + array[array.length - 1 - j]);

            }
            if (array.length % 2 != 0) {

                list.add(array[array.length / 2]);
            }

            array = list.stream().mapToInt(k -> k).toArray();
        }
        return array;
    }

    public static int[] foldArray(int[] array, int runs) {
//        for loop pro počet runs
        for (int i = 0; i < runs; i++) {
//           dočasná array, která bude mít polovinu velikosti výsledné/původní array
            int[] temp = new int[array.length/2];

//            for loop pro naplnění dočasné array
            for (int j = 0; j < temp.length; j++) {
                temp[j] = array[j] + array[array.length - 1 - j];
            }
            if (array.length % 2 != 0){
//                pokud je délka původní array lichá, tak poslední číslo z výsledné array přidám na konec dočasné array
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = array[array.length/2];
            }
//            do výsledné array uložím dočasnou array
            array = temp;
        }
        return array;
    }
}

//    As you see, if the count of numbers is odd, the middle number will stay. Otherwise the fold-point is between the middle-numbers, so all numbers would be added in a way.
//
//        The array will always contain numbers and will never be null. The parameter runs will always be a positive integer greater than 0 and says how many runs of folding your method has to do.
//
//        If an array with one element is folded, it stays as the same array.
//
//        The input array should not be modified!
