#include<stdio.h>
#include<stdlib.h>
int* q,*nq;
int f=0,r=0,cap=1;
void copy(int *a,int *b,int *c);
void insert(int x)
{
    if(f==(r+1)%cap)
    {
        int start=(f+1)%cap;
        nq=(int*)malloc(sizeof(int)*cap*2);
        if(start==1||start==0)
        {
            copy(q+start,q+cap+start-1,nq);
        }
        else
        {
            copy(q+start,q+cap,nq);
            copy(q,q+r+1,nq+cap-start);
        }
        printf("cap is doubling %d\n",cap*2);
        f=cap*2-1;
        r=cap-2;
        cap=cap*2;
        free(q);
        q=nq;
    }
    r=(r+1)%cap;
    q[r]=x;
}
int del()
{
    f=(f+1)%cap;
    int temp=q[f];
    int t=q[f];
    // free(temp);
    return t;
}
void disp()
{
    int i;
    for(i=(f+1)%cap;i!=(r+1)%cap;i++)
        printf("%d ",q[i]);
    printf("\n");
}
void copy(int *a,int *b,int *c)
{
    int i=0;
    while(a<b)
    {
        c[i++]=*a;
        *a++;
    }
}
int main()
{
    q=(int*)malloc(sizeof(int));
    int ch,x;
    while(1)
    {
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:printf("enter x");
                    scanf("%d",&x);
                    insert(x);
                    break;
            case 2:if(f==r)
                    printf("empty\n");
                    else
                    printf("%d\n",del());
                    break;
            case 3:disp();
                    break;
            case 4:exit(0);
        }
    }
}