package VeTauHoa.QuanLi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import VeTauHoa.VeTau.*;

public class QuanLiVeTau {
    private List<VeTau> dsVetau;

    public QuanLiVeTau() {
        this.dsVetau = new ArrayList<>();
    }

    /**
     * Adds a train ticket to the list.
     *
     * @param vt the train ticket to be added
     * @throws IllegalArgumentException if the ticket already exists in the list
     *                                  or if the ticket's trip code is null or empty
     */


    public void ThemVeVaoDanhSach(VeTau vt) {
        if (dsVetau.contains(vt)) {
            throw new IllegalArgumentException("Trung ma so chuyen");
        }

        if (vt.getMaSoChuyen() == null || vt.getMaSoChuyen().trim().length() <= 0) {
            throw new IllegalArgumentException("Ma So Chuyen Khong The De Trong");
        }

        dsVetau.add(vt);
    }


    /*
     * Tìm kiếm vé tàu theo mã số chuyến
     */

    public VeTau TimKiemTheoMaSoVe(String maSoChuyen){
        return dsVetau.stream()
        .filter(vt -> vt.getMaSoChuyen().equalsIgnoreCase(maSoChuyen))
        .findFirst()
        .orElse(null);
    }

    /*
     * Tìm Kiếm vé tauf theo ga đến
     */

     public List<VeTau> TimKiemVeTauTheoGaDen(String gaden){
        return dsVetau.stream()
                .filter(vt -> vt.getGaDen().equalsIgnoreCase(gaden))
                .toList();
     }


     /*
      * Timf kiếm vé tàu theo ngày đi
      */

      public List<VeTau> TimKiemVeTauTheoNgayDi(LocalDate ngayDi){
        
        return dsVetau.stream()
                .filter(vt ->vt.getNgayDi().isEqual(ngayDi))
                .toList();
      }

    /*
     * Sắp xếp vé tàu theo mã số chuyến
     */

     public List<VeTau> SapXepVeTauTheoMaSoChuyen(){
        dsVetau.sort(Comparator.comparing(VeTau::getMaSoChuyen));
        return dsVetau;
     }

     /*
      * cập nhật vé tàu khi biết mã số chuyến
      */

      public Boolean CapNhatChuyenTau1Chieu(String maSoChuyen, VeTau vtt){
            VeTau temp = dsVetau.stream()
                    .filter(vt -> vt.getMaSoChuyen().equalsIgnoreCase(maSoChuyen))
                    .findFirst()
                    .orElse(null);

                    if(temp != null){
                        temp.setGaDi(vtt.getGaDi());
                        temp.setGaDen(vtt.getGaDen());
                        temp.setNgayDi(vtt.getNgayDi());
                        return true;
                    }
                    return false;
      }

      /*
       * Cap Nhat ve tau khu hoi khi biet ma so chuyen
       */

       public Boolean CapNhatChuyenTauKhuHoi(String maSoChuyen, VeTauKhuHoi vtt){
        VeTau temp = dsVetau.stream()
                .filter(vt -> vt.getMaSoChuyen().equalsIgnoreCase(maSoChuyen))
                .filter(vt -> vt instanceof VeTauKhuHoi)
                .findFirst()
                .orElse(null);

                if(temp != null){
                    temp.setGaDi(vtt.getGaDi());
                    temp.setGaDen(vtt.getGaDen());
                    temp.setNgayDi(vtt.getNgayDi());
                    ((VeTauKhuHoi)temp).setNgayVe(vtt.getNgayVe());
                    return true;
                }
                return false;
            }


    /*
     * Xoa Ve Tau
     */

     public Boolean XoaVeTau(String maSoChuyen){
        return dsVetau.removeIf(vt ->vt.getMaSoChuyen().equalsIgnoreCase(maSoChuyen));
     }
}
