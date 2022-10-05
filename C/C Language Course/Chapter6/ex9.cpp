#include<stdio.h>
float value(float a,float b)
{
    return (a-b)/a/b;
}
int main()
{
    float a,b;
    printf("Please input the two numbers: \n");
    while(scanf("%f%f",&a,&b)==2)
    {
        printf("%f\n",value(a,b));
        printf("Please input the two numbers: \n");
    }
    printf("Done.");
    return 0;
}