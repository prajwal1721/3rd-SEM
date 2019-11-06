#include<stdlib.h>
#include<stdio.h>
typedef struct 
{
    /* data */
    int d;
}t;
//t stack[85];
int top=-1;
t* insert(t n,t*a);
t*  pop(t*a);
void disp(t*a);
int main()
{
    t *stack;
    stack=(t*)malloc(sizeof(t));
    int ch;t val;
    printf("START\n");
    // scanf("%d",&size);
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
            stack=insert(val,stack);
            break;
    case 2:stack=pop(stack);
            break;
    case 3:disp(stack);break;
    case 4: exit(0);
    default:
        break;
    }
    }while (1);
    {
        /* code */
    }
    
}
t* insert(t n,t*a)
{
   a=(t*)realloc(a,sizeof(t)*(top+2));
   a[++top].d=n.d;
   return a; 
}
t* pop(t*a)
{
    t l;l.d=-1;
    if(top==-1)printf("STACK UNDERFLOW\n");
    else if(top==0) top--;
    else {top--;a=(t*)realloc(a,sizeof(t)*top);}
    return a;
}
void disp(t *a)
{
    for(int i=top;i>=0;i--)
        printf("i:%d ::%d\n",i,a[i].d);
    printf("\n");
    printf("-------------------------\n");
}