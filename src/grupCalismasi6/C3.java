package grupCalismasi6;

public class C3 {
    public static void main(String[] args) {

        //Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.


        String s = "Tulumba";
        String result = "";

        for(int i=0; i<s.length(); i++){

            String c = s.substring(i,i+1);

            if(c.equals("m")){
                break; }

            result = result + c; }

        System.out.println(result);
        }



}