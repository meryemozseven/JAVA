package ödev;

import java.util.Scanner;

public class GenelTekrarUcc {
    public static void main(String[] args) {
        /*SORU 14:
        Girilen bir metnin palindrome olup olmadığını kontrol eden programı yazınız.
        Tersten okunuşu aynı olan kelimeler palindrome'dur. Kaçak gibi...*/

                Scanner tara = new Scanner(System.in);
                System.out.println("Bir kelime girin");
                String kelime = tara.nextLine();

                int altSinir = 0;
                int ustSinir = kelime.length() - 1;
                boolean palindromeMu = true;


                while(altSinir < ustSinir ){
                    if(kelime.charAt(altSinir) != kelime.charAt(ustSinir)){
                        palindromeMu=false;
                        break;
                    }
                    altSinir++;
                    ustSinir--;
                }

                if (palindromeMu){
                    System.out.println(kelime+" kelimesi palindromedur");
                }else{
                    System.out.println(kelime+" kelimesi palindrome değildir");
                }







    }
}
