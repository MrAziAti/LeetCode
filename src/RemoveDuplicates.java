import java.util.Arrays;

public class RemoveDuplicates {



    public static void main(String[] args) {
        int [] a = {2,5,7,1,2,3};

        System.out.println(removeDuplicates(a));
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
