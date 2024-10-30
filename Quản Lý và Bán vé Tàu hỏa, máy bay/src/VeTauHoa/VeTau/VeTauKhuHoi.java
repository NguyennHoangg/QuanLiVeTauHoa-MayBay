package VeTauHoa.VeTau;
import java.time.LocalDate;

import VeTauHoa.DinhNghia.*;


public class VeTauKhuHoi extends VeTau{
    private LocalDate ngayVe;
    private double giaTien;
    private LoaiVe loaiVe;



    public VeTauKhuHoi(String maSoChuyen, String gaDi, String gaDen, LoaiToaTau loaiToa, int soLuong,
            LocalDate ngayDi, LocalDate ngayVe, double giaTien) {
        super(maSoChuyen, gaDi, gaDen, loaiToa, soLuong, ngayDi);
        this.ngayVe = ngayVe;
        this.giaTien = giaTien;
        this.loaiVe = LoaiVe.KHU_HOI;
    }



    public LocalDate getNgayVe() {
        return ngayVe;
    }


    public void setNgayVe(LocalDate ngayVe) {
        this.ngayVe = ngayVe;
    }


    public double getGiaTien() {
        return giaTien;
    }


    public void setGiaTien(double giaTien) {
        this.giaTien = giaTien;
    }

    public LoaiVe getLoaiVe() {
        return loaiVe;
    }



    public void setLoaiVe(LoaiVe loaiVe) {
        this.loaiVe = loaiVe.KHU_HOI;
    }

    


    @Override
    public double ThanhTien() {
        return soLuong * giaTien;
    }

    @Override
    public String toString() {
        return "__________________________________________________________\n" +
            "Loại vé: " + loaiVe.getLoaiVe() + "\n" +
            "Mã số vé: " + getMaSoChuyen() + "\n" +
            "Ga đi: " + getGaDi() + "\n" +
            "Ga đến: " + getGaDen() + "\n" +
            "Loại toa: " + getLoaiToa().getLoaiToa() + "\n" +
            "Số lượng: " + soLuong + "\n" +
            "Ngày đi: " + getNgayDi() + "\n" +
            "Ngày về: " + ngayVe + "\n" +
            "Thành tiền: " + ThanhTien();
}
}
