package javainterviewQuestions;

public class khazarabi {

    public static void main(String[] args) {

       // aaaabbcccdda==> a4b2c3d2a

        String x= "aaaabbcccdda";

    }

   public static String frequent(String str){

        String ret="";
        int count=1;

        for (int i=0; i<str.length()-1;i++){

            if (str.charAt(i)==str.charAt(i+1)){

                count++;
                continue;
            }else{

                ret= ret+ret.charAt(i)+count;
            }
            count=1;
        }
        ret= ret+str.charAt(str.length()-1);
        return ret;
   }
}
