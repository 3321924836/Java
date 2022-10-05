#include<stdio.h>
int main()
{
    int low,up;
    printf("Please input the lower and upper limits: ");
    scanf("%d%d",&low,&up);
    for(int i=low;i<=up;i++)
    {
        printf("%d %d %d\n",i,i*i,i*i*i);
    }
    return 0;
}