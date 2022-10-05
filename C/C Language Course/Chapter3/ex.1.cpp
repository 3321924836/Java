#include<stdio.h>
int main()
{
	int i=2147483647;
	i++;
	float j=3.4e38;
	j*=100;
	float k=1.234E-41;
	k/=10.0f;
	printf("%d %f %.45f",i,j,k);
	return 0;
} 