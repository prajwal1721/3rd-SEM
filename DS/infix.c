#include<stdio.h>
typedef enum {lparen,rparen,times,div,mod,sum,sub,eos,operand}precedence;
int stkp[]={0,19,17,17,15,15,15,0};
int icp[]={20,19,17,17,15,15,15,0};
precedence stk[100];
int top=0;
char ex[100];
precedence pop()
{
    return stk[top--];
}
void push(precedence p)
{
    stk[++top]=p;
}
precedence getToken(char *s,int *n)
{
    *s=ex[(*n)++];
    switch(*s)
    {
        case '(':return lparen;
        case ')':return rparen;
        case '+':return sum;
        case '-':return sub;
        case '*':return times;
        case '/':return div;
        case '%':return mod;
        case '\0':return eos;
        default:return operand;
    }
}
void tok(precedence p)
{
switch(p)
	{
		case sum:printf("+"); break;
		case sub:printf("-");break;
	    case times:printf("*");break;
		case div:printf("/");break;
		case mod:printf("%%");break;
	}
}
void post()
{
    int n=0;
    char c;
    stk[0]=eos;
    precedence token;
	for(token=getToken(&c,&n);token!=eos;token=getToken(&c,&n))
    {
        if(token==operand)
            printf("%c",c);
        else if(token==rparen)
            {
                while(stk[top]!=lparen)
                    tok(pop());
                pop();
            }
        else 
            {
                while((stkp[stk[top]]>=icp[token]))
                    tok(pop());
                push(token);
            }

    }
        while(stk[top]!=eos)
            tok(pop());
}
int main()
{
  printf("Enter the infix exp\n");
  scanf("%s",ex);
  post();
}
