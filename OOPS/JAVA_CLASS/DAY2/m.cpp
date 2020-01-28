#include<iostream>
#include<math.h>
#include<stdio.h>
using namespace std;
int main()
{
    int arr[8],sc[500];
    int c[500],q[300];
    for(int i=1;i<=300;i++)
    {
      cin>>sc[i];
      c[i]=0;
    }
    for(int i=1;i<=300;i++)
    {
       for(int j=0;j<8;j++)
       {
          arr[j]=sc[i]%10;
          c[i]=c[i]+pow(2,i-1)*arr[j];
           sc[i]=sc[i]/10;
       }
       if(c[i]==48)
       {
           c[i]=0;
       }
       else  if(c[i]==49)
       {
           c[i]=1;
       }
         else  if(c[i]==50)
       {
           c[i]=2;
       }  
       else  if(c[i]==51)
       {
           c[i]=3;
       } 
        else  if(c[i]==52)
       {
           c[i]=4;
       }  
       else  if(c[i]==53)
       {
           c[i]=5;
       }  
       else  if(c[i]==54)
       {
           c[i]=6;
       }  
       else  if(c[i]==55)
       {
           c[i]=7;
       }
         else  if(c[i]==56)
       {
           c[i]=8;
       }
         else  if(c[i]==57)
       {
           c[i]=9;
       }
    }
    int l=1;
    for(int k=1;;)
    {
        q[k]=c[l]*100+c[l+1]*10+c[l+2];
        l=l+3;
    }
    for(int i=1;i<100;i++)
    printf("%c",q[i]);
}