import java.util.Arrays;

public class FoldAnArray {

    public static int[] foldArray(int[] array, int runs)
    {
//        nová array do které budu ukládat výsledky
        int[] result = array;
//        for loop pro počet runs
        for (int i = 0; i < runs; i++) {
//           dočasná array, která bude mít polovinu velikosti výsledné/původní array
            int[] temp = new int[result.length/2];
//            for loop pro naplnění dočasné array
            for (int j = 0; j < temp.length; j++) {
                temp[j] = result[j] + result[result.length - 1 - j];
            }
            if (result.length % 2 != 0){
//                pokud je délka původní array lichá, tak poslední číslo z výsledné array přidám na konec dočasné array
                temp = Arrays.copyOf(temp, temp.length + 1);

                temp[temp.length - 1] = result[result.length/2];
            }
//            do výsledné array uložím dočasnou array
            result = temp;
        }
        return result;
    }
}

//    As you see, if the count of numbers is odd, the middle number will stay. Otherwise the fold-point is between the middle-numbers, so all numbers would be added in a way.
//
//        The array will always contain numbers and will never be null. The parameter runs will always be a positive integer greater than 0 and says how many runs of folding your method has to do.
//
//        If an array with one element is folded, it stays as the same array.
//
//        The input array should not be modified!
