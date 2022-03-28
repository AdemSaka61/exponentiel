import java.util.Scanner;


public class exponentialNumbers {
    public static void main(String[] args) {

        int n, k, total = 1;

        Scanner ust = new Scanner(System.in);

        System.out.print("üssü alınacak Sayıyı Giriniz :");
        n = ust.nextInt();

        System.out.print("Üs Sayısını Giriniz :");
        k = ust.nextInt();

        for (int i = 1; i <= k; i++) {
            total *= n;
        }
        System.out.println("Cevap :" + total);

    }
}
