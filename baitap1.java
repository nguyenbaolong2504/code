public class baitap1 {
    public static void main(String[] args) {
        int _tong = 120;
        String _str = "nguyen bao long";
        HelloWorld objHelloWorld = new baitap1();
        objHelloWorld.fhello(_tong);
    }
    void fhello(int tong, String str){
        System.out.println("day la chuoi phuong thuc cua fhello"+str +" "+tong);
    }
}
