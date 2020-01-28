#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
    struct node*lptr,*rptr;
};
typedef struct node * listptr;
    listptr root; 
void displ_to_r();
void insert(int x);
int delete();
void dispr_to_l();
int main()
{
    root=(listptr)malloc (sizeof(struct node));
    root->data=-1;
    root->rptr=root->lptr=root;
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
            case 2:printf("%d",delete());
                break;
            case 3:dispr_to_l();
                    printf("\n");
                    break;
            case 4:displ_to_r();
                    printf("\n");
                    break;
            case 5:exit(0);
        }
    }
}
void insert(int x)
{
    listptr n=(listptr)malloc (sizeof(struct node ));
    n->data=x;
    n->lptr=root;
    n->rptr=root->rptr;
    root->rptr->lptr=n;
    root->rptr=n;
}
int delete()
{
    listptr tmep=root->rptr;
    root->rptr=root->rptr->rptr;
    int i=tmep->data;
    free(tmep);
    return i;
}
void dispr_to_l()
{
    listptr t=root->rptr;
    while(t!=root)
    {
        printf("%d",t->data);
        t=t->rptr;
    }
}
void displ_to_r()
{
    listptr t=root->lptr;
    while(t!=root)
    {
        printf("%d",t->data);
        t=t->lptr;
    }
}