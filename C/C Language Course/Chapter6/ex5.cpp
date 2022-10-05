#include<stdio.h>
int main()
{
    char a;
    scanf("%c",&a);
    for(int i=1;i<=5;i++)
    {
        for(int j=1;j<=5-i;j++)printf(" ");
        int j;
        for(j=1;j<=i;j++)printf("%c",a+j-1);
        for(j=j-2;j>=1;j--)printf("%c",a+j-1);
        for(j=1;j<=5-i;j++)printf(" ");
        printf("\n");
    }
    return 0;
}