#include<stdio.h>
int main()
{
	double pint,cup,ounce,table,teas;
	printf("Plz input the cups:\n");
	scanf("%lf",&cup);
	pint=cup/2;
	ounce=cup*8;
	table=ounce*2;
	teas=table*3;
	printf("pint is %.2lf\ncup is %.2lf\nounce is %.2lf\ntablespoon is %.2lf\nteaspoon is %.2lf\n",pint,cup,ounce,table,teas);
	return 0;
}