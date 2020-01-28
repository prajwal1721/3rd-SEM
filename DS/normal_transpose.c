#include<stdio.h>
typedef struct 
{
    int r,c,d;
}t;
void disp(t*b)
{
        printf("r  c  d\n");
    for(int i=0;i<=b[0].d;i++)
    {
        printf("%d  %d  %d\n",b[i].r,b[i].c,b[i].d);
    }
}
void trans(t *a,t*b)
{
    int nc=a[0].c,nr=a[0].r,nd=a[0].d;
    b[0].c=a[0].r;b[0].r=a[0].c;b[0].d=a[0].d;
    for(int j=0;j<nc;j++)
    for(int i=1;i<=nd;i++)
    {
        if(a[i].c==j)
            {
                b[j].c=a[i].r;b[j].r=a[i].c;b[j].d=a[i].d;
            }
    }
}
void main()
{
    t a[100],b[100];
    int n;
    scanf("%d%d%d",&a[0].r,&a[0].c,&a[0].d);
    for(int i=1;i<=a[0].d;i++)
    scanf("%d%d%d",&a[i].r,&a[i].c,&a[i].d);
    trans(a,b);
    disp(b);
}