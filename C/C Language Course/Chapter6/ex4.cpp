#include<stdio.h>
int main()
{
    int k='A';
    for(int i=1;i<=6;i++)
    {
        for(int j=1;j<=i;j++)
        {
            printf("%c",k);
            k++;
        }
        printf("\n");
    }
    return 0;
}