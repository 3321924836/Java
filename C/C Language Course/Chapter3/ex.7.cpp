#include<stdio.h>
int main()
{
	double inch,cm;
	printf("Plz input the inches:\n");
	scanf("%lf",&inch);
	cm=inch*2.54;
	printf("The cm is %.2lf",cm);
	return 0;
}