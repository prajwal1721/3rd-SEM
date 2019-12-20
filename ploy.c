#include<stdio.h>
#define COMP(x,y) (x>y)?1:(x==y)?0:-1
typedef struct 
{
    int e,c;
}term;

int add(int sa,int sb,int ea,int eb,int sc,term aa[]);
int attach(int c,int e);
void disp(term *b,int sa,int ea);
int main()
{
    term a[100];
    int n,m,sa=0,sb,ea,eb,sc,ec;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
        scanf("%d%d",&a[i].c,&a[i].e);
    ea=n-1;sb=n;  
    scanf("%d",&n);
    eb=ea+n;
    for(int i=sb;i<=eb;i++)
        scanf("%d%d",&a[i].c,&a[i].e);
    sc=eb+1;
    ec=add(sa,sb,ea,eb,sc,a);
    disp(a,sc,ec);
}
void disp(term *b,int sa,int ea)
{
    int i;
    for(i=sa;i<=ea-1;i++)
        printf("%dX^%d + ",b[i].c,b[i].e);
    printf("%dX^%d\n",b[i].c,b[i].e);
}
int add(int sa,int sb,int ea,int eb,int sc,term aa[])
{
    int c;
    while(sa<=ea && sb<=eb)
    {
        switch (COMP(aa[sa].e,aa[sb].e))
        {
            case 1:aa[sc].e=aa[sa].e;
                    aa[sc++].c=aa[sa++].c;
                    break;
        
            case -1:aa[sc].e=aa[sb].e;
                    aa[sc++].c=aa[sb++].c;
                    break;
            case 0:c=aa[sa].c+aa[sb].c;
                    if(c) { 
                    aa[sc].c=c;
                    aa[sc++].e=aa[sb++].e;sa++;
                    }break;
        }
    }
    for(;sa<=ea;sa++)
        {
            aa[sc].e=aa[sa].e;
            aa[sc++].c=aa[sa].c;
        }

    for(;sb<=eb;sb++)
        {
            aa[sc].e=aa[sb].e;
            aa[sc++].c=aa[sb].c;
        }
    return sc-1;
}