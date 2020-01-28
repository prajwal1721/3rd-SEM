#include<stdio.h>
int main()
{
    int ind,n,cnt=0,max,j;
    scanf("%d",&n);
    int arr[100],c[100];
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);

    }
      for(int j=1;j<n;j++)
    {
        if(arr[0]==arr[j])
        {
            c[0]++;ind=1;
        }
    }
    max=c[0];
    for(int i=1;i<n;i++)
    {
        for( j=0;j<n;j++)
    {
        if(arr[i]==arr[j])
        {
            c[i]++;
        }
    }
    }
    max=c[0];

            //printf("%d\n",c[0]);
    for(int i=1;i<n;i++)
    {
           // printf("%d\n",c[i]);
    if(max>=c[i])
        {
            max=c[i];
            ind=i;
        }
    }
max=n-max-1;
   
   
    for(int j=0;j<n;j++)
    {
       for(int i=0;i<n-1;i++)
       {
        if((arr[ind])==arr[i+1])
        {
            cnt=cnt;
        }
        else if((arr[i]-1)==arr[ind])
        {
            cnt++;
            arr[i]=arr[i]-1;
        }
        else if((arr[i]+1)==arr[ind])
        {
            cnt++;arr[i]=arr[i]+1;
        }
        if(arr[i]==0)
        {
            arr[i]=arr[n-1];
            n=n-1;
        }

    }
    }

    printf("%d",cnt);
}