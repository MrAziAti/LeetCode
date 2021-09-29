public class LengthOfLastWord {

    public static void main(String[] args) {

        lengthOfLastWord("   fly me   to   the moo0000n  ");
    }

    public static int lengthOfLastWord(String s) {

        String[] split = s.split(" ");

        int len = split[split.length-1].length();

        return len;


    }
}
