#include<stdio.h>
typedef enum {lparen,rparen,times,div,mod,sum,sub,operand,eos}precedence;
int s[10];
char c[100];
int top=-1;
precedence getToken(char *symbol,int *n)
{
    *symbol=c[(*n)++];
    switch(*symbol)
    {
        case '+':return sum;
        case '-':return sub;
        case '*':return times;
        case '/':return div;
        case '%':return mod;
        case '\0':return eos;
        default:return operand;
    }
}

void push(int x){
    s[++top]=x;
}
int pop()
{
    return s[top--];
}
int eval()
{
    int op1,op2;
    int n=0;char ch;
    precedence p;
    p=getToken(&ch,&n);
    while(p!=eos)
    {
        if(p==operand)
            push(ch-'0');
        else
        {
            op2=pop();
            op1=pop();
            switch(p)
            {
                case sum:push(op1+op2);break;
                case sub:push(op1-op2);break;
                case times:push(op1*op2);break;
                case div:push(op1/op2);break;
                case mod:push(op1%op2);break;
            }
        }
        p=getToken(&ch,&n);
    }
    return pop(); 
}
int main()
{
    scanf("%s",c);
    printf("%d",eval());
}