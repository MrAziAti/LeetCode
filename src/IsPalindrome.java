public class IsPalindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome(-121));
    }

    public static boolean isPalindrome(int x) {

        StringBuilder sb = new StringBuilder();

        sb.append(x);

        sb.reverse();

        return ("" + x).equals(sb.toString());


    }
}
