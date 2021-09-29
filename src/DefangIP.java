public class DefangIP {

    public static void main(String[] args) {

        String ip = "1.1.1.1";
        System.out.println(defangIPaddr(ip));



    }
    public static String defangIPaddr(String address) {

       String[] splite = address.split("\\.");

       String ut = "";
       for(int i = 0; i < splite.length; i++){
           if(i < splite.length -1){
               ut+= splite[i] + "[.]";

           }else{
               ut+= splite[i];
           }

       }
       return  ut;

    }
}
