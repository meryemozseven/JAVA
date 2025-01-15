package ödev;

import java.util.Scanner;

public class If_else_alistirma {
    public static void main(String[] args) {
        int boy=0;
        double kilo=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Lütfen boyunuzu cm cinsinden giriniz:");
        boy=sc.nextInt();
        System.out.println("Lütfen kilonuzu kg cinsinden giriniz:");
        kilo = sc.nextInt();

        //cm to metre
        double vucutKitleEndeksi =0;
        double cmtoMetre = boy /100.0;
        double boyunKaresi = Math.pow(cmtoMetre,2);

        vucutKitleEndeksi = kilo/boyunKaresi;

        if(vucutKitleEndeksi < 15){
            System.out.println(vucutKitleEndeksi+"Çok ciddi derecede düşük kilolu");
        }else if(vucutKitleEndeksi > 15 && vucutKitleEndeksi <16){
            System.out.println("Ciddi derecede düşük kilolu");
        }else if(vucutKitleEndeksi > 16 && vucutKitleEndeksi < 25){
            System.out.println("Sağlıklı");
        }else if(vucutKitleEndeksi > 25 && vucutKitleEndeksi < 40){
            System.out.println("Kilolu");
        }else {
            System.out.println("Aşırı kilolu");
        }


    }
}
