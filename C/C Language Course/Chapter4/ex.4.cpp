#include<stdio.h>
int main()
{
	char n[10];
	float h;
	printf("Please input your name:");
	scanf("%s",n);
	printf("Please input your height in inches:");
	scanf("%f",&h);
	printf("%s, you are %.3f feet tall\n",n,h/12);
	return 0;
}