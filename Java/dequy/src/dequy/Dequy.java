
package dequy;

import static java.lang.Math.sqrt;

public class Dequy {
    public static int tongDeQuy(int n,int[] a){
        if (n==1)
            return a[n-1];
        else
            return (tongDeQuy(n-1,a)+a[n-1]);
    }
    public static int maxDeQuy(int n,int[] a){
        int max = a[0];
        if (n==1)
            return max;
        else
            if (a[n-1]>max)
                max=a[n-1];
        return max;
    }
    public static int ktnt(int n){
        int kt=0;
        for (int i=0;i<sqrt(n);i++) {
            if (n%i==0)
                kt= 1;
        }
        return kt;
    }
    public static int ktntDeQuy(int n,int c, int d){
        int kt;
        if(c>d)
            kt=0;
            //return 1;
        if ((n%c)==0)
            kt=1;
            //return 0;
        //return kt;
        return(ktntDeQuy(n,n+1,d));
           // System.out.println(n);
    }
    public static void main(String[] args) {
        int[] a= new int[3];
        a[0]=5;
        a[1]=10;
        a[2]=15;
        System.out.println(tongDeQuy(3,a));
        System.out.println(maxDeQuy(3,a));
    }
    
}
