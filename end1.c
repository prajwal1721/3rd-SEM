#include<stdio.h>
#include<string.h>
int end(char*str,char*pat);
int main()
{
    char str[100],pat[100];
    printf("ENTER THE STRING\n");
    scanf("%s",str);
    printf("ENTER THE PAT\n");
    scanf("%s",pat);
    int p=end(str,pat);
    if(p!=-1)printf("FOUIND AT INDEX %d\n",p);
    else    printf("NOT FOUND\n");
}
int end(char*str,char*pat)
{
    int ls=strlen(str),lp=strlen(pat),start=0,i,j,em;
    em=lp-1;
    for(;em<ls;start++,em++)
    {
        if(str[em]==pat[lp-1])
        {
            i=start;
            for(j=0;str[i]==pat[j];i++,j++);
            if(em==j)
            return start;
        }
    }
    return -1;
}