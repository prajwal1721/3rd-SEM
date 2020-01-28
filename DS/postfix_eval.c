#include<stdio.h>
typedef struct
{
    int key;
}element;
int top=-1;
element e[10];
char s[100];
typedef enum {l_paren,r_paren,divide,times,mod,add,sub,operand,eof}precedence;
int pop();
precedence getToken(char *symbol,int *n);
int eval(char *s);
void push(int val);
int main()
{
    int ans;
    scanf("%s",s);
    ans=eval(s);
    printf("answer is : %d",ans);
}
int eval(char *s)
{
    int op1,op2,n=0;
    precedence token;
    char symbol;
    token=getToken(&symbol,&n);
    while(token!=eof)
    {
        // printf("in");
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
                case times: push(op1*op2);break;
                case add: push(op1+op2);break;
                case divide: push(op1/op2);break;
                case sub: push(op1-op2);break;
                case mod: push(op1%op2);break;
            }
            
        }
    token=getToken(&symbol,&n);
    }
    return pop();
}
precedence getToken(char *symbol,int *n)
{
    *symbol=s[(*n)];(*n)++;
    switch (*symbol)
    {
        case '+':return add;
        case '-':return sub;
        case '*':return times;
        case '/':return divide;
        case '%':return mod;    
        case '.':return eof;
        case '\0':return eof;
    default: return operand;
    }
}
void push(int val)
{
    e[++top].key=val;
}
int pop()
{
    return e[top--].key;
}