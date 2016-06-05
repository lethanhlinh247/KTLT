/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai9;
import static java.lang.Math.*;
import java.util.Scanner;
public class Bai9 {
    static int n;
    static void nhap(){
        System.out.println("Nhap n: ");
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        //System.out.println((int)(sqrt(n)));
    }
    static int ktnt(int x){
        int kt=0;
        for (int i=2;i<=((int)sqrt(x));i++) {
            if ((x % i)==0)
                kt=1;
        }
        return kt;
    }
    static void ngtfor(int n){
        for (int i=2;i<n;i++)
            if (ktnt(i)==0)
                System.out.println("\t"+i);
    }
    static int ngtdequy(int n){
        int tong = 0; // thực ra cái khởi tạo = 0 hình như là ko cần 
        if( n==2 )
            tong = 2;
        else if( ktnt(n)==1 ) 
            tong = ngtdequy(n-1);
        else if( ktnt(n)==0 ) 
            tong = n + ngtdequy(n-1);
        return tong;
    }
    public static void main(String[] args) {
        //int n;
        Scanner input = new Scanner(System.in);
        do {
            int choose = input.nextInt();
            switch (choose) {
                case 1: nhap();
                    
                    break;
                case 2: ngtfor(n);
                    
                    break;
                case 3: System.out.println(ngtdequy(n));
                    
                    break;
                case 4: System.exit(0);
                    
                    break;
                default:
                    System.out.println("Bạn nhập sai lựa chọn");
            }
        }
        while (true);
    }
    
}
