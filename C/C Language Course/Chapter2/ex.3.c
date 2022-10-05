#include<stdio.h>
int main()
{
	int year,day;
	printf("Plz input your age in year:\n");
	scanf("%d",&year);
	day=year*365;
	printf("Your age in year is %d, and your age in days is %d.\n",year,day);
	return 0;
}