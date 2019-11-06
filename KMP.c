#include<stdio.h>
#include<string.h>
int failure[100];
int fail(char *pat);
int check(char *str,char *pat);
int main()
{
    char str[1000],pat[100];
    printf("enter the string\n");
    scanf("%s",str);
    printf("enter the pattern\n");
    scanf("%s",pat);
    fail(pat);
    int n=check(str,pat);
    if(n!=-1)
        printf("PAttern found at index %d\n",n);
    else
        printf("Pattern not found\n");
}

int fail(char *pat)
{
    int n=strlen(pat),i;
    failure[0]=-1;
    for(int j=1;j<n;j++)
    {
        i=failure[j-1];
        while (i>=0 && pat[j]!=pat[i+1])
            i=failure[i];
        if(pat[j]==pat[i+1])
            failure[j]=i+1;
        else
            failure[j]=-1;
    }
}
int check(char *str,char *pat)
{
    int i=0,j=0;
    int strl=strlen(str),patl=strlen(pat);
    while(i<strl && j<patl)
    {
        if(str[i]==pat[j])
        {
            i++;j++;
        }
        else if(j==0)
        {
            i++;
        }
        else
        {
            j=failure[j-1]+1;
        }
    }
    return (patl==j)?(i-patl):-1;
}