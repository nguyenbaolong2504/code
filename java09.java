import java.util.Scanner;

public class java09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nha vao ho va ten:");
        String hovaten = sc.nextLine();

        System.out.println("nhap ma sinh vien:");
        long masinhvien = sc.nextLong();

        System.out.println("nhap vao diem thi:");
        float diemthi = sc.nextFloat();

        System.out.println(".......");
        System.out.println("ho va ten" + hovaten);
        System.out.println("ma sinh vien" + masinhvien);
        System.out.println("diemthi" + diemthi);
    }
}
