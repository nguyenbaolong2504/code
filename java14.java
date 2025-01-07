import java.util.Scanner;

public class java14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.println("nhap so a:");
        a = sc.nextInt();
        System.out.println("nhap so b:");
        b = sc.nextInt();

        System.out.println(a + "==" + b + ":" + (a == b));
        System.out.println(a + "!=" + b + ":" + (a != b));
        System.out.println(a + "<" + b + ":" + (a < b));
        System.out.println(a + ">" + b + ":" + (a > b));
        System.out.println(a + "<=" + b + ":" + (a <= b));
        System.out.println(a + ">=" + b + ":" + (a >= b));
        System.out.println("---------------");
        System.out.println("ca hai so la so chan :" + (a % 2 == 0 && b % 2 == 0));
        System.out.println("co it nhat mot so chan :" + (a % 2 == 0 || b % 2 == 0));
    }
}
