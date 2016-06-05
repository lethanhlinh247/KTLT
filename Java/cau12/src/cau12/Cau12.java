/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cau12;

import java.util.Scanner;
public class Cau12 {
    public static void main(String[] args) {
        // TODO code application logic here
        int chon;
        Scanner input = new Scanner(System.in);
        System.out.println("Moi lua chon: ");
        chon = Integer.parseInt(input.nextLine());
        switch(chon)
        {
            case 1:
                System.out.println("Nhap so giao vien: ");
                int n;
                n = Integer.parseInt(input.nextLine());
                GiaoVien ds[] = new GiaoVien[n];
                for (int i=0;i<ds.length;i++) {
                    ds[i]=new GiaoVien();
                    System.out.println("Nhap Ten giao vien "+ (i+1));
                    ds[i].setHoTen(input.nextLine());
                    System.out.println("Nhap ngay sinh giao vien "+ (i+1));
                    ds[i].setNgaySinh(input.nextLine());
                    System.out.println("Nhap gioi tinh giao vien "+ (i+1));
                    ds[i].setGioiTinh(input.nextLine());
                    System.out.println("Nhap chuyen nganh giao vien "+ (i+1));
                    ds[i].setChuyenNganh(input.nextLine());
                }
                for (int i=0;i<ds.length;i++) {
                    System.out.println("SoTT \t Ten \t Ngay sinh \t Gioi Tinh \t Chuyen nganh");
                    System.out.println((i+1)+"\t"+ds[i].getHoTen()+"\t"+ds[i].getNgaySinh()+"\t"+ds[i].getGioiTinh()+"\t"+ds[i].getChuyenNganh());
                }
                break;
            case 2:
                System.out.println("Nhap so nhan vien: ");
                //int n;
                n = Integer.parseInt(input.nextLine());
                NhanVien dsnv[] = new NhanVien[n];
                for (int i=0;i<dsnv.length;i++) {
                    dsnv[i]=new NhanVien();
                    System.out.println("Nhap Ten nhan vien "+ (i+1));
                    dsnv[i].setHoTen(input.nextLine());
                    System.out.println("Nhap ngay sinh nhan vien "+ (i+1));
                    dsnv[i].setNgaySinh(input.nextLine());
                    System.out.println("Nhap gioi tinh nhan vien "+ (i+1));
                    dsnv[i].setGioiTinh(input.nextLine());
                    System.out.println("Nhap cong viec nhan vien "+ (i+1));
                    dsnv[i].setCongViec(input.nextLine());
                    System.out.println("Nhap phong nhan vien "+ (i+1));
                    dsnv[i].setPhong(input.nextLine());

                    
                }
                for (int i=0;i<dsnv.length;i++) {
                    System.out.println("SoTT \t Ten \t Ngay sinh \t Gioi Tinh \t Chuyen nganh \t Phong");
                    System.out.println((i+1)+"\t"+dsnv[i].getHoTen()+"\t"+dsnv[i].getNgaySinh()+"\t"+dsnv[i].getGioiTinh()+"\t"+dsnv[i].getCongViec()+"\t"+dsnv[i].getPhong());
                }
                break;
            case 3:
                break;
            default: break;
        }
        
    }
    
}
