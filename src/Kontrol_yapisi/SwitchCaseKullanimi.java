package Kontrol_yapisi;
import java.util.Scanner;
public class SwitchCaseKullanimi {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);;
        System.out.println("Haftanın kaçıncı gününü istediğini gir");

        int haftaninKacinciGunu=sc.nextInt();
        //	• Koşula bağlanan değişken double veya float olamaz.
        //
        //Değişkenlerin hangi aralıkta olduğu incelenemez.
        switch (haftaninKacinciGunu){
            case 1:
                System.out.println("Switch Pazartesi");break;
            case 2:
                System.out.println("Switch Salı");break;
            case 3:
                System.out.println("Switch Çarşamba");break;
            case 4:
                System.out.println("Switch Perşembe");break;
            case 5:
                System.out.println("Switch Cuma");break;
            default:
                System.out.println("Yanlış bir ifade girdin.");

        }
        System.out.println("Switch'den çıkıldı");



    }
}
