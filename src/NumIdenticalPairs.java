public class NumIdenticalPairs {

    public static void main(String[] args) {
        int[] a = {1,2,3,1,1,3};

        System.out.println(numIdenticalPairs(a));
    }

    public static int numIdenticalPairs(int[] nums) {
        int smaller = 0;

        for(int i = 0; i< nums.length; i++){

            for(int j = i+1; j<nums.length;j++){
                if(nums[j] == nums[i]){
                    smaller++;
                }
            }

        }
        return smaller;
    }
}
