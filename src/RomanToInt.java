import java.util.HashMap;
import java.util.Map;

public class RomanToInt {

    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
    public static int romanToInt(String s) {

        Map<Character, Integer> map = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );

        int sum = 0;

        for(int i=s.length()-1; i >= 0; i--){
            char r = s.charAt(i);

            if(r == 'V' || r == 'X') {
                if(i > 0 && s.charAt(i-1) == 'I'){
                    sum -=1;
                    i--;
                }

            }
            if(r == 'L' || r == 'C') {
                if(i > 0 && s.charAt(i-1) == 'X'){
                    sum -=10;
                    i--;
                }

            }
            if(r == 'D' || r == 'M') {
                if(i > 0 && s.charAt(i-1) == 'C'){
                    sum -=100;
                    i--;
                }

            }
            sum += map.get(r);
        }

        return sum;
    }
}
