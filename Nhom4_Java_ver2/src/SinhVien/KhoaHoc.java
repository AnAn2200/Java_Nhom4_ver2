package SinhVien;

public class KhoaHoc {
   
    private String Mamon;
    private String MaLop;
    private String TenMon;

    public KhoaHoc() {
    }

    public KhoaHoc(String Mamon, String MaLop,  String TenMon) {
        this.Mamon = Mamon;
        this.MaLop = MaLop;
        this.TenMon = TenMon;
    }

    public String getMamon() {
        return Mamon;
    }

    public void setMamon(String Mamon) {
        this.Mamon = Mamon;
    }
    
    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }
}

