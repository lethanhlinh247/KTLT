/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai10;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Dayso {
    int[]a=new int[20];
    int n;
    float[]b=new float[20];
    double[]c=new double[20];
    public void Nhap(){
    
        Scanner nhap=new Scanner (System.in);
        System.out.println("Nhập với kiểu int");
        System.out.println("Nhập n:");
        n=nhap.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ: "+i);
            a[i]=nhap.nextInt();
            
        }
    }
    
    public int Max(int n, int[]a){
        if(n==1){
            return a[0];
        }
        if(n>1){
            int max=Max(n-1,a);
            if(a[n-1]>max){
                return a[n-1];
            }
            else {
                return max;
            }
        }
        return 1;
       }
    public int Tong(int n, int[] a){
       int Tong=a[n-1];
        if(n==1){
            return a[0];
        }
        if(n>1){
            return Tong+Tong(n-1,a);
        }
        return 1;
    
    }
    public void Nhap(String c){
        System.out.println("Nhập dãy "+c);
         Scanner nhap=new Scanner (System.in);
        System.out.println("Nhập với kiểu float:");
        System.out.println("Nhập n:");
        n=nhap.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ: "+i);
            b[i]=nhap.nextFloat();
        }
   
   } 
    public float Max(int n, float[]b){
        if(n==1){
            return b[0];
        }
        if(n>1){
            float max=Max(n-1, b);
            if(b[n-1]>max){
                return b[n-1];
            }
            else {
                return max;
            }
        }
        return 1;
    }
     public float Tong(int n, float[] b){
       float Tong= b[n-1];
        if(n==1){
            return b[0];
        }
        if(n>1){
            return Tong+Tong(n-1,b);
        }
        return 1;
    
    }
     public void Nhap(String d, String e){
         System.out.println("Nhập dãy "+d+e);
         Scanner nhap=new Scanner (System.in);
         System.out.println("Nhập với kiểu double: ");
        System.out.println("Nhập n:");
        n=nhap.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Phần tử thứ: "+i);
            c[i]=nhap.nextFloat();
        }
   
   } 
      public double Tong(int n, double[] c){
       double Tong= c[n-1];
        if(n==1){
            return c[0];
        }
        if(n>1){
            return Tong+Tong(n-1,c);
        }
        return 1;
    
    }
    public double Max(int n, double[]c){
        if(n==1){
            return c[0];
        }
        if(n>1){
            double max=Max(n-1, c);
            if(c[n-1]>max){
                return c[n-1];
            }
            else {
                return max;
            }
        }
        return 1;
    }
     
}
