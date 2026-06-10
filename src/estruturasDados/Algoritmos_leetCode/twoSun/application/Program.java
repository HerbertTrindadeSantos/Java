package estruturasDados.Algoritmos_leetCode.twoSun.application;

import estruturasDados.Algoritmos_leetCode.twoSun.Solution.SolitionTwoSun;

public class Program {
    public static void main(String[] args) {
        int[] nums = new int[]{3,3};
        int[] targets = new int[2];
        int target = 6;
        SolitionTwoSun st = new SolitionTwoSun(targets);
        System.out.println(st.twoSum(nums,target));
    }
}
