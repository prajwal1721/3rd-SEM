#include<stdio.h>
#include<stdlib.h>
#define max 20
struct stk
{
    int n;
    struct stk* link;
};
typedef struct stk* stkptr;
stkptr stack[max];
void disp(int i);
void NUL();
int pop(int i);
void push(int i,int x);
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
                push(i,x);
                break;
            case 2:;
                scanf("%d",&i);
                    printf("%d",pop(i));
                break;
            case 3:
                scanf("%d",&i);
                    disp(i);
                    printf("\n");
                    break;
            case 4:exit(0);
        }
    }
}
void NUL()
{
    for(int i=0;i<max;i++)
        stack[i]=NULL;
}
void push(int i,int x)
{
    stkptr p=(stkptr)malloc(sizeof(struct stk));
    p->n=x;
    p->link=stack[i];
    stack[i]=p;
}
int pop(int i)
{
    int x;
    stkptr p;
    p=stack[i];
    stack[i]=p->link;
    x=p->n;
    free(p);
    return x;
}
void disp(int i)
{
    stkptr p=stack[i];
    while(p)
    {
        printf("%d",p->n);
        p=p->link;
    }
}