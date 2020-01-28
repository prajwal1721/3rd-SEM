#include<iostream>
using namespace std;
     void main( )
    {
        int test,bot,typ;
        cin>>test;
        for(int i=0;i<test;i++)
    {  
        int count=0,sum=0;
        cin>>typ>>bot;
        int arr[typ];
        for(int j=0;j<typ;j++)
        {
        cin>>arr[j];
        }
            for(int j=0;j<typ;j++)
         {
             
            while(arr[j]>0)
            { if(arr[j]>0)
             {
                 if(arr[j]%bot==0)
                 {arr[j]=arr[j]-bot;}
                 else
                 {arr[j]=arr[j]-(arr[j]%bot);}
                 count++;
             }
            }
         
         }
         if(count%2==0)
        cout<<count/2;
         else
         cout<<((count+1)/2);
    }
    }
