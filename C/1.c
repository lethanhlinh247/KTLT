#include "stdio.h"
#include "conio.h"
#include "malloc.h"
typedef struct {
    char hoten[25];
    int tuoi;
    char lop[3];
}sinhvien;
void nhapsv(sinhvien *sv,int *n){
    printf("Nhap so sinh vien: ");
    scanf("%d",n);
    sv = (sinhvien*)malloc((*n)*sizeof(sinhvien));
    int i;
    for (i=0;i<*n;i++) {
        printf("Nhap ho ten sinh vien %d: ",i+1);
        fflush(stdin);
        gets(sv[i].hoten);
        printf("NHap tuoi sinh vien %d: ",i+1);
        scanf("%d",&sv[i].tuoi);
        printf("Nhap lop sinh vien %d: ",i+1);
        fflush(stdin);
        gets(sv[i].lop);
    }
}
void hienthisv(sinhvien *sv,int n) {
    int i;
    printf("Hoten\t\ttuoi\t\tLop\n");
    for (i=0;i<n;i++)
        printf("%s\t\t%d\t\t%s\n",sv[i].hoten,sv[i].tuoi,sv[i].lop);
}
void timkiemsv(sinhvien *sv, int n, char ten[]) {
    int i,ok=0;
    for (i=0;i<n;i++)
        if (strcmp(sv[i].hoten,ten)==0) {
            ok=1;
            printf("%s\t\t%d\t\t%s\n",sv[i].hoten,sv[i].tuoi,sv[i].lop);
        }
    if (ok==0)
        printf("khong co sinh vien ten la %s",ten);
}
void main()
{
    int n,check=0,chon;
    sinhvien *sv;
    do {
        printf("MENU\n");
        printf("1. Nhap danh sach sinh vien \n");
        printf("2. Hien thi danh sach sinh vien \n");
        printf("3. Tim ten sinh vien\n");
        printf("4. Ket thuc\n");
        printf("Moi nhap: ");
        scanf("%d",&chon);
        switch(chon) {
            case 1: {
                        nhapsv(sv,&n);
                        check=1;
                        break;
                    }
            case 2: {
                        if (check==1)
                            hienthisv(sv,n);
                        else
                            printf("Ban chua nhap danh sach sinh vien");
                        break;
                    }
            case 3: {
                        if(check==1) {
                            char name[25];
                            printf("Nhap ten sinh vien can tim");
                            fflush(stdin);
                            gets(name);
                            timkiemsv(sv,n,name);
                        }
                        else
                            printf("Ban chua nhap danh sach");
                        break;

                    }
            case 4: exit(0);
            default: printf("ban nhap sai");
        }
    }
    while (chon);
    getch();
}
