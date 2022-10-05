#include<stdio.h>
void trans(double f)
{
	const float c1=5.0,c2=9.0,c3=32.0;
	double c=c1/c2*(f-c3);
	double k=c+273.16;
	printf("C temp: %.2f\nK temp: %.2f\n",c,k);
}
int main()
{
	double f;
	printf("Please input the F temp:");
	scanf("%f",&f);
	trans(f);
	return 0;
}