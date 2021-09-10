public class ReverseInteger {

    public static void main(String[] args) {

        System.out.println(reverse(-1220));
    }
    public static int reverse(int x) {

       StringBuilder sp = new StringBuilder();

       boolean minus = x < 0;

       sp.append(x);

       sp.reverse();
        int n = 0;
        try{
            n = Integer.parseInt(minus ? sp.substring(0,sp.length()-1) : sp.toString());
        }catch(Exception e){

        }

       return minus ? -n : n;
    }
}
