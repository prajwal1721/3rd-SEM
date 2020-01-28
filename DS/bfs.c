#include<stdio.h>
#include<stdlib.h>
#define TRUE 1
#define FALSE 0
int visited[20];
int n;
 struct node
{
    int d;
    struct node* link;
};
typedef struct node* nptr;
nptr front,rear,V[20];
void create(int vi,int vj);
void insert()
{
    printf("Enter no of vertices\n");
    scanf("%d",&n);
 	for(int i=0;i<=n;i++)
        V[i]=NULL;
    int edge,vi,vj;
    printf("Enter no of edge\n");
    scanf("%d",&edge);
    for(int i=0;i<edge;i++)
    {
        scanf("%d%d",&vi,&vj);
        create(vi,vj);
        create(vj,vi);
    }
}
void create(int vi,int vj)
{
    nptr p,n=(nptr)malloc(sizeof(struct node));
    n->d=vi;
    n->link=NULL;
    if(V[vj]==NULL)
        V[vj]=n;
    else
        {
            for(p=V[vj];p->link;p=p->link);
            p->link=n;
        }
}
void addq(int vi )
{
    nptr p,n=(nptr)malloc(sizeof(struct node));
    n->d=vi;
    n->link=NULL;
    if(front==NULL)
    {
        front =n;
    }
    else
    rear->link=n;
    rear=n;
}
int deleteq()
{
    int p;
    nptr l;
    l=front;
    front=front->link;
    p=l->d;
    free(l);
    return p;
}
void BFS(int v)
{
    nptr p;
    
        addq(v);
        visited[v]=TRUE;
        printf("%d\t",v);
    while(front)
    {
        v=deleteq();
        for(p=V[v];p;p=p->link)
           {
                if(!visited[p->d])
                {
                    printf("%d\t",p->d);
                    visited[p->d]=TRUE;
                    addq(p->d);
                }
            
            }
    }
}

int main()
{
    insert();
    rear=front=NULL;
    for(int i=0;i<n;i++)
        visited[i]=0;
        	printf("\nNodes visited in DFS order\n");
    BFS(0);
	printf("\n");
	return 0;
}