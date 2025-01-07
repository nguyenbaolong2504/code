import java.util.Scanner;

public class baitap5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.println("nhap a");
        a= sc.nextInt();
        System.out.println("nhap b");
        b =sc.nextInt();
        if(a==0){
            if(b==0){
            System.out.println("phuong trinh vo nghiem");
            }else{
                System.out.println("phuong trinh phuong trinh co so nghiem");
            }
        }else{
            System.out.println("phuong trinh co nghiem x="+(-b/a));
        }
    }
}
