#include<stdio.h>
int main()
{
    for(int i='F';i>='A';i--)
    {
        for(int j='F';j>=i;j--)
        printf("%c",j);
        printf("\n");
    }
    return 0;
}