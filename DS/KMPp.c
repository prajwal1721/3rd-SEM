#include<stdio.h>
#include<string.h>
int fail[100];
int check(char *pat,char *str);
void failure(char *pat);
int main()
{
    char str[200],pat[200];
    scanf("%s",str);
    scanf("%s",pat);
    failure(pat);
    printf("%d:",check(pat,str));
}
void failure(char *pat)
{
    int i;
    int n=strlen(pat);
    fail[0]=-1;
    for(int j=1;j<n;j++)
    {
        i=fail[j-1];
        while(i>=0&& pat[1+i]!=pat[j])
            i=fail[i];
        if(pat[i+1]==pat[j])
            fail[j]=i+1;
        else
            fail[j]=-1;
    }
}
int check(char *pat,char *str)
{
    int sn=strlen(str),pn=strlen(pat),i=0,j=0;
    while(i<sn && j<pn)
    {
        if(pat[j]==str[i])
            {i++;j++;}
        else if(j==0)
            i++;
        else
            j=fail[j-1]+1;
    }
    return (j==pn)?(i-pn):-1;
}