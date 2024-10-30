package KiemNghiem;


import VeTauHoa.VeTau.*;

import java.time.LocalDate;
import java.util.List;

import DinhNghia.*;
import QuanLi.*;

public class KiemNghiemVeTauHoa_MayBay {
    public static void main(String[] args) {
        VeTauMotChieu veTauMotChieu = new VeTauMotChieu("123", "Ha Noi", "Hai Phong", LoaiToaTau.TOA_NGOI, 2, LocalDate.now(), 100000);
        VeTauKhuHoi veTauKhuHoi = new VeTauKhuHoi("123", "Ha Noi", "Hai Phong", LoaiToaTau.TOA_NAM, 2, LocalDate.now(), LocalDate.now(), 200000);
        VeTauKhuHoi veTauKhuHoi2 = new VeTauKhuHoi("123", "Ha Noi", "Hai Phong", LoaiToaTau.TOA_NAM, 2, LocalDate.now(), LocalDate.now(), 200000);
        VeTauMotChieu veTauMotChieu2 = new VeTauMotChieu("124", "Ha Noi", "Hai Phong", LoaiToaTau.TOA_NGOI, 2, LocalDate.now(), 100000);
        VeTauKhuHoi veTauKhuHoi3 = new VeTauKhuHoi("123", "Ha Noi", "Hai Phong", LoaiToaTau.TOA_NAM, 2, LocalDate.now(), LocalDate.now(), 200000);
        VeTauMotChieu veTauMotChieu3 = new VeTauMotChieu("123", "Ha Noi", "Hai Phong", LoaiToaTau.TOA_NGOI, 2, LocalDate.now(), 100000);


        QuanLiVeTau quanLiVeTau = new QuanLiVeTau();
        quanLiVeTau.ThemVeVaoDanhSach(veTauMotChieu3);
        quanLiVeTau.ThemVeVaoDanhSach(veTauKhuHoi3);
        quanLiVeTau.ThemVeVaoDanhSach(veTauMotChieu2);
        quanLiVeTau.ThemVeVaoDanhSach(veTauKhuHoi2);
        quanLiVeTau.ThemVeVaoDanhSach(veTauMotChieu);
        quanLiVeTau.ThemVeVaoDanhSach(veTauKhuHoi);
        

        /* List<VeTau> veTau = quanLiVeTau.TimKiemVeTauTheoGaDen("Hai Phong");
        for(VeTau vt : veTau){
            System.out.println("__________________________________________________________");
            System.out.println(vt);
        } */
        //System.out.println("__________________________________________________________");
        if(quanLiVeTau.TimKiemTheoMaSoVe("124") != null){
            System.out.println("Tim duoc du lieu");
            System.out.println(quanLiVeTau.TimKiemTheoMaSoVe("124")); 
        }else{
            System.out.println("Khong tim duoc ve tau");
        }

        System.out.println("___________________________________________________");
        System.out.println("Ve Tau Sau khi sap xep");
        List<VeTau> ds2 = quanLiVeTau.SapXepVeTauTheoMaSoChuyen();
        for(VeTau vt : ds2){
            System.out.println(vt);
        }
    }
}
