public class SanPham {
    private String maSP;
    private String tenSP;
    private double donGia;
    private int soLuongTon;

    public SanPham() {
        this("", "", 0, 0);
    }

    public SanPham(String maSP, String tenSP) {
        this(maSP, tenSP, 0, 0);
    }

    public SanPham(String maSP, String tenSP, double donGia, int soLuongTon) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuongTon = soLuongTon;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        if (donGia >= 0) {
            this.donGia = donGia;
        } else {
            System.out.println("Đơn giá không được âm.");
        }
    }

    public int getSoLuongTon() {
        return soLuongTon;
    }

    public void setSoLuongTon(int soLuongTon) {
        if (soLuongTon >= 0) {
            this.soLuongTon = soLuongTon;
        } else {
            System.out.println("Số lượng tồn không được âm.");
        }
    }

    public void hienThi() {
        System.out.printf("%s %s %,.0f tồn %d%n", maSP, tenSP, donGia, soLuongTon);
    }
}