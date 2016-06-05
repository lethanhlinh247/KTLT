
package cau10;

import static java.lang.Math.sqrt;
import java.util.Scanner;


public class Cau10 {

    public static int nhap() {
        Scanner nhap = new Scanner(System.in);
        int n = nhap.nextInt();
        return n;
    }

    public static int Max(int a[], int n) {
        if (n == 0) {
            return a[0];
        }
        int max = Max(a, n - 1);
        if (max < a[n - 1]) {
            max = a[n - 1];
        }
        return max;
    }

    public static float Max(float a[], int n) {
        if (n == 0) {
            return a[0];
        }
        float max = Max(a, n - 1);
        if (max < a[n - 1]) {
            max = a[n - 1];
        }
        return max;
    }

    public static double Max(double a[], int n) {
        if (n == 0) {
            return a[0];
        }
        double max = Max(a, n - 1);
        if (max < a[n - 1]) {
            max = a[n - 1];
        }
        return max;
    }

    public static int Sum(int a[], int n) {
        if (n == 0) {
            return 0;
        }
        return a[n-1]+Sum(a,n-1);
    }

    public static float Sum(float a[], int n) {
        if (n == 0) {
            return 0;
        }
        return a[n-1]+Sum(a,n-1);
    }

    public static double Sum(double a[], int n) {
        if (n == 0) {
            return 0;
        }
        return a[n-1]+Sum(a,n-1);
    }

    public static void main(String[] args) {
        int i, n;
        System.out.println("nhap vao so phan tu cua mang ");
        n = nhap();
        int[] a = new int[n];
        while (true) {
            System.out.println("nhap vao so tuong ung chuc nang");
            System.out.println("1. nhap vao cac phan tu mang");
            System.out.println("2. tinh tong cua mang");
            System.out.println("3. tim so lon nhat");
            System.out.println("4. thoat");
            System.out.println("moi ban chon");
            i = nhap();
            if (i == 4) {
                break;
            } else {
                switch (i) {
                    case 1: {
                        System.out.println("bat dau nhap");
                        for (i = 0; i < n; i++) {
                            a[i] = nhap();
                        }
                    }
                    break;
                    case 2: {
                        System.out.println("Tong " + Sum(a, n));
                    }
                    break;
                    case 3: {
                        System.out.println("Max " + Max(a, n));
                        break;
                    }
                    case 4:
                        break;
                    default:
                        System.out.println("nhap lai chuc nang");
                        break;
                }
            }
        }
    }
}
