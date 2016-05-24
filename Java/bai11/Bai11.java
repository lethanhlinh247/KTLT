package bai11;
import java.util.Scanner;
public class Bai11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("1. Chon 1 de thao tac voi hinh chu nhat");
            System.out.println("2. Chon 2 de thao tac voi hinh vuong");
            System.out.println("3. Chon 3 de ket thuc");
            System.out.println("Nhap di ban oi");
            int choose = input.nextInt();
            switch (choose) {
                case 1: {
                    hinhchunhat a = new hinhchunhat();
                    System.out.println("Nhap chieu dai: ");
                    a.setDai(input.nextFloat());
                    System.out.println("Nhap chieu rong: ");
                    a.setRong(input.nextFloat());
                    System.out.println("Chu vi la: "+a.tinhChuVi());
                    System.out.println("Dien tich la: "+a.tinhDienTich());
                    a.Ve();
                    break;
                }   
                case 2:{
                    hinhvuong b = new hinhvuong();
                    System.out.println("Nhap can hhinh vuong: ");
                    b.setDai(input.nextFloat());
                    System.out.println("Chu vi la: "+b.tinhChuVi());
                    System.out.println("Dien tich la: "+b.tinhDienTich());
                    b.Ve();
                }
                case 3: System.exit(0);
                default:
                    System.out.println("Nhap sai roi cung");
            }
        }
        while (true);
    }
    
}
