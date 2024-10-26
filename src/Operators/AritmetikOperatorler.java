package Operators;

public class AritmetikOperatorler {
    public static void main(String[] args) {
        int sayi1 =20;
        int sayi2 = 40;
        int toplam = sayi1 + sayi2;
        double bolme = (double) sayi1 / (double) sayi2;

        int carpma = sayi1 * sayi2;
        double mod = sayi2 % sayi1;

        System.out.println("toplam: " + toplam + " bolme: " + bolme + " carpma: " + carpma + " mod:" + mod);

    }
}
