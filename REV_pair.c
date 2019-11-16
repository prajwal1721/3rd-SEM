#include<stdio.h>
#include<stdlib.h>
#include"Node.h"
void loop(linkptr *head,int n);
void rev(linkptr *head,int n);
void loop(linkptr *head,int n)
{
    linkptr t;
    int te=1;
    while( t)
    {
        if((te-1)%n==0)
        {
            rev(&t,n);
        }
        te++;
        t=t->link;
    }
}
void rev(linkptr *head,int n)
{
    int t=0;
    linkptr p,temp=*head;
    while( temp)
    {
        if(temp->link->link)
        {
            p=temp->link->link;
            temp->link->link=temp;
        }
        temp->link=p;
        t++;
        temp=temp->link;
    }
    // *head=temp;
}
int main()
{
    int ch,data,t=0;
    struct node*head=NULL;
    while (1)
    {
        scanf("%d",&ch);
        switch(ch)
        {
            case 1: 
                    scanf("%d", &data);
                    printf("in\n");
                    create(&head,data);
                    break;   
        default:goto l;
        }
    }
    l:
    disp(head);
    printf("Done hi");
    // disp(head);
    // loop(&head,2);
    rev(&head,2);
    disp(head);
}