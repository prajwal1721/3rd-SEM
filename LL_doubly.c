#include<stdio.h>
#include<stdlib.h>
struct node
{
    int data;
     struct node*pre,*next;
};
void insert(struct node**head,int d,int pos);
void disp(struct node* t);
void del(struct node **head,int pos);
int  main() 
{
    struct node *head=NULL;
    int ch,i,pos;
    while(1)
    {
        printf("\nchoice\n");
        scanf("%d",&ch);
        switch (ch)
        {
            case 1:scanf("%d%d",&pos,&i);
                    insert(&head,i,pos);
                    break;
            case 2:scanf("%d",&pos);
                    del(&head,pos);
                    break;
            case 3:disp(head);
                    break;
            case 4: exit(0);    
        }
    }

}
void insert(struct node**head,int d,int pos)
{
    int p=1;
    struct node *new,*t=*head;
    new=(struct node*)malloc (sizeof(struct node));
    new->data=d;
    if(pos==1)
    {
        new->pre=NULL;
        new->next=*head;
        if(*head)
        {
           (*head)->pre=new; 
            // return ;
        }
        (*head)=new;
    }
    else
    {
        while(p<pos-1 && t!=NULL)
        {
            p++;
            t=t->next;
        }
            if(t->next)
            {
                t->next->pre=new;
            }
            // t->next=new;
            new->next=t->next;
            new->pre=t;
            t->next=new;
    }
}
void disp(struct node* t)
{
//     while (t->next)
//     {
//         t=t->next;
//         /* code */
//     }
    
    while(t)
    {
        printf("%d\t",t->data);
        t=t->next;
    }
}
void del(struct node **head,int pos)
{
    int k=1;
    struct node*t;
    t=*head;
    if(pos==1)
    {
        *head=(*head)->next;
        free(t);
    }
    else
    {
        while(t && k<pos )
            {
                k++;
                t=t->next;
            }
            printf("%d",t->data);
            if(t->next)
                {
                    t->next->pre=t->pre;
                }
                    t->pre->next=t->next;
        free(t);
    }
}