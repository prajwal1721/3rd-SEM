//segmentation fault 
#include<stdio.h>
#include<stdlib.h>
typedef struct 
{
    /* data */
    int key;
}element;
int capacity=1,front=0,rear=0;
element *queue;
element* new_queue;
void Queuefull();
int pop();
void push(element p);
void display();
void copy(element *a,element *b,element *c);
void Queuefull();
int main()
{
    element t;
    int choice;
    // printf("press 1for push\npress 2 for pop\npress 3 to display\npress 4to exit\n");
    // scanf("%d",&choice);
    queue=(element*)malloc(sizeof(element));
    while(1)
    {
        printf("press 1for push\npress 2 for pop\npress 3 to display\npress 4to exit\n");
    scanf("%d",&choice);
    switch(choice)
    {
        
        case 1:printf("enter value\n");
                scanf("%d",&t.key);
                push(t);
                break;
        case 2: printf("%d",pop());break;
        case 3:display();break;
        case 4: exit(0);
    
    }
    }
}
void display()
{
    for(int i=(front+1)%capacity;i!=(rear+1)%capacity;i=(i+1)%capacity)
        printf("%d\n", queue[i].key);
}
int pop()
{
    if(front==rear)
        {
            printf("queue is empty");
            return 0;
        }
    else
    {
        front=(front+1)%capacity;
        return queue[front].key;
    }
}
void push(element p)
{
    if((rear+1)%capacity==front)
        Queuefull();
        rear=(rear+1)%capacity;
        queue[rear]=p;
}
void Queuefull()
{
     new_queue=(element*)malloc(sizeof(*queue)*2*capacity);
 printf("QUEUEFULL cap::%d",2*capacity);
      int start=(front+1)%capacity;
    if(start<2)
        copy(queue+start,queue+start+capacity-1,new_queue);
    else
        {
        copy(queue+start,queue+capacity,new_queue);
        copy(queue,queue+rear+1,new_queue+capacity-start);        

        }
        front=2*capacity-1;
        rear=capacity-2;
        capacity=2*capacity;
    free(queue);
        queue=new_queue;
}
void copy(element *a,element *b,element *c)
{
    int i=0;
    while(a<b)
    {
        *(c+i)=*a;
        i++;
    }
}