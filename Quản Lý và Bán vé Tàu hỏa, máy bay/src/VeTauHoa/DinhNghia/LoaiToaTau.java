package VeTauHoa.DinhNghia;

public enum LoaiToaTau {
    TOA_NGOI("Toa Ngồi"),
    TOA_NAM("Toa Nằm"),
    TOA_NGOI_CO_DIEU_HOA("Toa ngồi có điều hòa");

    private final String loaiToa;

    private LoaiToaTau(String loaiToa) {
        this.loaiToa = loaiToa;
    }

    public String getLoaiToa() {
        return loaiToa;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    
}
