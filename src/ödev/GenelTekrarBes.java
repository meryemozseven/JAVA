package ödev;

public class GenelTekrarBes {
    public static void main(String[] args) {
        /*bir sayıın asal olup olmadığını bulalım*/
        int i=6;
        boolean asal=true;
        if(i<=1){
            System.out.println("bir asal sayı değil");
        }else{

            for (int sayi=2;sayi<i;sayi++){
                int sonuc = i%sayi;
                if(sonuc==0){
                    asal=false;
                    System.out.println("bir asal sayı değil");
                    break;
                }
            }if(asal){
                System.out.println("bir asal sayıdır");
            }

        }


    }
}
