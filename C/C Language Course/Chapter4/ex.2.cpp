#include<stdio.h>
int main()
{
	char a[10];
	printf("Please input your first name:");
	scanf("%s",a);
	printf("\"%s\"\n",a);
	printf("\"%20s\"\n",a);
	printf("\"%-20s\"\n",a);
	printf("\"%s   \"",a);
	return 0;
}