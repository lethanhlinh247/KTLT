#include<stdio.h>
struct Ngay
{
    int ngay;
    int thang;
    int nam;
};
void nhap(Ngay *a,int n)
{
    for (int i=0;i<n;i++)
    {
        printf("\nNhap ngay thu %d:\n",i+1);
        printf("\nNhap ngay:");
        scanf("%d",&a[i].ngay);
        printf("Nhap thang: ");
        scanf("%d",&a[i].thang);
        printf("Nhap nam:");
        scanf("%d",&a[i].nam);
    }
}
void sapxep(Ngay *a,int n)
{
    for (int i=0;i<n-1;i++)
        if (a[i].ngay>a[i+1].ngay)
        {
            int temp=a[i].ngay;
            a[i].ngay=a[i+1].ngay;
            a[i+1].ngay=temp;
        }
}
void xuat(Ngay *a,int n)
{
    for (int i=0;i<n;i++)
    {
        printf("\nNgay thu %d: ",i+1);
        printf("Ngay %d, Thang %d, Nam %d",a[i].ngay,a[i].thang,a[i].nam);
    }
}
void main()
{
    int n;
    printf("Nhap so luong ngay: ");
    scanf("%d",&n);
    Ngay *a=new Ngay[n];
    nhap(a,n);
    xuat(a,n);
    printf("\nMang sau khi sap xep:\n");
    sapxep(a,n);
    xuat(a,n);
}
