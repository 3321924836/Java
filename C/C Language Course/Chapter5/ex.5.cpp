#include<stdio.h>
int main()
{
    int count=0,day,sum=0;
    scanf("%d",&day);
    while(count++<day)
    {
        sum+=count;
    }
    printf("%d\n",sum);
    return 0;
}