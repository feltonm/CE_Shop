import java.util.*;

public class Combinations {

    // testing without using JUnit since method returns nothing and changes nothing
    public static void main(String[] args) {
        System.out.println("Testing [1, 2, 3]");
        int[] nums = {1,2,3};
        addsToTen(nums);

        System.out.println("Testing [1, 2, 9]");
        int[] numsWithOneCombo = {1,2,9};
        addsToTen(numsWithOneCombo);

        System.out.println("Testing [9,1,2,8]");
        int[] numsDisordered = {9,1,2,8};
        addsToTen(numsDisordered);

        System.out.println("Testing [9,1,2,8,9]");
        int[] numsRepeatedCombos = {9,1,2,8,9};
        addsToTen(numsRepeatedCombos);

        System.out.println("Testing [9,1,2,8,3,3,3,1]");
        int[] numsMessyCombos = {9,1,2,8,3,3,3,1};
        addsToTen(numsMessyCombos);

        System.out.println("Testing [-1,11,9,1,2,8,3,3,3,1]");
        int[] numsNegativeCombos = {-1,11,9,1,2,8,3,3,3,1};
        addsToTen(numsNegativeCombos);
    }

    /**
     * Checks if there are sets of numbers that add to 10 and prints those out.
     * Each number is treated as unique, ie [ 9, 1, 1] will return two combos
     *      9 1 (the first 1) and 9 1 (the second 1).
     *
     * @param numbers - array of ints to be checked for combinations
     */
    public static void addsToTen(int[] numbers){

        ArrayList<Integer> numList = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++) numList.add(numbers[i]);
        getComboToTen("", 0, numList);
    }

    private static void getComboToTen(String comboString, int comboSum, ArrayList<Integer> remaining){
        while (remaining.size() > 0){
            int next = remaining.remove(0);
            if (comboSum + next == 10){
                System.out.println(comboString + " " + next);
            } else if (comboSum + next < 10){
                String tempCombo = comboString + " " + next;
                int tempSum = comboSum + next;
                getComboToTen( tempCombo, tempSum, (ArrayList<Integer>) remaining.clone());
            }
        }
    }
}
