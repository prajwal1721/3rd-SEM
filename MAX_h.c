#include<stdio.h>
int heap[20];
int n=0;
int  main()
{

}
void insert(int x)
{
    int i=++n;
    while(i!=1 && heap[i/2]<x)
        heap[i]=heap[i/2];
    heap[i]=x;
}
int del()
{
    int temp=heap[n--];
    int parent=1,child=2;
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
}