package kt;

import java.util.Scanner;

public class bai10 {
    public static void nhapInt(int[] a, int n){
        Scanner input = new Scanner (System.in);
        for (int i=0;i<n;i++){
            System.out.println("Nhap phan tu: "+ (i+1));
            a[i]=(input.nextInt());
        }
    }
    public static void nhapFloat(float[] a, int n){
        Scanner input = new Scanner (System.in);
        for (int i=0;i<n;i++){
            System.out.println("Nhap phan tu: "+ (i+1));
            a[i]=(input.nextFloat());
        }
    }
    public static void nhapDouble(double[] a, int n){
        Scanner input = new Scanner (System.in);
        for (int i=0;i<n;i++){
            System.out.println("Nhap phan tu: "+ (i+1));
            a[i]=(input.nextDouble());
        }
    }
    public static int max(int[] a, int n){
        if (n==1)
            return a[0];
        else
            if(a[n-1]<max(a,n-1))
                return max(a,n-1);
            else
                return a[n-1];
    }
    public static float max(float[] a, int n){
        if (n==1)
            return a[0];
        else
            if(a[n-1]<max(a,n-1))
                return max(a,n-1);
            else
                return a[n-1];
    }
    public static double max(double[] a, int n){
        if (n==1)
            return a[0];
        else
            if(a[n-1]<max(a,n-1))
                return max(a,n-1);
            else
                return a[n-1];
    }
    
    public static int sum(int[] a, int n){
        if (n==1)
            return a[0];
        return a[n-1]+sum(a,n-1);
    }
    public static float sum(float[] a, int n){
        if (n==1)
            return a[0];
        return a[n-1]+sum(a,n-1);
    }
    public static double sum(double[] a, int n){
        if (n==1)
            return a[0];
        return a[n-1]+sum(a,n-1);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n;
        System.out.println("Nhap so phan tu cua mang: ");
        n = input.nextInt();
        System.out.println("Nhap kieu mang muon thao tac");
        int s = input.nextInt();
        switch (s) {
            case 1: int[] mang = new int[n];
                    do {
                    System.out.println("Nhap lua chon: ");
                    int choose = input.nextInt();
                    switch (choose) {
                        case 1:nhapInt (mang,n);
                            break;
                        case 2: 
                                System.out.println("Tong la: "+sum(mang,n));
                            break;
                        case 3: System.out.println("max la: "+max(mang,n));
                            break;
                        default:
                            System.out.println("Nhap sai roi cung");
                        }
                    }
                    while(true);
            case 2: float[] mangb = new float[n];
                    do {
                    System.out.println("Nhap lua chon: ");
                    int choose = input.nextInt();
                    switch (choose) {
                        case 1:nhapFloat(mangb,n);
                            break;
                        case 2: System.out.println("Tong la: "+sum(mangb,n));
                            break;
                        case 3: System.out.println("max la: "+max(mangb,n));
                            break;
                        default:
                            System.out.println("Nhap sai roi cung");
                        }
                    }
                    while(true);
            case 3: double[] mangd = new double[n];
                    do {
                    System.out.println("Nhap lua chon: ");
                    int choose = input.nextInt();
                    switch (choose) {
                        case 1:nhapDouble(mangd,n);
                            break;
                        case 2: System.out.println("Tong la: "+sum(mangd,n));
                            break;
                        case 3: System.out.println("max la: "+max(mangd,n));
                            break;
                        default:
                            System.out.println("Nhap sai roi cung");
                        }
                    }
                    while(true);
            default: System.out.println("Nhap sai lua chon: ");
        }
    }
}
