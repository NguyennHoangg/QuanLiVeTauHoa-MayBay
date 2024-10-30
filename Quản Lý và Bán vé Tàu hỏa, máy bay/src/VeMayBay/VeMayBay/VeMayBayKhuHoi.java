package VeMayBay.VeMayBay;

import java.time.LocalDate;

public class VeMayBayKhuHoi extends VeMaybay{
    private LocalDate ngayDi;
    private double giaTien;

    
    public VeMayBayKhuHoi(String maSoChuyenBay, String daDi, String gaDen, int soLuong, LocalDate ngayDi,
            double giaTien) {
        super(maSoChuyenBay, daDi, gaDen, soLuong);
        this.ngayDi = ngayDi;
        this.giaTien = giaTien;
    }


    @Override
    public double ThanhTien() {
        
    }

    

    
    
}
