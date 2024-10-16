public class ten {
private String hovaten;
private int tuoi;
private double sodienthoai;
private String gioitinh;

public String getHovaten() {
    return hovaten;
}

public void setHovaten(String hovaten) {
    this.hovaten = hovaten;
}

public int getTuoi() {
    return tuoi;
}

public void setTuoi(int tuoi) {
    this.tuoi = tuoi;
}

public double getSodienthoai() {
    return sodienthoai;
}

public void setSodienthoai(double sodienthoai) {
    this.sodienthoai = sodienthoai;
}

public String getGioitinh() {
    return gioitinh;
}

public void setGioitinh(String gioitinh) {
    this.gioitinh = gioitinh;
}

public ten( String hovaten, int tuoi, double sodienthoai, String gioitinh){
    this.hovaten=hovaten;
    this.tuoi= tuoi;
    this.sodienthoai= sodienthoai;
    this.gioitinh = gioitinh;
}

}
