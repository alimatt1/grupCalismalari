package grupCalismasi10;

public class C01 {
    // String str1=" Today weather is sunny and 72 degree. It is a perfect day to practice java";
    public static void main(String[] args) {

        String str1=" Today weather is sunny and 72 degree. It is a perfect day to practice java";

        String derece=str1.replaceAll("\\D","");
        System.out.println(derece);//72

        // (30 C * 1.8) +32=86 F

        int fahrenheit=Integer.parseInt(derece);
        System.out.println(fahrenheit);//72

        double yeniCelcius= ((fahrenheit-32)/1.8);

        System.out.println("donusumu istenilen : "+fahrenheit + " F" + " Derece karsiligi : " + yeniCelcius);





    }
}
