package VeMayBay.VeMayBay;



/**
 * The VeMaybay class represents an abstract ticket for an airplane flight.
 * It contains information about the flight and the type of ticket.
 */
public abstract class VeMaybay {
    private final String maSoChuyenBay;
    private String gaDi;
    private String gaDen;
    private int soLuong;


    public VeMaybay(String maSoChuyenBay, String daDi, String gaDen, int soLuong) {
        this.maSoChuyenBay = maSoChuyenBay;
        this.gaDi = daDi;
        this.gaDen = gaDen;
        this.soLuong = soLuong;


    }
    public String getMaSoChuyenBay() {
        return maSoChuyenBay;
    }
    public String getDaDi() {
        return gaDi;
    }
    public void setDaDi(String daDi) {
        this.gaDi = daDi;
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

    public abstract double ThanhTien();


    @Override
    public String toString() {
        return "Mã số vé: " + maSoChuyenBay + "\n" +
            "Ga đi: " + gaDi + "\n" +
            "Ga đến: " + gaDen + "\n" +
            "Số lượng: " + soLuong + "\n" +
            "Thành tiền: " + ThanhTien();
}


    
}
