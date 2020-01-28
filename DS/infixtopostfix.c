#include<stdio.h>
int sp[]={0,19,14,14,17,17,17,0};
int icp[]={20,19,14,14,17,17,17,0};
typedef enum
{
	lparen,rparen,plus,minus,times,divide,mod,eos,operand
}precedence;
void postfix();
void push(precedence token);
precedence pop();
precedence gettoken(char*,int*);
void printtoken(precedence p);
precedence stack[20];
char expr[20];
int top=0;
void main()
{
	printf("Enter the infix expr\n");
	scanf("%s",expr);
	postfix();
	printf("\n");
}
void postfix()
{
	char symbol;
	precedence token;
	int n=0;top=0;
	stack[0]=eos;
	for(token=gettoken(&symbol,&n);token!=eos;token=gettoken(&symbol,&n))
	{
		if(token==operand)
			printf("%c",symbol);
		else if(token==rparen)
		{
			while(stack[top]!=lparen)
				printtoken(pop());
			pop();
		}
		else
		{
			while(sp[stack[top]]>=icp[token])
				printtoken(pop());
			push(token);
		}
	}
	while(stack[top]!=eos)
		printtoken(pop());
}
void push(precedence token)
{
	stack[++top]=token;
}
precedence pop()
{
	return stack[top--];
}
precedence gettoken(char *s,int *n)
{
	*s=expr[(*n)++];
	switch(*s)
	{
		case '+':return plus;
		case '-':return minus;
		case '*':return times;
		case '/':return divide;
		case '%':return mod;
		case '(':return lparen;
		case ')':return rparen;
		case '\0':return eos;
		default:return operand;
	}
}
void printtoken(precedence p)
{
	switch(p)
	{
		case plus:printf("+");
			  break;
		case minus:printf("-");
                          break;
	       case times:printf("*");
                          break;
		case divide:printf("/");
                          break;
		case mod:printf("%%");
                          break;
	}
}
