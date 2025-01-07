public class java26 {
    // public static void main(String[] args) {
    // int out, in = 0;
    // outer: for (out = 0; out < 10; out++) {
    // for (in = 0; in < 20; in++) {
    // if (in > 10)
    // break outer;
    // }
    // System.out.println("vong lap ben trong out" + out + ", in=" + in);

    // }
    // System.out.println("vong lap ben ngoai out" + out + ",in =" + in);
    // }
    // }

    public static void main(String[] args) {
        int max = 100;

        loop: for (int i = 0; i < max; i++) {
            if (i < 50)
                continue loop;
            System.out.println(i);

        }
        System.out.println("ket thuc!");

    }
}