import java.time.LocalDate;
import java.util.Scanner;

public class HANGTP extends HANGHOA {
    protected LocalDate ngaySX;
    protected LocalDate ngayHH;
    public HANGTP() {
        super("", "",0L);
        this.ngaySX = LocalDate.now();
        this.ngayHH = LocalDate.now();
    }

    public HANGTP(String mahang, String tenhang, long dongia, LocalDate ngaySX, LocalDate ngayHH) {
        super(mahang,tenhang,dongia);
        this.ngaySX= ngaySX;
        this.ngayHH= ngayHH;
    }
    public void thongTin() {
        super.thongTin();
        System.out.println("Ngay san xuat: " + ngaySX);
        System.out.println("Ngay het han: " + ngayHH);
    }
    public void nhap() {
        super.nhap();
        Scanner x= new Scanner(System.in);
        System.out.print("Nhap ngay san xuat (yyyy-MM-dd): ");
        String ngaySXString = x.nextLine();
        this.ngaySX = LocalDate.parse(ngaySXString);
        System.out.print("Nhap ngay het han (yyyy-MM-dd): ");
        String ngayHHString = x.nextLine();
        this.ngayHH = LocalDate.parse(ngayHHString);
    }
}
