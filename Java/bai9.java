package kt;
import static java.lang.Math.sqrt;
import java.util.Scanner;

public class bai9 {
    public static class number{
        public int num;
    }
    public static void nhap (number n){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap so nguyen duong");
        n.num = input.nextInt();
    }
    public static int ktntfor(int n){
        int kt=0;
        for (int i=2;i<=sqrt(n);i++) {
            if (n%i==0)
                kt=1;
        }
        return kt;
    }
    public static int ktntdq(int n, int c, int d){
        if (c>d)
            return 0;
        if (n%c==0)
            return 1;
        return ktntdq(n,(c+1),d);
    }
    public static void hienthintfor(int n){
        for (int i=2;i<n;i++) {
            if(ktntfor(i)==0)
                System.out.println(i);
        }
    }
    public static void hienthintdq(int n){
        if (n==1)
            return;
        if (ktntdq(n,2,(int)sqrt(n))==0)
            System.out.println(n);
        hienthintdq(n-1);
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        number n = new number();
        int choose;
        do {
            System.out.println("Nhap lua chon: ");
            choose = input.nextInt();
            switch (choose) {
                case 1: nhap(n);
                    break;
                case 2: hienthintfor(n.num);
                    break;
                case 3: hienthintdq(n.num);
                    break;
                case 4: System.exit(0);
            }
        
        }
        while (true);
    }
}
