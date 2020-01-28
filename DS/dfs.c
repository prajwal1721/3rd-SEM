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
nptr V[20];
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
    if(!V[vj])
        V[vj]=n;
    else
        {
            for(p=V[vj];p->link;p=p->link);
            p->link=n;
        }
}
void DFS(int v)
{
    nptr p=V[v];
    printf("%d\t",v);
    visited[v]=TRUE;
    for(p=V[v];p; p=p->link)
    if(!visited[p->d])
            DFS(p->d);
}
int main()
{
    insert();
    for(int i=0;i<n;i++)
        visited[i]=0;
        	printf("\nNodes visited in DFS order\n");
    DFS(0);
	printf("\n");
	return 0;

}