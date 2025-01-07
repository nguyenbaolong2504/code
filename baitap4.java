import java.util.Scanner;

public class baitap4 {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap a");a=sc.nextInt();
        System.out.println("nhap b");
        b= sc.nextInt();
        if(a>b){
            System.out.println("a lon hon b");
        }else{
            System.out.println("a khong lon hon b");
        }
    }
}
