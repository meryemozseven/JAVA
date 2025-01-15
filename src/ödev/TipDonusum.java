package ödev;

public class TipDonusum {
    //Ödev
    public static void main(String[] args) {

        String stringDegiskeni = "150";
        int integerDeger =  Integer.parseInt(stringDegiskeni);

        stringDegiskeni = String.valueOf(integerDeger);
        System.out.println("String Değişkeninin Son Değeri:" + stringDegiskeni);
        /*
        System.out.println(integerDeger);
        System.out.println(integerDeger2);
        */

        //Ödev2
        int sayi1 = 5 / 3 ;
        float sayi2 = 5f / 3f ;
        double sayi3 = 5d / 3d;
        System.out.println(sayi1);
        System.out.println(sayi2);
        System.out.println(sayi3);
        System.out.println("******************************");

        //Ödev3
        System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);

        System.out.println(1.0 - 0.9);
        System.out.println("******************************");

        //Ödev4

        int number1 =1;
        int number2 =2;
        System.out.println("1. değer:");
        double average2 = (number1+number2)/2.0;
        System.out.println("2. değer:" + average2);







    }
}
