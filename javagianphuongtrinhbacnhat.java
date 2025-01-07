import java.util.Scanner;

public class javagianphuongtrinhbacnhat {
    public static void main(String[] args) {
        int a, b, x;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao a:");
        a = sc.nextInt();

        System.out.println("nhap vao b:");
        b = sc.nextInt();

        if (a == 0) {
            if (b == 0) {
                System.out.println("phuong trinh vo so nghiem");
            } else {
                System.out.println("phuong trinh vo nghiem");
            }
        } else {
            x = -b / a;
            System.out.println("phuong trinh co nghiep x=" + x);
        }
    }

}
