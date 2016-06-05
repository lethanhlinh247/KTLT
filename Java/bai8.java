package kt;

import java.util.Scanner;

public class bai8 {
    public static void nhap(SinhVien[] sv){
        Scanner input = new Scanner(System.in);
        for (int i=0;i<sv.length;i++){
            sv[i] = new SinhVien();
            System.out.println("Nhap ten sinh vien: "+(i+1));
            sv[i].setHoten(input.nextLine());
            System.out.println("Nhap tuoi sinh vien: "+(i+1));
            sv[i].setTuoi(Integer.parseInt(input.nextLine()));
            System.out.println("Nhap lop sinh vien: "+(i+1));
            sv[i].setLop(input.nextLine());
        }
    }
    public static void xuat(SinhVien[] sv){
        System.out.println("Danh Sach Sinh Vien la: ");
        System.out.println("Hoten\tTuoi\tLop");
        for (int i=0;i<sv.length;i++){
            System.out.println(sv[i].getHoten()+"\t"+sv[i].getTuoi()+"\t"+sv[i].getLop());
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int choose, n;
        SinhVien[] sv = new SinhVien[1];
        do {
            System.out.println("Nhap lua chon: ");
            choose = input.nextInt();
            switch (choose) {
                case 1: System.out.println("Nhap so sinh vien: ");
                        n = input.nextInt();
                        sv = new SinhVien[n];
                        nhap(sv);
                    
                    break;
                case 2: xuat(sv);
                    break;
                case 3: System.exit(0);
                default:
                    System.out.println("Ban nhap sai");
            }
        }
        while (true);
    }
    
}
