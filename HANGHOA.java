import java.util.Scanner;

public class HANGHOA {
    protected String mahang;
    protected String tenhang;
    protected long dongia;

    public HANGHOA(String mahang,String tenhang, Long dongia){
        this.mahang= mahang;
        this.tenhang= tenhang;
        this.dongia =dongia;
    }


    public void thongTin() {
        System.out.println("Ma hang: " + mahang);
        System.out.println("Ten hang: " + tenhang);
        System.out.println("Gia: " + dongia);
    }
    //bỏ hàm này là ra 3a.
    public void nhap() {
        Scanner x= new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        this.mahang = x.nextLine();
        System.out.print("Nhap ten hang: ");
        this.tenhang = x.nextLine();
        System.out.print("Nhap don gia: ");
        this.dongia = x.nextLong();
    }
}
