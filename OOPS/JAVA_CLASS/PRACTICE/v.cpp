#include <iostream>
#include <vector>
#include <algorithm>
#include <cmath>
#include <vector>
#include <cstdio>
#include<ctype.h>
#include<string.h>
using namespace std;

void printbill(vector<string> & items, vector<double> & prices, vector<int> & discounts)
{
    double total = 0;
    int n=prices.size();
    vector<float>fin(n);
    for(int i=0;i<n;i++)
    {
        fin[i]=(float)(100-discounts[i])*prices[i]/100;
         fin[i] = (int)(fin[i] * 100 + .5); 
   fin[i]=(float)fin[i] / 100; 
        total+=fin[i];
    }
    for(int i=0;i<n-1;i++)
    {
      for(int j=0;j<n-1;j++)
        {
           if(fin[j]<fin[j+1])  
           {
               string sa;
               float s;
            sa=items[j];
              items[j]=items[j+1];
             items[j+1]=sa;
               s=fin[j];
               fin[j]=fin[j+1];
               fin[j+1]=s;
           }
		}
	for(int j=0;j<n-1;j++)
        {
        if(fin[j]==fin[j+1])
          {
              tolower(items[j].at(0));
              tolower(items[j+1].at(0));
              if(items[j+1].at(0)<items[j].at(0))
             {
                  string sa;
              sa=items[j];
              items[j]=items[j+1];
             items[j+1]=sa;
              }
          }
       }
    }
    for(int ja=0;ja<n;ja++)
    {
        cout<<items[ja];
       printf(" %0.2lf\n",fin[ja]);
    }
    printf("Total %.02f\n", total);
}

int main()
{
    int n;
    cin >> n;

    vector<string> items(n);
    vector<double> prices(n);
    vector<int> discounts(n);

    for (int i = 0; i < n; ++i) {
        cin >> items[i] >> prices[i] >> discounts[i];
    }

    printbill(items, prices, discounts);

    return 0;
}
/*float rounda(float var) 
{ 
   
    float fin[i] = (int)(fin[i] * 100 + .5); 
   fin[i]=(float)fin[i] / 100; 
} */