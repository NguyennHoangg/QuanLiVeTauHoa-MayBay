package DinhNghia;

public enum LoaiVe {

    MOT_CHIEU("1 Chiều"),
    KHU_HOI("Khứ Hồi");
    private final String loaiVe;

    private LoaiVe(String loaiVe) {
        this.loaiVe = loaiVe;
    }

    

    public String getLoaiVe() {
        return loaiVe;
    }



    @Override
    public String toString() {
        return super.toString();
    }


}
