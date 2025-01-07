public class toantujava {
    public static void main(String[] agrs) {
        int a = 1;
        int b = 4;
        int c = a < b ? 1 : 4;
        // in roi moi tang
        System.out.println(a++);
        // tang roi moi in
        System.out.println(++a);
        // cong 1 va in ra roi moi tang
        System.out.println(a++ + 1);
        // tang roi moi cong 1 va in ra
        System.out.println(++a + 1);
        // toan tu gan +=
        System.out.println(a += b);
        // toan tu gan -=
        System.out.println(a -= b);
        // toan su &
        System.out.println(a & b);
        // toan tu|
        System.out.println(a | b);
        // toan tu ^
        System.out.println(a ^ b);
        // toan tu~
        System.out.println(~b);
        // toan tu <<
        System.out.println(a << b);
        // in gia tri cua c o tren
        System.out.println(c);
    }
}
