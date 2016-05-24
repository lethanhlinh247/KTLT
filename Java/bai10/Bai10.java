
package bai10;
import java.util.Scanner;
public class Bai10 {
    int n;
    int[] nhap(int n){
        Scanner input = new Scanner(System.in);
        int[] a = new int[n];
        for (int i=0;i<n;i++)
            a[i] = input.nextInt();
        return a;
    }
    float[] nhap(int n){
        Scanner input = new Scanner(System.in);
        float[] a = new float[n];
        for (int i=0;i<n;i++)
            a[i] = input.nextInt();
        return a;
    }
    double[] nhap(int n){
        Scanner input = new Scanner(System.in);
        double[] a = new double[n];
        for (int i=0;i<n;i++)
            a[i] = input.nextInt();
        return a;
    }
    
    
    int max(int a[]){
        int max = a[0];
        for (int i=1;i<a.length;i++)
            if (a[i]>max)
                max = a[i];
        return max;
    }
    float max(float a[]){
        float max = a[0];
        for (int i=1;i<a.length;i++)
            if (a[i]>max)
                max = a[i];
        return max;
    }
    double max(double a[]){
        double max = a[0];
        for (int i=1;i<a.length;i++)
            if (a[i]>max)
                max = a[i];
        return max;
    }
    int tong(int a[]){
        int s = a[0];
        for (int i =1;i<a.length;i++)
            s = s+a[i];
        return s;
    }
    float tong(float a[]){
        float s = a[0];
        for (int i =1;i<a.length;i++)
            s = s+a[i];
        return s;
    }
    double tong(double a[]){
        double s = a[0];
        for (int i =1;i<a.length;i++)
            s = s+a[i];
        return s;
    }
    public static void main(String[] args) {
        
    }
    
}
