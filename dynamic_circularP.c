#include<stdio.h>
#include<stdlib.h>
typedef struct
{
    int key;
}element;
int f=0,r=0;
int cap=1;
element *q;
element delete();
void insert(element e);
void disp();
void copy(element*,element*,element*);
int main()
{
    int n;
    element p,e;
    q=(element*)malloc(sizeof(element));
    while(1)
    {
     printf("1:insert\t2:delete\t3:display\t4:exit\n");
    scanf("%d",&n);
    switch(n)
    {
    case 1:printf("enter the element\n");
        scanf("%d",&e.key);
        insert(e);
        break;
    case 2:if(f==r)
        printf("empty\n");
        else
        {p=delete();
        printf("deleted key is %d\n",p.key);}
        break;
    case 3:disp();
        break;
    case 4:exit(0);
    default:printf("WRONG CHOICE\n");
    }    
    }
}
element delete()
{
    f=(f+1)%cap;
    return q[f];
}
void insert(element e)
{
    element* newq;
    if((r+1)%cap==f)
    {
        printf("Queuefull\n");
        newq=(element*)malloc(sizeof(element)*cap*2);
        int start =(f+1)%cap;
        if(start==1 || start==0)
            copy(q+start,q+start+cap-1,newq);
        else
            {
                copy(q+start,q+cap,newq);
                copy(q,q+r+1,newq+cap-start);
            }
        f=2*cap-1;
        r=cap-2;
        cap*=2;
        free (q);
        q=newq;
    }
    r=(r+1)%cap;
    q[r]=e;
}
void disp()
{
    int qp=(f+1)%cap;
    for(int i=qp;i!=(r+1)%cap;i=(i+1)%cap)
        printf("%d ",q[i].key);
}
void copy(element *a,element *b,element*c)
{
    int i=0;
    while(a<b)
    {
        *(c+i)=*a;
        a++;i++;
    }
}