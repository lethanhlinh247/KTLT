#include "stdio.h"
#include "conio.h"
#include "math.h"
float sum (int n){
    if (n==1)
        return (1-5)*(1-5);
    return sum(n-1)+((n)*(n));
}
float tinhsin(int n){
    if (n==1)
        return sin(1)*sin(1);
    return tinhsin(n-1)+((sin(n))*(sin(n)));
}
float tinhcos(int n){
    int i,s=0;
    for (i=0;i<n;i++){
        s=s+(cos(i)*cos(i));
    }
    return s;
}
void main()
{
    int n;
    printf("\nNhap n: ");
    scanf("%d",&n);
    //printf("\n%f",sum(n));
    printf("\n%f",tinhsin(n));
}
