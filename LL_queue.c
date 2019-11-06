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
listptr front[MAX],rear[MAX];
element pop(int i)
{
    element e;
    e=front[i]->data;
    listptr t=front[i];
    front[i]=front[i]->link;
    free(t);
    return e;
}
void push(int i, element e)
{
    listptr n=(listptr)malloc(sizeof(node));
    n->data=e;
    n->link=NULL;
    if(!rear[i])
        {
            front[i]=rear[i]=n;
        }
    else
            {
                rear[i]->link=n;
                rear[i]=n;
            }
}
void disp(int i)
{
    listptr t=front[i];
    while(t)
    {
        printf("%d\n",t->data.d);
        t=t->link;
    }
}
int main()
{
    for(int i=0;i<MAX;i++)
    {
        rear[i]=front[i]=NULL;
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
                    if (rear[i]!=front[i])                  
                        pop(i);
                    else
                        printf("EMPTY\n");
                    break;
            case 3:printf("Enter stack no\n");
                   scanf("%d",&i);
                   disp(i);
                    break;                   
            case 4: exit(0);
        }
    }    
}
