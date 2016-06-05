#include "stdio.h"
#include "conio.h"
#include "stdlib.h"
void nhap(int *n){
    printf("Nhap n: ");
    scanf("%d",n);
}
void chuyen10to2(int n){
    if (n<2) {
        printf("%d",n);
        return;
    }
    else
        chuyen10to2(n/2);
    printf("%d",n%2);
}
void main(){
    chuyen10to2(4);
}
