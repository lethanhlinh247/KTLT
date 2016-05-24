package bai8;
import java.util.Scanner;
public class Bai8 {
    static class sinhvien{
        String ten;
        String diachi;
        String sdt;
    }
    static Scanner input = new Scanner (System.in);
    static int n;
    static sinhvien[] sv = new sinhvien[1];
    static void nhap(){
        System.out.println("Nhap so sinh vien: ");
        n = input.nextInt();
        sv = new sinhvien[n];
        Scanner input2=new Scanner(System.in);
        for (int i=0;i<n;i++) {
            sv[i] = new sinhvien();
            System.out.println("Nhap ten sinh vien thu "+(i+1));
            sv[i].ten=input2.nextLine();
            System.out.println("Nhap dia chi sinh vien thu "+(i+1));
            sv[i].diachi=input2.nextLine();
            System.out.println("Nhap sdt sinh vien thu "+(i+1));
            sv[i].sdt=input2.nextLine();
        }
        //return sv;
    }
    static void hienthi(sinhvien[] sv,int n){
        System.out.println("Ten\tDiaChi\tSDT");
        for (int i=0;i<n;i++){
            System.out.println(sv[i].ten+"\t"+sv[i].diachi+"\t"+sv[i].sdt);
        }
    }
    static void timkiem(sinhvien[] sv,int n){
        Scanner input2=new Scanner(System.in);
        System.out.println("Nhap ten can tim: ");
        String ten=input2.nextLine();
        int kt=0;
        for (int i=0;i<n;i++){
            if (ten.equals(sv[i].ten)) {
                kt=1;
                System.out.println(sv[i].ten+"\t"+sv[i].diachi+"\t"+sv[i].sdt);
            }
        }
        if (kt==0)
            System.out.println("Khong co ten hehe:v");
    }
    public static void main(String[] args) {
        do {
            System.out.println("Nhap lua chon");
            int choose = input.nextInt();
            switch (choose) {
                case 1:nhap();
                    
                    break;
                case 2:hienthi(sv,n);
                    
                    break;
                case 3:timkiem(sv,n);
                    
                    break;
                case 4: System.exit(1);
                default: System.out.println("Ban da nhap sai lua chon");
            }
            
        }
        while(true);
    }
    
}
