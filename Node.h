#include<stdio.h>
#include<stdlib.h>
struct node
{
    int d;
    struct node*link;
};
typedef struct node* linkptr;
void disp(linkptr head)
{
    while(head)
    {
        printf("%d\t",head->d);
        head=head->link;
    }
    printf("\n");
}
void create(linkptr*head,int data)
{
    linkptr new,t=(*head);
    new=(struct node*)malloc(sizeof(struct node));
    new->d=data;
    new->link=NULL;
    if(!*head)
    {
        *head=new;
    }
    else
    {
        while(t->link)
    {
        t=t->link;
    }
    t->link=new;
    }
}

