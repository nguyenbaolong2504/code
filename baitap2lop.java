
import java.util.Scanner;


public class baitap2lop {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        double x1;
        double x2;
        double x;
        System.out.println("nhap a");
        a=scanner.nextInt();
        System.out.println("nhap b");
        b=scanner.nextInt();
        System.out.println("nhap c");
        c=scanner.nextInt();
         if(a==0){
            if(b!=0 && c!=0){
            System.out.println("Phuong trinh bac nhat");
            }else{
                System.out.println("phuong trinh vo so nghiem");
            }
         }else{
            if((b*b-4*a*c)>0){
                x1 = (-b - Math.sqrt(b * b - 4 * a * c) / (2 * a));
                x2 = (-b + Math.sqrt(b * b - 4 * a * c) / (2 * a));
                System.out.println("phuong trinh co 2 nghiem phan biet:");
                System.out.println("nghiem thu nhat:"+x1);
                System.out.println("nghiem thu hai:"+x2);
            }else if((b*b-4*a*c)<0){
                System.out.println("phuong trinh vo nghiem");
            }else{
                x=-b/(2*a);
                System.out.println("phuong trinh co nghiem kep"+x);
            }
         }
         }
    }
