public class SubtractProductAndSum {
    public static void main(String[] args) {

        int n = 234;

        int sum = 0;
        int sum2 = 1;
        while(n > 0){
            sum+= n%10;
            sum2*= n%10;
            n/=10;
        }

        System.out.println(sum);
        System.out.println(sum2);
    }

    /*public static int subtractProductAndSum(int n) {



    }*/
}
