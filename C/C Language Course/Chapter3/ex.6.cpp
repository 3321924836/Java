#include<stdio.h>
int main()
{
	double q,g,m;
	int ten=23;
	printf("Plz input the quart:\n");
	scanf("%lf",&q);
	g=950*q;
	m=g/3.0;
	while(m>=10)
	{
		m/=10;
		ten+=1;
	}
	printf("molecules is %.2fx10^%d",m,ten);
	return 0;
}