#include<stdio.h>
typedef struct 
{
    int key;
}exp;
typedef enum {lpredecence,rprecedence,times,divide,sum,mod,sub,oef,operand}precedence;
int eval(char*s);
precedence getToken(char*c,int *n);
int top=-1;
char s[1000];
exp e[100];
int pop();
void push(int n);
int  main()
{
    int ans;
    printf("enter the postfix experssion\n");
    scanf("%s",s);
    ans=eval(s);
    printf("tne answer is:%d",ans);
}
int eval(char*s)
{
    precedence token ;
    char symbol;
    int n=0,op1,op2;
    token=getToken(&symbol,&n);
while(token!=oef)
    {
        if(token==operand)
    {
        push(symbol-48);
    }
    else
    {
        op2=pop();
        op1=pop();
        switch(token)
        {
            case sum: push(op1+op2);break;
            case sub: push(op2-op1);break;
            case times: push(op1*op2);break;
            case divide: push(op2/op1);break;
            case mod: push(op2%op1);break;
        }
   }
    token=getToken(&symbol,&n);
    }
    return pop();
}
precedence getToken(char*c,int *n)
{
    *c=s[(*n)++];
    switch (*c)
    {
        case '+':return sum;
        case '-':return sub;
        case '*':return times;
        case '/':return divide;
        case '%':return mod;
        case '\0':return oef;        
        default:return operand;
    }
}
void push(int n)
{
    e[++top].key=n;
}
int pop()
{
    if(top!=-1)
        return e[top--].key;
}
