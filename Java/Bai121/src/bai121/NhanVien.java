/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai121;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author song1
 */
public class NhanVien extends Nguoi{
private String CongViec;

    public String getCongViec() {
        return CongViec;
    }

    public void setCongViec(String CongViec) {
        this.CongViec = CongViec;
    }

    public String getPhong() {
        return Phong;
    }

    public void setPhong(String Phong) {
        this.Phong = Phong;
    }
private String Phong;

@Override
public void show(){
    int n;
        Scanner nhap = new Scanner(System.in);
        ArrayList<NhanVien>NV = new ArrayList();
        System.out.println("Nhap n: ");
        n = nhap.nextInt();
        for(int i=0;i<n;i++){
            NhanVien a = new NhanVien();
            System.out.println("Nhap nhanvien thu "+i+" : ");
            nhap.nextLine();
            System.out.println("Ho ten:");
            a.setHoten(nhap.nextLine());
            System.out.println("Ngay sinh:");
            a.setNgaySinh(nhap.nextLine());
            System.out.println("Gioi tinh: ");
            a.setGioiTinh(nhap.nextLine());
            System.out.println("Cong viec: ");
            a.setCongViec(nhap.nextLine());
            System.out.println("Phong: ");
            a.setPhong(nhap.nextLine());
            NV.add(a);
        }
        System.out.println("Danh sach giao vien vua nhap la: ");
        for(int i =0;i<NV.size();i++)
        {
            System.out.printf("\nHo ten\t\tNgay sinh\t\tGioi tinh\t\tCong viec\t\tPhong\n" +NV.get(i).getHoten()+"\t\t"
                    +NV.get(i).getNgaySinh()+"\t\t"+NV.get(i).getGioiTinh()+"\t\t"+NV.get(i).getCongViec()+
                    "\t\t"+NV.get(i).getPhong());
        }
}    
        
}
