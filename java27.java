import java.util.Scanner;

public class java27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        try {
            System.out.println("nhap vao so nguyen n:");
            n = sc.nextInt();
        } catch (Exception e) {
            System.out.println("nhap khong dung du lieu");
        } finally {
            System.out.println("end!");
        }

        System.out.println("gia tri nhap la:" + n);
        System.out.println("ket thuc chuong trinh");

    }
}
