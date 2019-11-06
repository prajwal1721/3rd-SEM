#include<stdio.h>
#include<stdlib.h>
typedef struct{
    int key;
}element;
void insert(element item);
element delete();
void queuefull();
void display();
void copy(element *a,element *b,element *c);
element *q,*nq;
int cp=1,f=0,r=0;
void main()
{
    int n;
    element e,p;
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
    case 3:display();
        break;
    case 4:exit(0);
    default:printf("WRONG CHOICE\n");
    }
    }
}
void insert(element item)
{
    if(f==(r+1)%cp)
    {
    nq=(element*)malloc(2*cp*sizeof(element));
    printf("quefull\n");
    printf("cap is %d\n",cp);
    int start=(f+1)%cp;
        if(start==0||start==1)
            copy(q+start,q+cp+start-1,nq);
        else
        {
            copy(q+start,q+cp,nq);
            copy(q,q+r+1,nq+cp-start);
        }
    r=cp-2;
    f=2*cp-1;
    cp=cp*2;
    free(q);
    q=nq;
    }   
    r=(r+1)%cp;
    q[r]=item;
}
void copy(element *a,element *b,element *c)
{
    int i=0;
    while(a<b)
    {
    c[i]=*a;
    a++;
    i++;
    }
}
element delete()
{
    f=(f+1)%cp;
    return q[f];
}
void display()
{
    int j;
    for(j=(f+1)%cp;j!=(r+1)%cp;j=(j+1)%cp)
    {
        printf("%d  ",q[j].key);
    }
    printf("\n");
}   