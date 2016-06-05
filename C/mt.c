#include <stdio.h>
#include <conio.h>
#include <malloc.h> //cap phat mang dong
#define Max 100
int **MaTran(int Dong,int Cot);
void XuatMT(int **MT,int Dong,int Cot);
void main()
{
    int dong,cot,**a;
    do
    {
        printf("nhap so dong va cot cua ma tran: ");
        scanf("%d%d",&dong,&cot);
    }while(dong<1||cot<1||dong>Max||cot>Max);
    a=MaTran(dong,cot);
    printf("Ma tran vua nhap: \n");
    XuatMT(a,dong,cot);
    getch();
}
int **MaTran(int Dong,int Cot)
{
    int **t;
//cap phat mang 1 chieu t, co do lon moi phan tu la (int *)
    t=(int **)malloc(Dong*sizeof(int *));
//Cap phat cho moi phan tu tren thanh 1 mang co do lon moi phan tu la (int)
    int d;
    for(d=0;d<Dong;d++)
        t[d]=(int *)malloc(Cot*sizeof(int));
//Nhap gia tri cho ma tran
int i,j;
    for(i=0;i<Dong;i++)
        for(j=0;j<Cot;j++)
        {
            printf("A[%d][%d]= ",i+1,j+1);
            scanf("%d",&t[i][j]);
        }
    return t;
}
void XuatMT(int **MT,int Dong,int Cot)
{
    int i,j;
    for(i=0;i<Dong;i++)
    {
        for(j=0;j<Cot;j++)
            printf("%5d",MT[i][j]);
        printf("\n");
    }
}
