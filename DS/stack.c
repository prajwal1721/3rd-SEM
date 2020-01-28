#include<stdlib.h>
#include<stdio.h>
typedef struct 
{
    /* data */
    int d;
}t;
t stack[85];
int top=-1;
int size;
void insert(t n);
t  pop();
void disp();
int main()
{
    int ch;t val;
    printf("ENTER THE SIZE\n");
    scanf("%d",&size);
    // printf("press 1 for push\npress 2 for pop\npress 3 for display\npress 4 to exit\n");
    do
    {
    printf("-------------------------\n");
    printf("press 1 for push\npress 2 for pop\npress 3 for display\npress 4 to exit\n");    
    scanf("%d",&ch);
        switch (ch)
    {
    case 1:printf("ENTER THE VAL\n");
            scanf("%d",&val.d);
            insert(val);
            break;
    case 2:printf("THE POPED ELEMENT:%d\n",pop().d);
            break;
    case 3:disp();break;
    case 4: exit(0);
    default:
        break;
    }
    }while (1);
    {
        /* code */
    }
    
}
void insert(t n)
{
    if(top>=size-1)printf("STACK OVERFLOW\n");
    else {stack[++top]=n;}
}
t pop()
{
    t l;l.d=-1;
    if(top==-1)printf("STACK UNDERFLOW\n");
    else {top--;return stack[top+1];}
    return l;
}
void disp()
{
    for(int i=top;i>=0;i--)
        printf("%d\n",stack[i].d);
    printf("\n");
    printf("-------------------------\n");

}