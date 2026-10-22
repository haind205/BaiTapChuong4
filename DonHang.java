public class DonHang {
    private String tenKhach;
    private SanPham sanPham;
    private int soLuong;

    public DonHang(String tenKhach, SanPham sanPham, int soLuong) {
        this.tenKhach = tenKhach;
        this.sanPham = sanPham;
        this.soLuong = (soLuong < 1) ? 1 : soLuong;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public double tinhThanhTien() {
        double thanhTien = sanPham.getDonGia() * soLuong;
        if (soLuong >= 5) {
            thanhTien *= 0.9; // giảm 10% nếu mua từ 5 sản phẩm trở lên
        }
        return thanhTien;
    }

    public void inDonHang() {
        System.out.printf("%-10s %-20s %4d %,.0f", tenKhach,
                sanPham.getTenSP(), soLuong, tinhThanhTien());
        if (soLuong >= 5) {
            System.out.print(" (đã giảm 10%)");
        }
        System.out.println();
    }
}