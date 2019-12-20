#include<stdio.h>
#define COMP(x,y) (x>y)?x:(x==y)?0:-1
typedef struct
{
    int c,e;
}t;
void add(int sa,int sb,int sc,int *ec,int ea,int eb,t a[]);
void disp(int sa,int ea,t a[]);
int main()
{
    int sa,sb,sc,ea,eb,ec;
    t a[100];
    sa=0;
    scanf("%d",&ea);
    ea--;
    for(int i=0;i<=ea;i++)
        scanf("%d%d",&a[i].c,&a[i].e);
    scanf("%d",&eb);
    sb=ea+1;
    eb+=ea;
    for(int i=sb;i<=eb;i++)
        scanf("%d%d",&a[i].c,&a[i].e);
    sc=eb+1;
    add(sa,sb,sc,&ec,ea,eb,a);
    disp(sc,ec,a);
}   
void add(int sa,int sb,int sc,int *ec,int ea,int eb,t a[])
{
    int s;
    while(sa<=ea && sb<=eb)
    {
        switch(COMP(a[sa].e,a[sb].e))
        {
            case 1:a[sc++]=a[sa++];printf("d");break;
            case -1:a[sc++]=a[sb++];break;
            case 0:s=a[sa].c+a[sb].c;
                    a[sc].e=a[sb].e;
                    a[sc++].c=s;sa++;sb++;
        }
    }
    for(;sa<=ea;sa++)
            a[sc++]=a[sa++];
    for(;sb<=eb;sb++)
            a[sc++]=a[sa++];
    *ec=sc-1;
}
void disp(int sa,int ea,t a[])
{
    for(int i=sa;i<ea;i++)
        printf("%dX^%d+",a[i].c,a[i].e);
    printf("%dX^%d\n",a[ea].c,a[ea].e);
}