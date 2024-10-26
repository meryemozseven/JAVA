package degisken_kavrami;

public class IlkelVeriTipleri {
    public static void main(String[] args) {
        int integerDegiskeniminDegeri = 10;
        double doubleDegiskeniminDegeri =10.50;
        Short shortVeriTipi = 29853;

        //ifadeler tam sayı veri türlerinin özelliklerini yansıtır.
        System.out.println("Byte en küçük değeri:" + Byte.MIN_VALUE + " EN BÜYÜK DEĞERİ:" + Byte.MAX_VALUE  + " KAÇ BİT: "+ Byte.SIZE);
        System.out.println("Short en küçük değeri:" + Short.MIN_VALUE + " Short BÜYÜK DEĞERİ:" + Short.MAX_VALUE  + " KAÇ BİT: "+ Short.SIZE);
        System.out.println("INTEGER en küçük değeri:" + Integer.MIN_VALUE + " Integer BÜYÜK DEĞERİ:" + Integer.MAX_VALUE  + " KAÇ BİT: "+ Integer.SIZE);
        System.out.println("Long en küçük değeri:" + Long.MIN_VALUE + " Long BÜYÜK DEĞERİ:" + Long.MAX_VALUE  + " KAÇ BİT: "+ Long.SIZE);

        //ifadeler ondalık sayı veri türlerinin özelliklerini yansıtır.
        System.out.println("Float en küçük değeri:" + Float.MIN_VALUE + " Float BÜYÜK DEĞERİ:" + Float.MAX_VALUE  + " KAÇ BİT: "+ Float.SIZE);
        System.out.println("Double en küçük değeri:" + Double.MIN_VALUE + " Double BÜYÜK DEĞERİ:" + Double.MAX_VALUE  + " KAÇ BİT: "+ Double.SIZE);

        // char
        char harf = 'a';
        System.out.println("Harf:" + harf);
        int integerDeger = 'A';
        System.out.println("integer Deger:" + integerDeger);

        //boolean
        boolean sonuc = true;
        System.out.println("boolean sonuç değişkeni değeri: " +sonuc);
        sonuc = false;
        System.out.println("boolean sonuç değişkeni değeri: " +sonuc);

        boolean sonuc2 = false;
        System.out.println("boolean sonuç2 değişkeni değeri: " +sonuc);









    }


}
