package metot_dizi_string;

import java.util.Scanner;

public class Diziler {

    public static void main(String[] args) {
      /*  //Çözüm1
        int sayilar[] = new int[10];
        for (int index = 0; index < sayilar.length ;index ++){

            sayilar[index]=(int) Math.pow(index, 2);
        }
        for (int index = 0; index < sayilar.length ;index ++){
            System.out.println(sayilar[index]);

        }
       // ÇÖZÜM İKİ
            String[]aylar = {"ocak","şubat","mart"};
            Scanner input = new Scanner(System.in);
        System.out.println("bir ay değerini rakamla yazmalısın");
            int ay = input.nextInt();
        System.out.println("seçtiğin ay" + aylar[ay-1]);*/
/*///çözüm üç

        Scanner input2 = new Scanner(System.in);
        int sayilar[] = new int[5];
        int toplam=0;

        for(int i =0; i < sayilar.length ;i++){
            System.out.println("Ortalamasını almak istediğim 5 sayıyı yaz");
            sayilar[i]=input2.nextInt();
            toplam += sayilar[i];
        }
        double ortalama= (double) toplam/sayilar.length;
        System.out.println("girilen sayıların ortalaması" + ortalama);
        input2.close();*/

//çözüm 4
        System.out.println("kaç sayının ortalamasını alaccaksın");
        Scanner input3 = new Scanner(System.in);
        int kacTane = input3.nextInt();
        int sayiDizisi[] = new int[kacTane];
        int toplam2= 0;
        for(int i =0; i < sayiDizisi.length ;i++){
            System.out.println("ortalamasını almak istediğiniz " +i+1 +". sayıyı giriniz");
            sayiDizisi[i]=input3.nextInt();
            toplam2+=sayiDizisi[i];
        }
        double ortalama2= (double) toplam2/kacTane;
        System.out.println("Girdiğiniz sayıların ortalaması" + ortalama2);
        input3.close();





    }



}
