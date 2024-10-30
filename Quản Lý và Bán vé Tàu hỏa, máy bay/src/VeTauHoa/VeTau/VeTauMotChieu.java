package VeTauHoa.VeTau;

import java.time.LocalDate;

import DinhNghia.LoaiToaTau;
import DinhNghia.LoaiVe;

public class VeTauMotChieu extends VeTau {
    private double giaTien;
    private LoaiVe loaiVe;

    /**
     * @param maSoChuyen mã số chuyến tàu
     * @param gaDi ga xuất phát
     * @param gaDen ga kết thúc
     * @param loaiVe loại vé: vé 1 chiều hoặc vé khứ hồi
     * @param loaiToa loại toa: toa ngồi, toa nằm hoặc toa ngồi có điều hòa
     * @param ngayDi ngày xuất phát
     * @param soLuong số lượng vé đặt mua
     */
    
    
    public VeTauMotChieu(String maSoChuyen, String gaDi, String gaDen, LoaiToaTau loaiToa, int soLuong,
            LocalDate ngayDi, double giaTien) {
        super(maSoChuyen, gaDi, gaDen, loaiToa, soLuong, ngayDi);
        this.giaTien = giaTien;
        this.loaiVe = LoaiVe.MOT_CHIEU;
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
        this.loaiVe = loaiVe.MOT_CHIEU;
    }


    

    @Override
    public double ThanhTien() {
        return soLuong * giaTien;
    }

    @Override
    public String toString() {
        return 
            "Loại vé: " + loaiVe.getLoaiVe() + "\n" +
            "Mã số vé: " + getMaSoChuyen() + "\n" +
            "Ga đi: " + getGaDi() + "\n" +
            "Ga đến: " + getGaDen() + "\n" +
            "Loại toa: " + getLoaiToa().getLoaiToa() + "\n" +
            "Số lượng: " + soLuong + "\n" +
            "Ngày đi: " + getNgayDi() + "\n" +
            "Thành tiền: " + ThanhTien();
}

    

}
