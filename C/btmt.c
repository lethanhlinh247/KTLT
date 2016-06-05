#include <stdio.h>
#include <conio.h>
#include <malloc.h>
int **mt(int x,int y)
{
    int **p;
    p=(int **) malloc(x * sizeof(int *));
    int i,j;
    for (i=0;i<x;i++) {
       p[i]= (int *) malloc(y * sizeof(int));
    }
    for (i=0;i<x;i++)
        for (j=0;j<y;j++) {
            printf("Nhap a[%d][%d]",i,j);
            scanf("%d",&p[i][j]);
        }
    return p;
}
void xuatmt(int **mt, int x, int y)
{
    int i,j;
    for (i=0;i<x;i++) {
        for (j=0;j<y;j++) {
            if (i==j)
                printf("%d\t",mt[i][j]);
            else
                printf("*\t");
        }
        printf("\n");
    }
}
void main()
{
    int **p,m,n,ok=0,choose;
    do {
        printf("Nhap vao ");
        scanf("%d",&choose);
        switch (choose)
        {
            case 1:
                {
                    printf("Nhap so hang,cot");
                    scanf("%d%d",&m,&n);
                    p=mt(m,n);
                    //xuatmt(p,m,n);
                    ok=1;
                    printf("Ban da nhap xong ma tran\n");
                    break;
                }
            case 2:
                {
                    if (ok==1) {
                            printf("Ma tran la\n");
                            xuatmt (p,m,n);
                        }
                    else
                        printf("Ban chua nhap ma tran\n");
                    break;
                }
            case 3: exit(0);
            default: printf("Ban da nhap sai lua chon, vui long nhap lai\n");
        }
    }
    while (choose);//while(choose>0 && choose <4);
}

