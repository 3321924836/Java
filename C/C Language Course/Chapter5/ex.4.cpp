#include<stdio.h>
int main()
{
	double cm,inch;
	int feet;
	printf("Enter a height in centimeters (<=0 to quit): ");
	while(~scanf("%lf",&cm))
	{
		if(cm<=0)
		{
			printf("bye\n");
			break;
		}
		double cm1=cm;
		feet=0;
		while(cm>=30.48)
		{
			cm-=30.48;
			feet++;
		}
		inch=cm/2.54;
		printf("%.1f cm = %d feet, %.1f inches\n",cm1,feet,inch);
		printf("Enter a height in centimeters (<=0 to quit): ");
	}
	return 0;
}
