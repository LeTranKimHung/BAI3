import java.util.ArrayList;
import java.util.List;

//import java.time.LocalDate;
//import java.util.Scanner;
//
public class DSHANGHOA {
    //    private int sl;
//    private HANGHOA[] dsHANGHOA;
//
//    public DSHANGHOA(){
//        this.sl=0;
//        this.dsHANGHOA = new HANGHOA[100];
//    }
//    public void themMH(HANGHOA h){
//        dsHANGHOA[sl] = h;
//        sl++;
//    }
//
//    public void xuatDSTheoLoai(byte loai){
//        if(loai==1){
//            System.out.println("Danh sach hang dien may:");
//            for(int i=0;i<sl;i++){
//                if(dsHANGHOA[i] instanceof HANGDIENMAY){
//                    dsHANGHOA[i].thongTin();
//                    System.out.println();
//                }
//            }
//        } else if (loai == 2) {
//            System.out.println("Danh sach mat hang thuc pham:");
//            for(int i=0; i<sl;i++){
//                if(dsHANGHOA[i] instanceof HANGTP){
//                    dsHANGHOA[i].thongTin();
//                    System.out.println();
//                }
//            }
//        }else{
//            System.out.println("Loai hang khong dung");
//        }
//    }
    private List<HANGHOA> danhsachHH;

    public DSHANGHOA() {
        this.danhsachHH = new ArrayList<>();
    }

    public void themMH(HANGHOA h) {
        danhsachHH.add(h);
    }

    public void xuatDSTheoLoai(byte loai) {
        if (loai == 1) {
            System.out.println("Danh sach hang dien may:");
            for (HANGHOA hanghoa : danhsachHH) {
                if (hanghoa instanceof HANGDIENMAY) {
                    hanghoa.thongTin();
                    System.out.println();
                }
            }
        } else if (loai == 2) {
            System.out.println("Danh sach mat hang thuc pham:");
            for (HANGHOA hanghoa : danhsachHH) {
                if (hanghoa instanceof HANGTP) {
                    hanghoa.thongTin();
                    System.out.println();
                }
            }
        } else {
            System.out.println("Loai hang khong dung");
        }
    }
}