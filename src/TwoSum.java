import java.util.Arrays;

public class TwoSum {

    public static void main(String[] args) {


        System.out.println(Arrays.toString(twoSum(new int[]{11,7,11,15,2},9)));
    }
        public static int[] twoSum(int[] nums, int target) {


            for(int i = 1; i<nums.length; i++){
                for(int j = i; j < nums.length; j++ ){
                    if(nums[j] + nums[j-i] == target){
                        return new int[] {j,j-i};
                    }
                }
            }
            return null;
        }

}
