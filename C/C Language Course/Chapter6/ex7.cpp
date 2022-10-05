#include<stdio.h>
#include<string.h>
int main()
{
    char a[100];
    int i=0;
    printf("Input: ");
    while(~scanf("%c",&a[i])&&a[i]!='\n')
        i++;
    a[i]='\0';
    for(int i=0;i<strlen(a);i++)
        printf("%c",a[i]);
    return 0;
}