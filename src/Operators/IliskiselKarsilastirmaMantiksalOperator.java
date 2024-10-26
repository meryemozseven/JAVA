package Operators;

public class IliskiselKarsilastirmaMantiksalOperator {
    public static void main(String[] args) {
   int sayi1=10;
    int sayi2=10;
        System.out.println("sayi1 ve sayi2 eşit mi ? " + (sayi1 == sayi2));
        System.out.println("sayi1 ve sayi2'den küçük mü ? " + (sayi1 < sayi2));
        System.out.println("sayi1 ve sayi2'den  büyük mü ? " + (sayi1 > sayi2));
        System.out.println("sayi1 ve sayi2'den küçük eşit mi ? " + (sayi1 <= sayi2));
        System.out.println("sayi1 ve sayi2'den büyük eşit mi ? " + (sayi1 >= sayi2));
    if(sayi1==sayi2){
        System.out.println("s1=s2");
    }


    //MANTIKSAL OPERATÖRLER
           // && ve => true olması için iki değişkenin değerinin de true olması gerekir. Diğer durumlarda false değer döndürür.
            //|| veya => false olması için iki değişkenin değerinin de false olması gerekir. Diğer durumlarda true değer döndürür.
          //  ! değil => önündeki ifadenin tersini verir.
        boolean deger1= true ;
        boolean deger2= false ;
        System.out.println("ve: " + (deger1 && deger2));
        System.out.println("or: " + (deger1 || deger2));

        int cocuk1=30;
        int cocuk2=25;

        if(cocuk1<40 && cocuk2>20){
            System.out.println("çalışabilir");


        }
        if(cocuk1<25 || cocuk2>25){
            System.out.println("çalışamaz");

        }else {
            System.out.println("else çalıştı");
        }




    }

}
