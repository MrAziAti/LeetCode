import java.util.Arrays;

public class RemoveDuplicates {



    public static void main(String[] args) {
        int [] a = {0,0,1,1,1,2,2,3,3,4};

        System.out.println(removeDuplicates(a));
        System.out.println(Arrays.toString(a));
    }

    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for(int j = 1; j < nums.length; j++){

            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
        }
        return i+1;

    }
}
