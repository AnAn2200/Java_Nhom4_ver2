
package GiaoVien;

public class KhoaHoc {
    private String MaLop;
    private String MaMon;
    private String TenMon;
    private int SoSinhVien;

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String MaLop) {
        this.MaLop = MaLop;
    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String MaMon) {
        this.MaMon = MaMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String TenMon) {
        this.TenMon = TenMon;
    }

    public int getSoSinhVien() {
        return SoSinhVien;
    }

    public void setSoSinhVien(int SoSinhVien) {
        this.SoSinhVien = SoSinhVien;
    }

    public KhoaHoc(String MaLop, String MaMon, String TenMon, int SoSinhVien) {
        this.MaLop = MaLop;
        this.MaMon = MaMon;
        this.TenMon = TenMon;
        this.SoSinhVien = SoSinhVien;
    }

    public KhoaHoc() {
    }
    
    
}
