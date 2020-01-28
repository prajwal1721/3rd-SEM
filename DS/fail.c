
#include<string.h>
#include<stdio.h>
int fail[100];
int f(char *p);
int main()
{
    char a[100],pat[50];
    int n;
        scanf("%s",a);
        scanf("%s",pat);
    n=strlen(a);
f(pat);
for(int i=0;i<strlen(pat);i++)printf("%c:%d\n",pat[i],fail[i]);
}
int f(char *p)
{
    int i,n=strlen(p);
    fail[0]=-1;
    for(int j=1;j<n;j++)
    {
        i=fail[j-1];
        while (p[j]!=p[i+1]&& i>=0)
        {
            i=-1;
            // i=fail[i];
        }
        if(p[j]==p[i+1]) fail[j]=i+1;
        else fail[j]=-1;
    }

}