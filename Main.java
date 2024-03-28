import java.time.LocalDate;
import java.util.Scanner;
import java.lang.String;
//
////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
////        Scanner x = new Scanner(System.in);
////        System.out.println("Nhap thong tin mat hang dien may:");
////        System.out.print("Nhap ma hang: ");
////        String mahang = x.nextLine();
////        System.out.print("Nhap ten hang: ");
////        String tenhang = x.nextLine();
////        System.out.print("Nhap gia: ");
////        Long dongia = x.nextLong();
////        System.out.print("Nhap thoi gian bao hanh: ");
////        int baohanh = x.nextInt();
////        System.out.print("Nhap dien ap: ");
////        int dienap = x.nextInt();
////        System.out.print("Nhap cong suat: ");
////        int congsuat = x.nextInt();
////        HANGDIENMAY dm = new HANGDIENMAY(mahang, tenhang, dongia, baohanh, dienap, congsuat);
//        HANGDIENMAY dm = new HANGDIENMAY("DM01", "Phone", 15000000, 12, 220, 200);
//        System.out.println("Thong tin mat hang dien may:");
//        dm.thongTin();
//        System.out.print("\n");
//        HANGTP tp = new HANGTP("TP02", "Sua chua", 20000, LocalDate.of(2024,2,20), LocalDate.of(2024, 7, 20));
//        System.out.println("Thong tin mat hang thuc pham:");
//        tp.thongTin();
//
////        System.out.println("Nhap thong tin mat hang thuc pham:");
////        System.out.print("Nhap ma hang: ");
////        String mahangTP = x.nextLine();
////        System.out.print("Nhap ten hang: ");
////        String tenhangTP = x.nextLine();
////        System.out.print("Nhap gia: ");
////        long dongiaTP = x.nextLong();
////        System.out.print("Nhap ngay san xuat (YYYY-MM-DD): ");
////        String ngaySXTP = x.nextLine();
////        LocalDate ngaySX = LocalDate.parse(ngaySXTP);
////        System.out.print("Nhap ngay het han (YYYY-MM-DD): ");
////        String ngayHHTP = x.nextLine();
////        LocalDate ngayHH = LocalDate.parse(ngayHHTP);
////        HANGTP tp = new HANGTP(mahangTP, tenhangTP, dongiaTP, ngaySX, ngayHH);
////        System.out.println("\nThong tin mat hang dien may:");
////        dm.thongTin();
////        System.out.println("\nThong tin mat hang thuc pham:");
////        tp.thongTin();
//    }
//}
        byte chon, loai;
        Scanner doc = new Scanner(System.in);
        DSHANGHOA dshh = new DSHANGHOA();
        HANGHOA h;
        do {
            System.out.println("1.Them mot mat hang vao danh sach");
            System.out.println("2.Xuat mat hang theo loai");
            System.out.println("0.Thoat");
            System.out.print("Chon chuc nang: ");
            chon=doc.nextByte();
            switch (chon){
                case 1:
                    System.out.println("1.Hang dien may, 2. Hang thuc pham. Hay chon loai mat hang:");
                    loai=doc.nextByte();
                    if(loai == 1)
                        h = new HANGDIENMAY();
                    else
                        h = new HANGTP();
                    h.nhap();
                    dshh.themMH(h);
                    break;
                case 2:
                    System.out.println("Xuat danh sach theo mat hang nao (DM/TP):");
                    byte loaimh=doc.nextByte();
                    dshh.xuatDSTheoLoai(loaimh);
                    break;
                default: chon=0;
                    break;
            }
        }
        while (chon !=0);
    }
}