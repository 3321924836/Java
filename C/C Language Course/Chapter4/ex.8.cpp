#include<stdio.h>
int main()
{
	float mile,gallen,l,km;
	scanf("%f%f",&mile,&gallen);
	printf("%.1f\n",mile/gallen);
	l=gallen*3.785;
	km=mile*1.609;
	printf("%.1f\n",l/km*100);
	return 0;
}