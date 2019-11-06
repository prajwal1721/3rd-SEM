#include<stdio.h>
#include<stdlib.h>
typedef struct  
{
    int d;
}ta;
int mx;
ta a[5];
void insert(ta aa);
void disp();
void pop();
int f=-1,r=-1;
int main()
{
    scanf("%d",&mx);
    int ch;
    ta val;
    do
    {

    printf("-------------------------\n");
    printf("press 1 for push\npress 2 for pop\npress 3 for display\npress 4 to exit\n");    
    scanf("%d",&ch);
            switch (ch)
    {
    case 1:printf("ENTER THE VAL\n");
            scanf("%d",&val.d);
            insert(val);
            break;
    case 2: pop();
            break;
    case 3:disp();break;
    case 4: exit(0);
    default:
        break;
    }
    }while (1);

}
void insert(ta aa)
{
    if(++r<mx)
    a[r]=aa;
    else
    {
        printf("QUEUE FULL\n");
    }
    
}
void pop()
{
    if(r>=++f+1);
    else
    {
        printf("QUEUE EMPTY\n");
    }
}
void disp()
{
    for(int i=f+1;i<r;i++)
        printf("%d ",a[i].d);
    printf("\n");
}
