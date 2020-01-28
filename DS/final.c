#include <stdio.h>
#include<string.h>
#include<stdlib.h>
void comp();
int S1=0,S2=0,n,count=0,c1=0,c2=0;
long long int res[50000],res2[50000];
void combinationUtil(long long int arr[], int data[], int start, int end, 
					int index, int r); 
void combinationUtil1(long long int arr[], int data[], int start, int end,int index, int r) ;
void printCombination1(long long int arr[], int n, int r); 

void printCombination(long long int arr[], int n, int r) 
{ 
     int data[r]; 
	combinationUtil(arr, data, 0, n-1, 0, r); 
} 

void combinationUtil(long long int arr[],    int data[], int start, int end, 
					int index, int r) 
{ 
	if (index == r) 
	{ c1=0;
        res[S1]=data[0];
		for (int j=1; j<r; j++) 
			{
                res[S1]^=data[j];
            }
            c1=r; 
		return; 
	} 

	for (int i=start; i<=end && end-i+1 >= r-index; i++) 
	{ 
		data[index] = arr[i]; 
		combinationUtil(arr, data, i+1, end, index+1, r); 
	} 
} 

// Driver program to test above functions 
int main() 
{ 
        int y;
        long long int arr[1000000],*a1,*a2 ;
    scanf("%d",&y);
    for(int l=0;l<y;l++)
    {
        scanf("%d",&n);
        for(int i=0;i<n;i++)
            scanf("%lld",&arr[i]);
         for(int w=1;w<n;w++)   
            {
                for(int q=1;q<=w+1;q++)
                {
                    S1=0;S2=0;
                    printCombination(arr,w , q);
                    printCombination1(arr+w,n-w ,q);
                    comp();
                }
            }       
        printf("%d",count-1);

    }
}

void printCombination1(long long int arr[], int n, int r) 
{ 
     int data[r]; 
	combinationUtil1(arr, data, 0, n-1, 0, r); 
} 

void combinationUtil1(long long int arr[],    int data[], int start, int end, 
					int index, int r) 
{ 
	if (index == r) 
	{ c2=0;
        res2[S2]=data[0];
		for (int j=1; j<r; j++) 
			{
                res2[S2]^=data[j];
            }
            c2=r; 
		return; 
	} 

	for (int i=start; i<=end && end-i+1 >= r-index; i++) 
	{ 
		data[index] = arr[i]; 
		combinationUtil1(arr, data, i+1, end, index+1, r); 
	} 
} 


void comp()
{
    for(int n1=0;n1<c1;n1++)
    for(int n2=0;n2<c2;n2++)    
        if(res[n1]==res2[n2])
        {
            count++;
        }
}