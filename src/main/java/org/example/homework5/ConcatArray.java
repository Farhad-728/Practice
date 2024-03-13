package org.example.homework5;

public class ConcatArray {
    public int[] getConcatenation(int[] nums) {
/*        process 1. ikiqat uzunluqlu array uzunlughu n
         2. gonderilen array iterator
         3. 0 dan n/2 qder elemetlerin set-i
         4. array tekrar iterator n/2 den n-e qeder set-i */
        int[] resultArray = new int[nums.length * 2];
        int numsLength = nums.length;

        for (int i = 0; i < nums.length; i++) {
            resultArray[i] = nums[i];
            resultArray[i + numsLength] = nums[i];
        }

        return resultArray;

    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3}; //input
        ConcatArray concatArray = new ConcatArray();
        concatArray.getConcatenation(nums); //output
    }
}
