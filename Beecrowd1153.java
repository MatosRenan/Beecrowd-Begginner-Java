import java.util.Scanner;

public class Beecrowd1153 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int fatorial = 1;

        if (n < 13 && n > 0) {

            for (int i = 1; i <= n ; i++) {

                fatorial *= i;
            }
        }
        System.out.println(fatorial);
    }
}
