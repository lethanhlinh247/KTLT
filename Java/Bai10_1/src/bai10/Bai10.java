/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Bai10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Dayso ds=new Dayso();
        System.out.println("1.Nhập dãy số \n2. Tìm Max \n3.Tính tổng \n4.Thoát");
        Scanner nhap=new Scanner(System.in);
        int k;
        while(true){
            System.out.println("Mời chọn: ");
            k=nhap.nextInt();
            switch(k){
                case 1: ds.Nhap(); 
                        ds.Nhap("c");
                        ds.Nhap("d","e");
                         break;
               
               
                case 2: System.out.println("Số int lớn nhất là: "+ds.Max(ds.n, ds.a));
                        System.out.println("Số float lớn nhất là: "+ds.Max(ds.n, ds.b));
                        System.out.println("Số double lớn nhất là: "+ds.Max(ds.n, ds.c));
                    break;
                case 3: System.out.println("Tổng int là: "+ds.Tong(ds.n, ds.a));
                        System.out.println("Tổng float là: "+ds.Tong(ds.n, ds.b));
                        System.out.println("Tổng double là: "+ds.Tong(ds.n, ds.c));
                    break;
                case 4: System.exit(0);
            }
        }
    }
    
}
