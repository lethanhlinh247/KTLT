#include "stdio.h"
#include "conio.h"
#include "malloc.h"
typedef struct
{
    int masach;
    char tensach[100];
    char tacgia[100];
    int manxb;
}ThuVien;
void TaoDanhMucSach(ThuVien *ds, int n){
    int i;
    for (i=0;i<n;i++){
        printf("\nNhap ma sach: ");
        scanf("%d",&ds[i].masach);
        printf("\nNhap ten sach: ");
        fflush(stdin);
        gets(ds[i].tensach);
        printf("\nNhap tac gia: ");
        fflush(stdin);
        gets(ds[i].tacgia);
        printf("\nNhap ma NXB: ");
        scanf("%d",&ds[i].manxb);
    }
}
void HienThiSachTrongNXB(ThuVien *ds, int n, int manxb) {
    printf("\nMaSach\tTenSach\tTenTacGia\tMaNXB");
    int i;
    for (i=0;i<n;i++){
        if (manxb==ds[i].manxb)
            printf("\n%d\t%s\t%s\t%d",ds[i].masach,ds[i].tensach,ds[i].tacgia,ds[i].manxb);
    }
}
int main()
{
    int n,choose;
    ThuVien *ds;

    do {
            printf("\nNhap lua chon");
            scanf("%d",&choose);
            switch(choose){
                case 1: {
                        printf("\nNhap so luong sach");
                        scanf("%d",&n);
                        ds = (ThuVien*) malloc(n*sizeof(ThuVien));
                        TaoDanhMucSach(ds,n);
                        break;
                }
                case 2: {int manxb;
                        printf("\nNhap ma nha xuat ban can tim: ");
                        scanf("%d",&manxb);
                        HienThiSachTrongNXB(ds,n,manxb);
                        break;
                }
                case 3: exit(0);
                default: printf("\nNhap Sai Roi Cung A");
            }

    }
    while (1);
    return 0;
}
