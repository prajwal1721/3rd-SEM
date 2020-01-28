#include<stdio.h>
#include<stdlib.h>
int heap[20];
int n=0;
void disp();
int delete();
void insert( int x);
int main()
{
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
            case 3:disp();
                    printf("\n");
                    break;
            case 4:exit(0);
        }
    }
}
void insert( int x)
{
    int i=++n;
    while(i!=1 && x>heap[i/2])
    {
        heap[i]=heap[i/2];
        i=i/2;
    }
    heap[i]=x;
}
void disp()
{
    for(int i=1;i<=n;i++)
        printf("%d\t",heap[i]);
}
int delete()
{
    int p=heap[1];
    int temp,parent=1,child=2;
    temp=heap[n--];
    while(child<=n)
    {
        if(child<n && heap[child]<heap[child+1])
            child++;
        if(temp>heap[child])
            break;
        heap[parent]=heap[child];
        parent =child;
        child*=2;
    }
    heap[parent]=temp;
    return p;
}
