package degisken_kavrami;

public class TipDönüşümüTypeCasting {
    public static void main(String[] args) {
    int sayi=10;
    float noktaliSayi = 25.25F;


/*
    noktaliSayi=sayi;
    System.out.println("Noktalı Sayının Değeri: " + noktaliSayi);
    */
    sayi=(int) noktaliSayi;
        System.out.println("Sayının Değeri: "+sayi);
byte byteSayi = 10;
byteSayi = (byte) noktaliSayi;
        System.out.println("Byte Sayının Değeri: " + byteSayi);
    }
}
