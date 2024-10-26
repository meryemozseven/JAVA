package Operators;

public class OdevOperator {
    public static void main(String[] args) {
//birinci
        int saniye =1200;
        int dakika =saniye/60;
        int saniyenew = saniye%60;

        System.out.println("Dakika Değeri:  " + dakika);
        System.out.println("Saniye Değeri:" + saniyenew);



        //ikinci
        double fahrenheit = 100d;
        double celsius = 5.0/9.0*(fahrenheit-32);
        System.out.println("Celcius Değeri:" + celsius);



        //üçüncü
        int year = 4000;
        boolean artikmi = (year%4==0) || (year%400==0) && (year%100!=0);
        System.out.println("Artık Yıl mı? :" + artikmi);


    }
}
