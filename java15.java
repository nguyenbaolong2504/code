import java.util.Scanner;

public class java15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;

        System.out.println("nhap a:");
        a = sc.nextInt();

        String ketqua = (a % 2 == 0) ? "So chan" : "so le";
        System.out.println(a + " la " + ketqua);
    }
}
