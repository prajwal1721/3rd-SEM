#include<stdio.h>
int arr[50]={1,2,3,4,5,6,7,8,9};
int n=9;
int BS(int p);
int main()
{
    printf("%d",BS(1));
}
int BS(int p)
{
    int x=0;
    for(int b=n/2;b>=1;b/=2)
    {
        while(b+x<n && arr[b+x]<=p) x+=b;
    }
    if(arr[x]==p) return x+1;
    return -1;
}
 