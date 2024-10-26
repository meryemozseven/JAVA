package ödev.trying;
import java.util.Scanner;

public class if_else_blogu  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Yaşınızı girin:");

        String yas = sc.next();

        // Integer.parseInt ile string değeri tamsayıya dönüştürme
        int onyil = Integer.parseInt(yas) + 10;

        System.out.println("On yıl sonra yaşınız: " + onyil);

        // Scanner'ı kapat
        sc.close();
    }
}
