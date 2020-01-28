#include<stdio.h>
#include<stdlib.h>
#define max 20
struct q
{
    int n;
    struct q* link;
};
typedef struct q* qptr;
qptr front[max],rear[max];
void disp(int i);
void NUL();
int delete(int i);
void insert(int i,int x);
int main()
{
    int ch,i,x;
    NUL();
    while(1)
    {
        scanf("%d",&ch);
     switch(ch)
        {
            case 1:printf("enter x");
                scanf("%d%d",&i,&x);
                insert(i,x);
                break;
            case 2:;
                scanf("%d",&i);
                    if(front[i])
                    printf("%d",delete(i));
                    else
                        printf("empty");
                break;
            case 3:
                scanf("%d",&i);
                    if(front[i])
                    disp(i);
                    else
                        printf("empty");
                    printf("\n");
                    break;
            case 4:exit(0);
        }
    }
}
void NUL()
{
    for(int i=0;i<max;i++)
        front[i]=rear[i]=NULL;
}
void insert(int i,int x)
{
    qptr p=(qptr)malloc(sizeof(struct q));
    p->n=x;
    p->link=NULL;
    if(rear[i])
    {
        rear[i]->link=p;
    }
    else
    {
        front[i]=p;
    }
    rear[i]=p;
}
int delete(int i)
{
    int x;
    qptr p;
    p=front[i];
    front[i]=p->link;
    x=p->n;
    free(p);
    return x;
}
void disp(int i)
{
    qptr p=front[i];
    while(p)
    {
        printf("%d",p->n);
        p=p->link;
    }
}