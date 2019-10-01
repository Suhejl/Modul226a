package ch.tbz.modul404.x1_debugging;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int nums[] = {10, 20, 10, 20, 30, 40, 40, 30, 50, 10};
        int result;
        System.out.println("Source Array: " + Arrays.toString(nums));
        result = getSingleNumber(nums);
        System.out.println("\n" + result + " appears only once");
    }

    public static int getSingleNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
            i = i;
        }
        return  result;
    }
}
