public class tennhanvien{
    private String ten;
    private int namsinh;
    private String vitri;
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getNamsinh() {
        return namsinh;
    }
    public void setNamsinh(int namsinh) {
        this.namsinh = namsinh;
    }
    public String getVitri() {
        return vitri;
    }
    public void setVitri(String vitri) {
        this.vitri = vitri;
    }
    public tennhanvien(String ten, int namsinh,String vitri){
        this.ten= ten;
        this.namsinh = namsinh;
        this.vitri = vitri;
    }
}
