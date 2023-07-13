package com.leetcode.problems;

import java.util.Arrays;

public class MinimumMovesArrayEquals {
    public static int minMoves2(int[] nums) {
        Integer minMoves = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            Integer currentNumber = nums[i];
            Integer totalDiff = 0;
            for (Integer nextNumber : nums) {
                Integer diff;
                diff = Math.abs(currentNumber - nextNumber);
                totalDiff = totalDiff + diff;
            }
            if(totalDiff > 0) {
                minMoves = Math.min(totalDiff, minMoves);
            }
        }
        return minMoves;
    }

    public static int minMoves23(int[] nums){
        Arrays.sort(nums);
        int operations = 0;
        int median = nums[nums.length/2];
        for (int num : nums) {
            operations = operations + Math.abs(median - num);
        }
        return operations;
    }

    public static void main(String[] args) {
        System.out.println(minMoves23(new int[]{-7615376,7065767,-30721502,-19896790,5612685,39535964,-28332744,-34825120,-20172334,20503934,-16199657,-34307308,-6071378,-27835828,-9937876,42289534,-38232842,-20048091,-41335036,7821723,-34432687,-41289744,-6009854,-18287348,-16529745,22966834,-36025511,-17681789,-7328936,-24486358,8473552,-4012820,12532319,-19520114,-42675015,-22563687,5898339,-19792526,-18667547,29737653,4256053,40738294,4192736,-13456716,19165257,-3114524,1812666,-32700329,-11045955,-42878398,42913398,32171554,-35468192,36350643,7024999,-23676354,-36766741,11476115,26064512,24272680,30855422,22997937,-28711943,883031,38015942,8971606,22085278,31960328,2003730,-31120158,-28497464,35907947,-24312257,-20653835,22875253,-18354614,-29555971,13035117,-30088475,-42014807,38866755,25241564,39063323,-38428372,14361223,-11603067,-8123101,-14265425,-5158953,-28792390,5251891,24504379,19856404,-5904515,-15326481,37288598,-29579356,-14403264,-18041711,-34734244}));
    }
}
