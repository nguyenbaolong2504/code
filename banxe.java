public class banxe {
    private String ten;
    private String diachi;
    private String kieuxe;
    private String tennhanvien;

public banxe(String ten, String diachi,String kieuxe,String tennhanvien){
    this.ten=ten;
    this.diachi=diachi;
    this.kieuxe=kieuxe;
    this.tennhanvien=tennhanvien;
}

public String getTen() {
    return ten;
}
public void setTen(String ten) {
    this.ten = ten;
}
public String getDiachi() {
    return diachi;
}
public void setDiachi(String diachi) {
    this.diachi = diachi;
}

public String getKieuxe() {
    return kieuxe;
}
public void setKieuxe(String kieuxe) {
    this.kieuxe = kieuxe;
}

public String getTennhanvien() {
    return tennhanvien;
}
public void setTennhanvien(String tennhanvien) {
    this.tennhanvien = tennhanvien;
}
 public void inbanxe(){
    System.out.println(this.kieuxe);
    
 }

}
