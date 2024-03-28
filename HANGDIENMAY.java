import java.lang.reflect.Constructor;
import java.util.Scanner;

public class HANGDIENMAY extends HANGHOA {
    private int baohanh;
    private int dienap;
    private int congsuat;

    public HANGDIENMAY() {
        super("", "", 0L);
        this.baohanh = 0;
        this.dienap = 0;
        this.congsuat = 0;
    }


    public HANGDIENMAY(String mahang, String tenhang, long dongia, int baohanh, int dienap, int congsuat){
        super(mahang, tenhang, dongia);
        this.baohanh=baohanh;
        this.dienap=dienap;
        this.congsuat=congsuat;
    }
    public void thongTin(){
        super.thongTin();
        System.out.println("Thoi gian bao hanh: " + baohanh);
        System.out.println("Dien ap: " + dienap);
        System.out.println("Cong suat: " + congsuat);
    }
    //bỏ hàm nhap là ra 3a.
    public void nhap() {
        super.nhap();
        Scanner x = new Scanner(System.in);
        System.out.print("Nhap thoi gian bao hanh: ");
        this.baohanh = x.nextInt();
        System.out.print("Nhap dien ap: ");
        this.dienap = x.nextInt();
        System.out.print("Nhap cong suat: ");
        this.congsuat = x.nextInt();
    }
}
