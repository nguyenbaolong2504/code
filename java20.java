import java.util.Scanner;

public class java20 {
    public static void main(String[] args) {
        int thang, nam;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao thang:");
        thang = sc.nextInt();
        System.out.println("nhap vao nam");
        nam = sc.nextInt();

        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("thang co 31 ngay");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("thang co 30 ngay");
                break;
            case 2:
                if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
                    System.out.println("thang 2 co 29 ngay");
                } else {
                    System.out.println("thang 2 co 28 ngay");
                }
                break;

            default:
                System.out.println("khong co gia tri");
                break;
        }
    }
}
