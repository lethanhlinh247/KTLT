#include "stdio.h"
#include "conio.h"
#include "math.h"
void nhap(int *n){
    printf("Nhap n: ");
    scanf("%d",n);
}
int ktntfor(int n){
    int i,kt=0;
    for (i=2;i<=sqrt(n);i++){
        if((n%i)==0)
            kt=1;
    }
    return kt;
}
void inntfor(int n){
    int i;
    for (i=2;i<n;i++){
        if(ktntfor(i)==0)
            printf("\n%d",i);
    }
}

int ktntdq(int n, int c, int d){
    if (c>d)
        return 0;
    if (n%c==0)
        return 1;
    return ktntdq(n,(c+1),d);
}

void inntdq(int n){
    if (n==1)
        return 1;
    else if((ktntdq(n,2,sqrt(n)))==0)
        printf("\n%d",n);
    inntdq(n-1);
}
void main(){
    int n, choose;
    do {
        printf("moi lua chon: ");
        scanf("%d",&choose);
        switch(choose){
            case 1: {
                nhap(&n);
                break;
            }
            case 2: {
                inntfor(n);
                break;
            }
            case 3: {
                inntdq(n);
                break;
            }
            case 4: {
                exit(0);
            }
            default: printf("Nhap sai roi cung");
        }
    }
    while (1);
}
