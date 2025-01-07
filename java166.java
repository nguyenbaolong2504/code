import java.util.Scanner;

public class java166 {
    public static void main(String[] args) {
        double r, dientich, chuvi;
        Scanner sc = new Scanner(System.in);

        System.out.println("nhap r:");
        r = sc.nextDouble();

        // tinh chu vi

        chuvi = 2 * Math.PI * r;
        System.out.println("Chuvi=" + chuvi);
        System.out.println("Chuvi=" + Math.round(chuvi));

        // dien tich

        dientich = Math.PI * Math.pow(r, 2);

        System.out.println("dien tich =" + dientich);
        System.out.println("dien tich =" + Math.round(dientich));

    }
}
