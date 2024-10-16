public class diachi {
    private String quocgia;
    private String thanhpho;
    private String quan;
    private int sonha;

    public diachi(String quocgia, String thanhpho, String quan, int sonha ){
        this.quocgia = quocgia;
        this.thanhpho = thanhpho;
        this.quan = quan;
        this.sonha= sonha;
    }

    public String getQuocgia() {
        return quocgia;
    }

    public void setQuocgia(String quocgia) {
        this.quocgia = quocgia;
    }

    public String getThanhpho() {
        return thanhpho;
    }

    public void setThanhpho(String thanhpho) {
        this.thanhpho = thanhpho;
    }

    public String getQuan() {
        return quan;
    }

    public void setQuan(String quan) {
        this.quan = quan;
    }

    public int getSonha() {
        return sonha;
    }

    public void setSonha(int sonha) {
        this.sonha = sonha;
    }
    
}
