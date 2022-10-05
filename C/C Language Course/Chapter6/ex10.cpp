#include<stdio.h>

int main(void)
{
	int a,b,i;
	
	printf("Enter lower and upper integer limits:");
	
	while(scanf("%d%d",&a,&b)==2)
	{
		if (b<=a)
		break;
		int sum=0;
		for(i=a;i<=b;i++)
		sum=sum+i*i;
		printf("The sum of the squares from %d to %d is %d",a*a,b*b,sum);
		printf("\nEnter next set of limits:");
	}
	printf("Done.");
	
	return 0;
} 