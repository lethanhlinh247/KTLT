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
public class GiaoVien extends Nguoi{
    private String ChuyenNganh;

    public String getChuyenNganh() {
        return ChuyenNganh;
    }

    public void setChuyenNganh(String ChuyenNganh) {
        this.ChuyenNganh = ChuyenNganh;
    }

    /**
     *
     */
    @Override
    public void show(){
        int n;
        Scanner nhap = new Scanner(System.in);
        ArrayList<GiaoVien>GV = new ArrayList();
        System.out.println("Nhap n: ");
        n = nhap.nextInt();
        for(int i=0;i<n;i++){
            GiaoVien a = new GiaoVien();
            System.out.println("Nhap giao vien thu "+i+" : ");
            nhap.nextLine();
            System.out.println("Ho ten:");
            a.setHoten(nhap.nextLine());
            System.out.println("Ngay sinh:");
            a.setNgaySinh(nhap.nextLine());
            System.out.println("Gioi tinh: ");
            a.setGioiTinh(nhap.nextLine());
            System.out.println("Chuyen nganh: ");
            a.setChuyenNganh(nhap.nextLine());
            GV.add(a);
        }
        System.out.println("Danh sach giao vien vua nhap la: ");
        for(int i =0;i<GV.size();i++)
        {
            System.out.printf("\nHo ten\t\tNgay sinh\t\tGioi tinh\t\tChuyen nganh\n" +GV.get(i).getHoten()+"\t\t"
                    +GV.get(i).getNgaySinh()+"\t\t"+GV.get(i).getGioiTinh()+"\t\t"+GV.get(i).getChuyenNganh());
        }}
}
