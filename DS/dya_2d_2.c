#include<stdlib.h>
#include<stdio.h>
int** add(int **a,int**b,int **c,int m,int n);
void disp(int **a,int m,int n);
int ** input(int **a,int m,int n);
int main()
{
    int **a,**b,**c,n,m;
    printf("enter the number of rows and cols\n");
    scanf("%d%d",&n,&m);
    a=input(a,n,m);
    b=input(b,n,m);
    c=add(a,b,c,n,m);
    disp(c,n,m);
}
int ** input(int **a,int m,int n)
{

    printf("MATRIX 2\n");
    a=(int**)malloc(sizeof(int*)*n);
    for (int  i = 0; i < n; i++)
    {
        a[i]=(int*)malloc(sizeof(int)*m);
        for(int j=0;j<m;j++)
        {
            scanf("%d",&a[i][j]);
        }   
    }
    return a;
}
int** add(int **a,int**b,int **c,int m,int n)
{
    c=(int**)malloc(sizeof(int*)*m);
    for (int  i = 0; i < m; i++)
    {
        c[i]=(int*)malloc(sizeof(int)*n);
        for(int j=0;j<m;j++)
        {
            c[i][j]=a[i][j]+b[i][j];
        }   
    }
    return c;
}
void disp(int **a,int m,int n)
{
    for (int  i = 0; i < m; i++)
    {
        for(int j=0;j<n;j++)
        {
            printf("%d ",a[i][j]);
        }   
        printf("\n");
    }
}