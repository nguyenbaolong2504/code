import java.util.Scanner;

public class java11 {
    public static void main(String[] args) {
        // khai bao bien
        int a, b;

        // nhap du lieu

        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao a:");
        a = sc.nextInt();
        System.out.println("nhap b:");
        b = sc.nextInt();

        int tong = a + b;
        System.out.println(a + "+" + b + "=" + tong);

        int hieu = a - b;
        System.out.println(a + "-" + b + "=" + hieu);

        int nhan = a * b;
        System.out.println(a + "*" + b + "=" + nhan);

        float thuong = (float) a / b;
        System.out.println(a + "/" + b + "=" + thuong);

    }
}
