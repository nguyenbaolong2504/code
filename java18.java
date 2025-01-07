import java.util.Scanner;

public class java18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, x;
        double x1, x2;

        System.out.println("nhap so a:");
        a = sc.nextInt();
        System.out.println("nhap so b:");
        b = sc.nextInt();
        System.out.println("nhap so c");
        c = sc.nextInt();

        if (a == 0) {
            System.out.println("phuong trinh bac nhat");
        } else {
            if (b * b - 4 * a * c > 0) {
                x1 = (-b - Math.sqrt(b * b - 4 * a * c) / (2 * a));
                x2 = (-b + Math.sqrt(b * b - 4 * a * c) / (2 * a));
                System.out.println("phuong trinh co 2 nghiep phan biet");
                System.out.println("x1=" + x1);
                System.out.println("x1=" + Math.round(x1));
                System.out.println("x2=" + x2);
                System.out.println("x2=" + Math.round(x2));
            } else if (b * b - 4 * a * c < 0) {
                System.out.println("phuong trinh vo nghiem");
            } else {
                x = -b / 2 * a;
                System.out.println("phuong trinh co nghiem kep x=" + x);
            }
        }
    }
}
