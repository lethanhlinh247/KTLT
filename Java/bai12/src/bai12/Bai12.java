
package bai12;

import java.util.Scanner;

public class Bai12 {
    
    public static void nhap(int n,GiaoVien[] gv){
        Scanner input = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            gv[i]=new GiaoVien();
            System.out.println("Nhap Ten Giao Vien "+(i+1));
            gv[i].setHoTen(input.nextLine());
            System.out.println("Nhap Ngay Sinh Giao Vien"+(i+1));
            gv[i].setNgaySinh(input.nextLine());
            System.out.println("Nhap Gioi tinh Giao Vien"+(i+1));
            gv[i].setGioiTinh(input.nextLine());
            System.out.println("Nhap Chuyen nganh Giao Vien"+(i+1));
            gv[i].setChuyenNganh(input.nextLine());
        }
    }
    public static void nhap(int n,NhanVien[] nv){
        Scanner input = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            nv[i]=new NhanVien();
            System.out.println("Nhap Ten Nhan Vien "+(i+1));
            nv[i].setHoTen(input.nextLine());
            System.out.println("Nhap Ngay Sinh Nhan Vien"+(i+1));
            nv[i].setNgaySinh(input.nextLine());
            System.out.println("Nhap Gioi tinh Nhan Vien"+(i+1));
            nv[i].setGioiTinh(input.nextLine());
            System.out.println("Nhap Cong viec Nhan Vien"+(i+1));
            nv[i].setCongViec(input.nextLine());
            System.out.println("Nhap Phong nhan vien"+(i+1));
            nv[i].setPhong(input.nextLine());
        }
    }
    public static void hienthi(int n,GiaoVien[] gv) {
        System.out.println("STT\tTen\tNgayssinh\tgioitinh\tchuyennganh");
        for (int i=0;i<n;i++){
            System.out.println((i+1)+"\t"+gv[i].getHoTen()+"\t"+gv[i].getNgaySinh()+"\t"+gv[i].getGioiTinh()+"\t"+gv[i].getChuyenNganh());
        }
    }
    public static void hienthi(int n,NhanVien[] nv) {
        System.out.println("STT\tTen\tNgayssinh\tgioitinh\tcongivec\tphong");
        for (int i=0;i<n;i++){
            System.out.println((i+1)+"\t"+nv[i].getHoTen()+"\t"+nv[i].getNgaySinh()+"\t"+nv[i].getGioiTinh()+"\t"+nv[i].getCongViec()+"\t"+nv[i].getPhong());
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            int choose=input.nextInt();
            switch (choose) {
                case 1:{
                    System.out.println("Nhap so giao vien: ");
                    int n = input.nextInt();
                    GiaoVien[] gv = new GiaoVien[n];
                    nhap(n,gv);
                    //System.out.println(gv[0].getHoTen());
                    hienthi(n,gv);
                    break;
                }
                case 2: {
                    System.out.println("Nhap so nhan vien: ");
                    int n1 = input.nextInt();
                    NhanVien[] nv = new NhanVien[n1];
                    nhap(n1,nv);
                    //System.out.println(nv[0].getHoTen());
                    hienthi(n1,nv);
                    break;
                }
                case 3: System.exit(0);
                default:
                    System.out.println("Nhap sai roi cung, nhap lai di");
            }
        }
        while(true);
    }
    
}
