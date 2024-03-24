package org.example.homework6;

public class BuildArrayFromPermutation {
    public static int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = nums[nums[i]];  //4,5,0,1,2,3
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {5, 0, 1, 2, 3, 4};
        buildArray(nums);
    }
}
