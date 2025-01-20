public class MetotOrnekIkı {
    public static void main(String[] args) {

        int number = 5;
        int result = calculateFactorial(number);
        System.out.println(number + "sayısının faktöriyeli: " + result);
    }

    //Faktoriyel hesapla
    public static int calculateFactorial(int n) {
        if (n < 0) {
            System.out.println("Negatif sayılar için faktöriyel hesaplanamaz.");
            return -1;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
