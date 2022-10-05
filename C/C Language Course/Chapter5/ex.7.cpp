#include<stdio.h>
int intpow(int a,int b)
{
	int s=1;
	for(int i=1;i<=b;i++)s*=a;
	return s;
}
int main()
{
	int a;
	printf("Please input a number:");
	scanf("%d",&a);
	printf("The cubed number of it is %d.\n",intpow(a,3));
	return 0;
} 