#include<stdio.h>
#include<stdlib.h>
struct node 
{
    int data;
    struct node * lptr,*rptr;
};
typedef struct node* nodeptr;
void disp(nodeptr root);
int search(nodeptr root,int x)
{
    if(root)
    {
    if(root->data==x)
        return 1;
    else if(root->data>x)
        return search(root->rptr,x);
    else if(root->data<x)
        return search(root->lptr,x);
    }
    return -1;
}
void insert(nodeptr *root,int x)
{
    if(!*root)
    {
        *root=(nodeptr)malloc(sizeof(struct node));
        (*root)->lptr=(*root)->rptr=NULL;
        (*root)->data=x;
    }
    else if((*root)->data>x)
    {
        insert(&((*root)->lptr),x);
    }
    else if((*root)->data<x)
    {
        insert(&((*root)->rptr),x);
    }
}
int main()
{
    int ch,x;
    nodeptr root= NULL;
    while(1)
    {
        printf("1:insert\t2:search\t3:display\n");
        scanf("%d",&ch);
        switch(ch)
        {
            case 1:printf("enter x");
                scanf("%d",&x);
                insert(&root,x);
                break;
            case 2:printf("enter x");
                scanf("%d",&x);
                search(root,x);
                break;
            case 3:disp(root);
                    break;
            case 4:exit(0);
        }
    }
}
void disp(nodeptr root)
{
    if(root)
    {
        disp(root->lptr);
        printf("%d",root->data);
        disp(root->rptr);
    }
}