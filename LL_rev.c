#include<stdio.h>
#include<stdlib.h>
struct node
{
    int d;
    struct  node* ptr;
};
void SWAP(struct node**head);
void rev_recursive(struct node **head);
void rev(struct node **head);
void disp(struct node*head);
void create(struct node ** head,int data);
int main()
{
int ch,data;
struct node*head=NULL;
while (1)
{
    scanf("%d",&ch);
    switch(ch)
    {
        case 1: scanf("%d", &data);
                create(&head,data);
                break;
        default:goto l;
    }
}
l:
    disp(head);
    // rev(&head);
    printf("done\n");
    // rev_recursive(&head);
    disp(head);
}
void create(struct node ** head,int data)
{
    struct node *new,*t=(*head);
    new=(struct node*)malloc(sizeof(struct node));
    new->d=data;
    new->ptr=NULL;
    if(!*head)
    {
        *head=new;
    }
    else
    {
        while(t->ptr)
    {
        t=t->ptr;
    }
    t->ptr=new;
    }
}
void rev(struct node **head)
{
    struct node *pre=NULL,*next=NULL,*t=*head;
    // next=NULL;
    // t=next->ptr;
    while(t)
    {
        pre=next;
        next=t;
        t=t->ptr;
        next->ptr=pre;
    }
    *head=next;
}
//check req
/*
void rev_recursive(struct node **head)
{
    int d;
    struct node *p=NULL,*t=*head;
    while(t)
    {
        rev_recursive(&t->ptr);
        if(t->ptr)
        SWAP(&t);
        t=t->ptr;
        disp(*head);
        printf("\n");
    }
}
*/

void disp(struct node*head)
{
    while(head)
    {
        printf("%d\t",head->d);
        head=head->ptr;
    }
    printf("\n");
}
void SWAP(struct node**head)
{
    struct node *t=*head;
    t=t->ptr;

    (*head)->ptr=t->ptr;
    t->ptr=*head;
    *head=t;
}
struct node* rec_rev(struct node*head)
{
    if(head==NULL)
        return NULL;
    if(head->ptr=NULL)
        return head;
    struct node *secNode=hea
}