public class test {
    public static void main(String[] args) {
        ten Ten1 = new ten("Nguyen bao long", 19, 036324234, "nam");
        ten Ten2 = new ten("Nguyen van A", 24, 042342525, "nu");
        ten Ten3 = new ten("nguyen thuy lan", 55, 043634253, "nu");
        System.out.println(Ten1,Ten2);

        diachi diachi1 = new diachi("Viet Nam", "ha noi", "bac tu liem", 57);
        diachi diachi2 = new diachi("viet nam","thai binh" , "quynh phu", 34);
        diachi diachi3 = new diachi("viet nam", "ho chi minh", "quan nhat", 67); 

        kieuxe kieuxe1 = new  kieuxe("Toyota", 100000000, "nhat ban");
        kieuxe kieuxe2 = new kieuxe("vinfast f9", 20000000, "viet nam");
        kieuxe kieuxe3 = new kieuxe("Ferari", 23100000, "My");

        tennhanvien tennhanvien1 = new tennhanvien("nguyen van B", 1999, "nhan vien ban hang");
        tennhanvien tennhanvien2 = new tennhanvien("nguyen thi C", 1988, "ke toan");
        tennhanvien tennhanvien3 = new tennhanvien("le thi K", 2000, "giam doc");

        banxe banxe1 = new banxe("nguyen bao long", "Viet Nam ", "Toyota", "nguyen van B");
        banxe banxe2 = new banxe("nguyen thuy lan", "viet nam", "vinfast f9", " nguyen thi C");
        
        banxe1.inbanxe();
        banxe2.inbanxe();
    }
}
