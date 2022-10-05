#include<stdio.h>
int main()
{
    float a,b;
    printf("Please input the two numbers: \n");
    while(scanf("%f%f",&a,&b)==2)
    {
        printf("%f\n",(a-b)/a/b);
        printf("Please input the two numbers: \n");
    }
    printf("Done.");
    return 0;
}