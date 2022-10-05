#include<stdio.h>
void s();
int main()
{
	s();s();s();
	printf("\n");
	s();s();
	printf("\n");
	s();
	printf("\n");
	return 0;
}

void s()
{
	printf("Smile!");
}