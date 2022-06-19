import java.util.Scanner;

public class odev27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c = 1, d, min = 0, max = 0;

        System.out.print("Kac tane sayi gireceksiniz: ");
        a = input.nextInt();
        b = a;

        while (b > 0) {
            System.out.print(c + "." + "Sayiyi Giriniz : ");
            d = input.nextInt();

            if (a == b) {
                max = d;
                min = d;
            } else {
                if (d > max) {
                    max = d;
                } else if (d < min) {
                    min = d;
                }
            }
            c++;
            b--;

        }
        System.out.println("\nMax : " + max);
        System.out.println("Min : " + min);
    }
}
