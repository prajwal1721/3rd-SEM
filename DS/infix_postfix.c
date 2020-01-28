#include<stdio.h>
typedef enum {lparen,rparen,sum,minus,times,divide,mod,operand,eos}precedence;
precedence getToken(char *s,int *n);
char s[1000];
    int top=0;
precedence stk[100];
char tok(precedence t);
precedence pop();
void printfun();
int stp[]={0,19,13,13,17,17,17,0};
int ip[]={20,19,13,13,17,17,17,0};
int main()
{
  printf("Enter the infix exp\n");
  scanf("%s",s);
  printfun();
}
precedence getToken(char *symbol,int *n)
{
    *symbol=s[(*n)++];
    switch (*symbol)
    {
    case '+': return sum;
    case '-': return minus;
    case '/': return divide;
    case '%': return mod;
    case '*': return times;
    case '\0':return eos;
    default: return operand;
    }
}
void printfun()
{
    precedence token;
    int n=0;
    char symbol;
    stk[0]=eos;
    for(token=getToken(&symbol,&n);token!=eos;token=getToken(&symbol,&n))
    {
        if(symbol==operand)
        {
            printf("%c",symbol);
        }
        else if(token==rparen)
        {
            while (stk[top]!=lparen)
            {
                printf("%c",tok(pop()));
            }
            pop();
        }
        else 
        {
            while((stp[stk[top]]>=ip[token]))
                printf("%c",tok(pop()));
            stk[++top]=token;
        }
    }
    while(stk[top]!=eos)
        printf("%c",tok(pop()));
}
precedence pop()
{
    return stk[top--];
}
char tok(precedence t)
{
    switch (t)
    {
    case sum: return '+';
    case minus: return '-';
    case times: return '*';
    case divide: return '/';
    case mod: return '%';
    }
}