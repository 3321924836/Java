#include<stdio.h>

int main(void)
{
	float money=1000000;
	int i;
	
	for(i=0;;i++)
	{
		money*=1+0.08;
		if(money>=100000)
		money-=100000;
		else 
		break;
	}
	printf("It will take %d years.",i+1);
	
	return 0;
}