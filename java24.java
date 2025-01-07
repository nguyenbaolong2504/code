import java.util.Scanner;

public class java24 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so nguyen n:");
        n = sc.nextInt();

        String nhiphan = "";
        while (n > 0) {
            nhiphan = (n % 2) + nhiphan;
            n = n / 2;
        }
        System.out.println("he nhi phan la:" + nhiphan);

    }
}
