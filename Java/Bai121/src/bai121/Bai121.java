/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai121;

import java.util.Scanner;

/**
 *
 * @author song1
 */
public class Bai121 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Chon 1 de nhap va hien thi danh sach giao vien");
        System.out.println("Chon 2 de nhap va hien thi danh sach nhan vien");
        System.out.println("Chon 3 de thoat");
        int k;
        Scanner nhap = new Scanner(System.in);
        NhanVien NV = new NhanVien();
        GiaoVien GV = new GiaoVien();
        while(true){
            System.out.println("Nhap k: ");
            k = nhap.nextInt();
            switch(k){
                case 1: GV.show();
                    break;
                case 2: NV.show();
                    break;
                case 3: System.exit(0);
            }
        }
    }
    
}
