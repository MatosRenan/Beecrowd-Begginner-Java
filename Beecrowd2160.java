import java.util.Scanner;

public class Beecrowd2160 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String l = sc.nextLine();

        if (l.length() <= 80) {
            System.out.println("YES");
        }   else {
            System.out.println("NO");
        }
    }
}
