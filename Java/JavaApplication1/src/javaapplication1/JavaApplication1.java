package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {
    public static class SinhVien {
        private String mssv;
        private String hoten;
        private String lop;
        private String quequan;
        public void setMSSV(String mssv) {
            this.mssv=mssv;
        }
        public void setHoTen(String hoten) {
            this.hoten=hoten;
        }
        public void setLop(String lop) {
            this.lop=lop;
        }
        public void setQueQuan(String quequan) {
            this.quequan=quequan;
        }
        public String getMSSV() {
            return mssv;
        }
        public String getHoTen() {
            return hoten;
        }
        public String getLop() {
            return lop;
        }
        public String getQueQuan() {
            return quequan;
        }
    }
    public static SinhVien[] nhapDSSV(SinhVien[] dssv) {
        Scanner input = new Scanner(System.in);
        for (int i=0;i<dssv.length;i++) {
            dssv[i] = new SinhVien();
            System.out.println("Nhập mã số sinh viên "+(i+1));
            dssv[i].setMSSV(input.nextLine());
            System.out.println("Nhập tên sinh viên "+(i+1));
            dssv[i].setHoTen(input.nextLine());
            System.out.println("Nhập lớp sinh viên "+(i+1));
            dssv[i].setLop(input.nextLine());
            System.out.println("Nhập quê quán sinh viên "+(i+1));
            dssv[i].setQueQuan(input.nextLine());
        }
        return dssv;
    }
    public static void hienthiDSSV(SinhVien[] dssv) {
        System.out.println("STT\tMSSV\tHọ tên\tLớp\tQuê quán");
        for (int i=0;i<dssv.length;i++) 
            System.out.println((i+1)+"\t"+dssv[i].getMSSV()+"\t"+dssv[i].getHoTen()+"\t"+dssv[i].getLop()+"\t"+dssv[i].getQueQuan());
    }
    public static void timSV(SinhVien [] dssv, String ten) {
        int kt=0;
        for (int i=0;i<dssv.length;i++)
            if (ten.equals(dssv[i].hoten)) 
                kt=1;
        if (kt==0)
            System.out.println("Tên bạn nhập không có trong danh sách sinh viên");   
        else if (kt==1) {
            System.out.println("STT\tMSSV\tHọ tên\tLớp\tQuê quán");
            for (int i=0;i<dssv.length;i++)
                if (ten.equals(dssv[i].hoten)) 
                    System.out.println((i+1)+"\t"+dssv[i].getMSSV()+"\t"+dssv[i].getHoTen()+"\t"+dssv[i].getLop()+"\t"+dssv[i].getQueQuan());
        }
    }
    public static void main(String[] args) {
        SinhVien[] dssv = new SinhVien[1];
        int check=0;
        Scanner input = new Scanner(System.in);
        do 
        {
            System.out.println("Mời lựa chọn");
            int chon = Integer.parseInt(input.nextLine());
            switch (chon) {
                case 1:
                    System.out.println("Nhập số sinh viên: ");
                    int n=Integer.parseInt(input.nextLine());
                    dssv = new SinhVien[n];
                    nhapDSSV(dssv);
                    check=1;
                    break;
                case 2:
                    if (check==1)
                        hienthiDSSV(dssv);
                    else 
                        System.out.println("Bạn chưa nhập danh sách sinh viên");
                    break;
                case 3:
                    if (check==1) {
                        System.out.println("Nhập tên cần tìm: ");
                        String ten = input.nextLine();
                        timSV(dssv,ten);
                    }
                    else 
                        System.out.println("Bạn chưa nhập danh sách sinh viên");
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Bạn nhập sai lựa chọn, vui lòng nhập lại");
            }
        }
        while (true);
    }
}
