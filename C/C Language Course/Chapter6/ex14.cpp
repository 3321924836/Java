#include<stdio.h>

int main(void)
{
	double a[8];double b[8]={0};
	int i;int j;
	
	for(i=0;i<8;i++)
	scanf("%lf",&a[i]);
	
	i=0;
	while(i<8)
	{
		for(j=0;j<=i;j++)
		b[i]=b[i]+a[j];
		i++;
	}
	
	for(i=0;i<8;i++)
		printf("%2.f ",a[i]);
	printf("\n");
	for(i=0;i<8;i++)
		printf("%2.f ",b[i]);

	return 0;
}