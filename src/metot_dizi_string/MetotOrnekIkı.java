public class MetotOrnekIkı {
    public static void main(String[] args) {
        // Metodu çağır ve sonucu yazdır
        int number = 5;
        int result = calculateFactorial(number);
        System.out.println(number + " sayısının faktöriyeli: " + result);
    }

    // Faktöriyel hesaplayan metot
    public static int calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Negatif sayılar için faktöriyel hesaplanamaz.");
            return -1; // Hata durumu
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
