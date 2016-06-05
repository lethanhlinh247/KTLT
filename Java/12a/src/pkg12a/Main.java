package pkg12a;

import java.util.Scanner;

public class Main {
    
    public static void nhapDSGV(int n,GiaoVien[] gv) {
        Scanner input = new Scanner(System.in);
        for (int i=0;i<n;i++){
            gv[i] = new GiaoVien();
            System.out.println("Nhap ten Giao Vien"+(i+1));
            gv[i].setHoten(input.nextLine());
            System.out.println("Nhap ngay sinh"+(i+1));
            gv[i].setNgaysinh(input.nextLine());
            System.out.println("Nhap gioi tinh"+(i+1));
            gv[i].setGioitinh(input.nextLine());
            System.out.println("Nhap chuyen nganh"+(i+1));
            gv[i].setChuyennganh(input.nextLine());
        }
    }
    public static void xuatDSGV(int n, GiaoVien[] gv) {
        System.out.println("HoTen\tNgaySinh\tGioiTinh\tChuyenNganh");
        for (int i=0;i<n;i++) {
            System.out.println(gv[i].getHoten()+"\t"+gv[i].getNgaysinh()+"\t"+gv[i].getGioitinh()+"\t"+gv[i].getChuyennganh());
        }
    }
    public static void nhapDSNV (int n, NhanVien[] nv) {
        Scanner input = new Scanner(System.in);
        for (int i=0;i<n;i++) {
            nv[i] = new NhanVien();
            System.out.println("Nhap ten nhan vien"+(i+1));
            nv[i].setHoten(input.nextLine());
            System.out.println("Nhap ngay sinh"+(i+1));
            nv[i].setNgaysinh(input.nextLine());
            System.out.println("Nhap gioi tinh"+(i+1));
            nv[i].setGioitinh(input.nextLine());
            System.out.println("Nhap phong"+(i+1));
            nv[i].setPhong(input.nextLine());
            System.out.println("Nhap cong viec"+(i+1));
            nv[i].setCongviec(input.nextLine());
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choose;
        do {
            System.out.println("Nhap lua chon: ");
            choose=input.nextInt();
            switch (choose) {
                case 1:
                    int n;
                    System.out.println("Nhap So Giao Vien");
                    n = input.nextInt();
                    GiaoVien[] gv = new GiaoVien[n];
                    nhapDSGV (n,gv);
                    xuatDSGV (n,gv);
                    break;   
                case 2:
                case 3: System.exit(0);
                default:
                    System.out.println("Ban Nhap Sai Lua Chon");;
            }
        }
        while (true);
    }
    
}
