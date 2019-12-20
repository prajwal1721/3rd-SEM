#include<stdio.h>
#include<stdlib.h>
#define COMP(x,y) (x>y)?1:(x==y)?0:-1
typedef struct 
{
    int c,e;
}element;
typedef struct 
{
    element t;
    struct node* link;
}node;
typedef node* listptr;
listptr add(listptr a,listptr b);
void disp(listptr a);
void attach(int c,int e,listptr* ec);
void create(listptr a,int e,int c);
listptr add(listptr a,listptr b)
{
    int done=1,sum;
    listptr cc,sa;
    sa=a;
    cc=(listptr)malloc(sizeof(node));
    cc->t.e=-1;
    cc->link=cc;
    a=a->link;
    b=b->link;
    do
    {
        switch (COMP(a->t.e,b->t.e))
        {
            case 1:
                printf("in 1");
                create(cc,a->t.e,a->t.c);
                a=a->link;            
                break;
        
            case -1:
                printf("on");
                create(cc,b->t.e,b->t.c);
                b=b->link;            
                break;
            case 0:
                printf("in 0");
                if(sa==a)
                {
                    printf("done ");
                    done=0;
                }
                else
                {
                    sum=a->t.c+b->t.c;
                    if(sum)
                    {
                        create(cc,a->t.e,sum);
                        b=b->link;
                        a=a->link;
                    }
                }
                break;
        default:
            break;
        }
    }while(done);
    return cc;
}
void create(listptr a,int e,int c)
{
    listptr tt,n=(listptr)malloc(sizeof(node));
    tt=a;
    n->t.e=e;
    n->t.c=c;
    while(tt->link!=a)
        tt=tt->link;
    n->link=tt->link;
    tt->link=n;
}
void disp(listptr a)
{
    listptr t=a;
    t=t->link;
    while(t->link!=a)
    {
        printf("%dX^%d+",t->t.c,t->t.e);
        t=t->link;
    }
        printf("%dX^%d\n",t->t.c,t->t.e);
}
void main()
{
    int na,nb;
    printf("Enter number of terms in a and b");
    scanf("%d%d",&na,&nb);
    listptr a,b;
    a=(listptr)malloc(sizeof(node));
    a->t.e=-1;
    b=(listptr)malloc(sizeof(node));
    b->t.e=-1;
    b->link=b;
    a->link=a;
    int e,c;
    for(int i=0;i<na;i++)
    {
        scanf("%d%d",&c,&e);
        create(a,e,c);
    }
    // disp(a);
    for(int i=0;i<nb;i++)
    {
        scanf("%d%d",&c,&e);
        create(b,e,c);
    }
    // disp(b);
    listptr pc=add(a,b);
    disp(pc);
    printf("\nEND\n");
}