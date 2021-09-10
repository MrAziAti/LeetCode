public class LongestCommonPrefix {
    public static void main(String[] args) {

        String []strs = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(strs));
    }


    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0){
            return "";
        }

        int prefix = 0;

        outer: for(int i = 0;; i++){
            //boolean flag = true;
            if(strs[0].isEmpty()){
                return "";
            }
            if(i > strs[0].length() -1){
                break;
            }

            char s = strs[0].charAt(i);
            for(int j = 1; j < strs.length;j++)
                if(i > strs[j].length()-1 || s != strs[j].charAt(i))
                    break outer;

            prefix++;
        }
        return strs[0].substring(0,prefix);
    }
}
