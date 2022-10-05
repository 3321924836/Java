#include<stdio.h>
#include<string.h>
int main()
{
	char a[20],b[20];
	printf("Please input your first name:");
	scanf("%s",a);
	printf("Please input your last name:");
	scanf("%s",b);
	printf("%s %s\n%*d %*d\n\n",a,b,strlen(a),strlen(a),strlen(b),strlen(b));
	printf("%s %s\n%-*d %-*d\n",a,b,strlen(a),strlen(a),strlen(b),strlen(b));
	return 0;
} 