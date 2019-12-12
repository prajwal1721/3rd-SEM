    #include<stdio.h>
struct node
{
    int data;
    struct node* llink;
    struct node* rlink;
};
typedef struct node* treeptr; 
int search(int n,treeptr root)
{
    if(root)
    {
        if(root->data==n)
        {
            return 1;
        }
        else if(root->data>n)
            return search(n,root->llink);
        else if(root->data<n)
            return search(n,root->rlink);
    }
    return -1;
}
void insert(int x,treeptr *root)
{
    if(!(*root))
    {
     treeptr t=(treeptr)malloc(sizeof(struct node));
     t->data=x;
     t->llink=NULL;
     t->rlink=NULL;
    }
    else if((*root)->data>x)
    {
        return insert(x,&(*root)->llink);
    }
    else if((*root)->data<x)
    {
        return insert(x,&(*root)->rlink);
    }
    return root;
}