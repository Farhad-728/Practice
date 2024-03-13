package org.example.homework5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class InterTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
/*1ci massivde unik elementleri set de saxla
         intersec set yaratmaq
         nums2 iterator etmek ve yoxlamaq nums 2 elemetleri setde var
         varsa intersec sete elave edirik
         set i array convert*/
        Set<Integer> set1 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            set1.add(nums1[i]);
        }
        Set<Integer> intersecSet = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
           if (set1.contains(nums2[i])) {
               intersecSet.add(nums2[i]);
           }

        }
        int[] result = new int[intersecSet.size()];
        int index = 0;
        for (int value : intersecSet) {
            result[index] = value;
            index++;
        }
        return  result;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1}, nums2 = {2, 2};
        InterTwoArrays twoArrays = new InterTwoArrays();
        twoArrays.intersection(nums1, nums2);
    }
}
