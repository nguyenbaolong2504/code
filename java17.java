import java.util.Scanner;

public class java17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("nhap vao n:");
        n = sc.nextInt();

        // kiem tra chan le
        if (n % 2 == 0) {
            System.out.println(n + "la so chan");
        } else {
            System.out.println(n + "la so le");
        }
    }

}
