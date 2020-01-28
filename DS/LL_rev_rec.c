#include<stdio.h>
#include<stdlib.h>
struct node 
{
    int d;
    struct node *ptr;
};
void create(struct node ** head,int data);
void disp(struct node*head);
struct node* rec_rev(struct node*head)
{
    if(head=NULL)
        return NULL;
    if(head->ptr)
        return  head;
    struct node* second=head->ptr;
    head->ptr=NULL;
    struct node*revrest=rec_rev(second);
    second->ptr=head;
    return  revrest;
} 
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
//  head= rec_rev(head); segmentation falut check
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

void disp(struct node*head)
{
    while(head)
    {
        printf("%d\t",head->d);
        head=head->ptr;
    }
    printf("\n");
}
