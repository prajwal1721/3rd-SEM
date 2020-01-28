#include<stdio.h>
#include<stdlib.h>
#define MAX 10
typedef struct 
{
    int d;
}element;
typedef struct
{
    element data;
    struct node* link;
}node;
typedef node* listptr;
listptr stk[10];
// int top[10];
element pop(int i)
{
    element e;
    e=stk[i]->data;
    listptr t=stk[i];
    stk[i]=stk[i]->link;
    free(t);
    return e;
}
void disp(int i)
{
    listptr t;
    t=stk[i];
    if(stk[i])
    while (t)
    {
        printf("%d\n",t->data.d);
        t=t->link;
    }
    else
        printf("empty\n");
    
}
void push(int i,element e)
{
    listptr n=(listptr)malloc(sizeof(node));
    n->data=e;
    n->link=stk[i];
    stk[i]=n;
}
int main()
{
    for(int i=0;i<MAX;i++)
    {
        stk[i]=NULL;
    }
    element e;
    int ch,i;
    while (1)
    {
        printf("Enter:\n\t1 for push\n\t2 for pop\n\t3for display\n\t4 to exit\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:printf("Enter stack no and data\n");
                    scanf("%d%d",&i,&(e.d));
                    push(i,e);
                    break;
            case 2:printf("Enter stack no\n");
                   scanf("%d",&i);
                    pop(i);
                    break;
            case 3:printf("Enter stack no\n");
                   scanf("%d",&i);
                   disp(i);
                    break;                   
            case 4: exit(0);
        }
    }
    
}

