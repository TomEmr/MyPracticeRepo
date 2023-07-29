public class FindTheOddInt {

    public static void main(String[] args) {

        System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
        System.out.println(findIt(new int[]{20,1,1,2,2,3,3,5,5,4,20,4,5}));
        System.out.println(findIt(new int[]{10}));
        System.out.println(findIt(new int[]{1,1,1,1,1,1,10,1,1,1,1}));
        System.out.println(findIt(new int[]{5,4,3,2,1,5,4,3,2,10,10}));

    }

    public static int findIt(int[] a) {
//        to co budu vracet
        int odd = 0;
//        projdu všechny prvky pole a porovnám je s každým prvkem pole
        for (int k : a) {
            int count = 0;
//            pokud se rovnají, tak zvýším count o 1
            for (int i : a) {
                if (k == i) {
                    count++;
                }
            }
//            pokud je count lichý, tak je to číslo, které hledám
            if (count % 2 != 0) {
                odd = k;
            }
        }
        return odd;
    }
}

//    Given an array of integers, find the one that appears an odd number of times.
//
//        There will always be only one integer that appears an odd number of times.
//
//        Examples
//        [7] should return 7, because it occurs 1 time (which is odd).
//        [0] should return 0, because it occurs 1 time (which is odd).
//        [1,1,2] should return 2, because it occurs 1 time (which is odd).
//        [0,1,0,1,0] should return 0, because it occurs 3 times (which is odd).
//        [1,2,2,3,3,3,4,3,3,3,2,2,1] should return 4, because it appears 1 time (which is odd).
