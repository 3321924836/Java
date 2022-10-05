#include<stdio.h>

int main(void)
{
	int a[8];int i;
	
	a[0]=2;
	for(i=1;i<8;i++)
	a[i]=a[i-1]*2;
	
	while(i>0)
	{
		printf("%d\n",a[8-i]);
		i--;
	}
	
	return 0;
}