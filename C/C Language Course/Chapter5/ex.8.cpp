#include<stdio.h>
int main()
{
	int fir,sec;
	printf("This program computes moduli.\nEnter an integer to serve as the second operand: ");
	scanf("%d",&sec);
	printf("Now enter the first operand: ");
	while(~scanf("%d",&fir))
	{
		if(fir<=0)
		{
			printf("Done\n");
			break;
		}
		printf("%d %% %d is %d\n",fir,sec,fir%sec);
		printf("Enter next number for first operand (<=0 to quit): ");
	}
	return 0;
}