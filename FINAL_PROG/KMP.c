
#include<string.h>
#include<stdio.h>
int fail[100];
void failure(char* pat);
int check(char*s,char*p);
int main()
{
    char s[100],pat[100];
    scanf("%s",s);
    scanf("%s",pat);
    failure(pat);
    printf("%d",check(s,pat));
}
void failure(char* pat)
{
    int i,pl=strlen(pat);
    fail[0]=-1;
    for(int j=1;j<pl;j++)
    {
        i=fail[j-1];
        while(i>=0 && pat[j]!=pat[i+1])
        {
            i=fail[i-1];
        }
        if(pat[j]==pat[i+1])
            fail[j]=i+1;
        else
            fail[j]=-1;
    }
}
int check(char*s,char*p)
{
    int ns=strlen(s),np=strlen(p);
    int i=0,j=0;
    while(i<ns && j<np)
    {
        if(s[i]==p[j])
            {
                i++;j++;
            }
        else if(j==0)
            i++;
        else
            j=fail[j-1]+1;
    }
}