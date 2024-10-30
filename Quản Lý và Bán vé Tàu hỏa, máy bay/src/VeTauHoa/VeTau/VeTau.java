package VeTauHoa.VeTau;


import java.time.LocalDate;

import VeTauHoa.DinhNghia.*;


public abstract class VeTau {
    private final String maSoChuyen;
    private String gaDi;
    private String gaDen;
    private LoaiToaTau loaiToa;
    protected int soLuong;
    private LocalDate ngayDi;

    

    public VeTau(String maSoChuyen, String gaDi, String gaDen, LoaiToaTau loaiToa, int soLuong,
            LocalDate ngayDi) {
        this.maSoChuyen = maSoChuyen;
        this.gaDi = gaDi;
        this.gaDen = gaDen;
        this.loaiToa = loaiToa;
        this.soLuong = soLuong;
        this.ngayDi = ngayDi;
    }


    public String getMaSoChuyen() {
        return maSoChuyen;
    }


    public String getGaDi() {
        return gaDi;
    }


    public void setGaDi(String gaDi) {
        this.gaDi = gaDi;
    }


    public String getGaDen() {
        return gaDen;
    }


    public void setGaDen(String gaDen) {
        this.gaDen = gaDen;
    }

    public int getSoLuong() {
        return soLuong;
    }


    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }



    public LoaiToaTau getLoaiToa() {
        return loaiToa;
    }


    public void setLoaiToa(LoaiToaTau loaiToa) {
        this.loaiToa = loaiToa;
    }

    public LocalDate getNgayDi() {
        return ngayDi;
    }


    public void setNgayDi(LocalDate ngayDi) {
        this.ngayDi = ngayDi;
    }



    public abstract double ThanhTien();

    @Override
    public String toString() {
        return "Mã số vé: " + maSoChuyen + "\n" +
            "Ga đi: " + gaDi + "\n" +
            "Ga đến: " + gaDen + "\n" +
            "Loại toa: " + loaiToa + "\n" +
            "Số lượng: " + soLuong + "\n" +
            "Ngày đi: " + ngayDi + "\n" +
            "Thành tiền: " + ThanhTien();
}

   
    
}
