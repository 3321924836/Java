#include<stdio.h>
int main()
{
	char a[10],b[10];
	printf("Please input your first name:");
	scanf("%s",a);
	printf("Please input your last name:");
	scanf("%s",b);
	printf("%s,%s",b,a);
	return 0;
}