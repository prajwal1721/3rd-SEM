#include<stdio.h>
typedef struct 
{
    int r,c,d;
}element;
void disp(element *b);
int main()
{
    int r,c,n;element a[20];
    scanf("%d%d%d",&r,&c,&n);
    a[0].r=r;
    a[0].c=c;
    a[0].d=n;
    for(int i=1;i<=n;i++)
    {
        scanf("%d%d%d",&a[i].r,&a[i].c,&a[i].d);
    }
    int rt[100];
      for(int i=0;i<c;i++)
        rt[i]=0;
    for(int i=1;i<=n;i++)
        rt[a[i].c]++;
    int sp[100];
    sp[0]=1;
    element b[100];
    for(int i=1;i<=c;i++)
    {
        sp[i]=sp[i-1]+rt[i-1];
    }
    for(int i=1;i<=n;i++)
    {
        int j=sp[a[i].c]++;
        b[j].r=a[i].c;
        b[j].c=a[i].r;
        b[j].d=a[i].d;
    }
    b[0].c=a[0].r;
    b[0].r=a[0].c;
    b[0].d=a[0].d;
    printf("\n");
    disp(b);
}
void disp(element *b)
{
    for(int i=1;i<=b[0].d;i++)
        printf("%d %d %d\n",b[i].r,b[i].c,b[i].d);
    printf("\n");
}