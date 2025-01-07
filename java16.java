import java.util.Scanner;

public class java16 {
    public static void main(String[] args) {
        double a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap vao a:");
        a = sc.nextDouble();

        System.out.println("nhap vao b:");
        b = sc.nextDouble();

        // ham tri tuyet doi

        System.out.println(("|a|" + Math.abs(a)));

        // ham tim min

        System.out.println("min(a,b) =" + Math.min(a, b));

        // ham tim max
        System.out.println("max(a,b) =" + Math.max(a, b));

        // ham tim ceil

        System.out.println("ceil(a) =" + Math.ceil(a));

        // ham floor
        System.out.println("floor(a)=" + Math.floor(a));

        // ham can bac hai sqrt

        System.out.println("sqrt(a)=" + Math.sqrt(a));

        // tim ham a^b\

        System.out.println("a^b =" + Math.pow(a, b));

    }
}
