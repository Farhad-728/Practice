package org.example.homework5;

public class ShuffleTheArray {

    public static int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length / 2; i++) {
            newArray[index] = nums[i];
            index += 2;
        }
        index = 1;
        for (int i = n; i < nums.length; i++) {
            newArray[index] = nums[i];
            index += 2;
        }
        return newArray;
    }

    public static int[] shuffle2(int[] nums, int n) {
        int[] newArray = new int[nums.length];
        int index1 = 0;

        for (int i = 0; i < nums.length / 2; i++) {
            newArray[index1] = nums[i];
            newArray[index1 + 1] = nums[i + n];
            index1 += 2;
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int n = 3;
        shuffle2(nums, n);
    }
}
