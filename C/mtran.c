#include<stdio.h>
#include<conio.h>
void nhapMT (int a[][100],int n)
{   int i,j;
     for (i=0; i<n; i++)
        for (j=0; j<n; j++)
        {
            printf("\nNhap a[%d][%d]: ",i,j);
            scanf("%d", &a[i][j]);
        }
}

void xuatMT(int a[][100], int n)
{ int i,j;
    for(i=0; i<n; i++)
       {
        for(j=0; j<n; j++)
        {
            printf("%4d",a[i][j]);
        }
        printf("\n");
    }

}
void Incheochinh (int a[][100],int n)
{
    printf("Duong cheo chinh: ");
    int i,j;
    for(i=0;i<n;i++) {
        for(j=0;j<n;j++) {
            if(i!=j)
                printf("*");
            else
                printf("%d",a[i][j]);
        }
        printf("\n");
    }
}
main()
{
    int n;
    int a[100][100];
    printf("\nMa tran cap n= ");
    scanf("%d",&n);

    nhapMT(a,n);
    xuatMT(a,n);
    Incheochinh(a,n);
    getch();
}

