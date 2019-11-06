#include<string.h>
#include<stdio.h>
int check(char*str ,char*pat);
int main()
{
    char str[200],pat[10];
    scanf("%s",str);
    // getchar();`
    scanf("%s",pat);
    printf("%s\n",str);    
    printf("%s\n",pat);
    printf("%d",check(str,pat));
}
int check(char*str ,char*pat)
{
    int lp=strlen(pat),ls=strlen(str);
    int em=lp-1,start=0,i,j=0;
    for(;em<ls;start++,em++)
    {
        i=start;
    if(str[em]==pat[lp-1])
        {for(j=0;str[i]==pat[j];j++,i++);
        if(j==em)
            return start;
    }
    }
    return -1;
}