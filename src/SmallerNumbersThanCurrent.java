import java.util.Arrays;

public class SmallerNumbersThanCurrent {

    public static void main(String[] args) {
        int [] a = {6,5,4,8};
        int [] b = smallerNumbersThanCurrent(a);

        System.out.println(Arrays.toString(b));

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] arr = new int [nums.length];
        int smaller = 0;
        for(int i = 0; i< nums.length; i++){
            int j = 0;
            for(j = 0; j<nums.length;j++){
                if(nums[j] < nums[i]){
                    smaller++;
                    arr[i] = smaller;

                }

            }
            smaller=0;
        }
        return arr;
    }
}
