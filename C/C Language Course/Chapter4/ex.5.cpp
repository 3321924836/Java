#include<stdio.h>
int main()
{
	float speed,size,time;
	printf("Please input the download speed in Mbs:");
	scanf("%f",&speed);
	printf("Please input the size of the file in MB:");
	scanf("%f",&size);
	time=size*8/speed;
	printf("At %.2f megabits per second, a file of %.2f megabits\ndownload in %.2f seconds.\n",speed,size,time);
	return 0;
}