#include "stdio.h"
#include "conio.h"
void nhapday(int mang[], int n){
    int i;
    for (i=0;i<n;i++){
        printf("Nhap phan tu %d: ",(i+1));
        scanf("%d",&mang[i]);
    }
}
int max(int mang[], int n){
    if (n==1)
        return mang[0];
    else
        if (mang[n-1]>max(mang,(n-1)))
            return mang[n-1];
        else
            return max(mang,n-1);
    return max;
}
int sum(int mang[], int n){
    if (n==1)
        return mang[0];
    return sum(mang,n-1)+mang[n-1];
}
void main()
{
    int n,a,choose;
    do {
        printf("Nhap lua chon: ");
        scanf("%d",&choose);
        switch(choose)
        {
            case 1: {
                        printf("Nhap so phan tu: ");
                        scanf("%d",&n);
                        a = (int *) malloc (n*sizeof(int));
                        nhapday(a,n);
                        break;
            }
            case 2: {
                        printf("\n%d",max(a,n));
                        break;
            }
            case 3: {
                        printf("\n%d",sum(a,n));
            }
            case 4: exit(0);
            default: printf("Nhap sai roi cung :v");
        }
    }
    while (1);
}
