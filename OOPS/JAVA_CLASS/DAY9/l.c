#include<stdio.h>
void main()
{
    char ch ='a'+'0';
    switch(ch)
    {
        case '1': printf("hi");
        case 'a'+'0':printf("DIEN");
    }
    //return 0;
}