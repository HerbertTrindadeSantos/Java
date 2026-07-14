package estruturasDados.Algoritmos_leetCode.twoSun.Solution;

public class SolitionTwoSun {

    private int[] targets;

    public SolitionTwoSun(int[] targets) {
        this.targets = targets;
    }

    public int[] getTargets() {
        return targets;
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalStateException("Nenhum valor encontrado.");
    }

    public void print(){
        for (int tar : targets){
            System.out.println(getTargets());
        }
    }
}
