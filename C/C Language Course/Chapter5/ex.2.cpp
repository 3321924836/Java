#include<stdio.h>
int main()
{
	int n;
	printf("Plz input a integer:\n");
	scanf("%d",&n);
	for(int i=n;i<=n+10;i++)
	{
		printf("%d\n",i);
	}
	return 0;
}