package kt;

import java.util.ArrayList;
import java.util.Scanner;

public class bai8a {
    
    public static void main(String[] args) {
        ArrayList<SinhVien> sv = new ArrayList();
        Scanner input = new Scanner(System.in);
        int n,choose;
        do {
            System.out.println("Nhap lua chon: ");
            choose=input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("Nhap so sinh vien: ");
                    n = input.nextInt();
                    nhap(sv, n);
                    break;
                case 2: xuat(sv);
                    break;
                case 3: tim(sv);
                case 4 : System.exit(0);
                default:
                    System.out.println("Nhap sai lua chon");
            }
        
        }
        while (true);
    }

    public static void nhap(ArrayList<SinhVien> sv, int n) {
        Scanner input = new Scanner(System.in);
        for (int i=0;i<n;i++){
            SinhVien a = new SinhVien();
            System.out.println("Nhap ten: ");
            a.setHoten(input.nextLine());
            System.out.println("Nhap tuoi");
            a.setTuoi(Integer.parseInt(input.nextLine()));
            System.out.println("Nhap lop");
            a.setLop(input.nextLine());
            sv.add(a);
        }
    }

    public static void xuat(ArrayList<SinhVien> sv) {
        System.out.println("Danh Sach Sinh Vien la: ");
        System.out.println("\tHoTen\tTuoi\tLop");
        for (int i=0;i<sv.size();i++)
            System.out.println(sv.get(i).getHoten()+"\t"+sv.get(i).getLop()+"\t"+sv.get(i).getTuoi());
    }
    public static void  tim(ArrayList<SinhVien> sv){
        Scanner input = new Scanner(System.in);
        String name;
        System.out.println("Nhap ten sinh vien can tim: ");
        name=input.nextLine();
        for (int i=0;i<sv.size();i++) {
            if (name.equals(sv.get(i).getHoten()))
                System.out.println(sv.get(i).getHoten()+"\t"+sv.get(i).getLop()+"\t"+sv.get(i).getTuoi());
        
        }
    }
    
}
