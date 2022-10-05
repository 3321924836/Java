#include<stdio.h>

int main(void)
{
	int num,i;
	float sum1=0,sum2=0;
	scanf("%d",&num); 
	
	if(num<=0)
	printf("Please imput a number that more than 0.\n");
	
	for(i=1;i<=num;i++)
	{
		sum1=sum1+1.0/i;
		if(i%2==1)
		sum2=sum2+1.0/i;
		else
		sum2=sum2-1.0/i;
	}
	
	printf("The former one appears to be %f\n",sum1);
	printf("The later one appears to be %f\n",sum2);
	
	return 0;
}