#include<stdio.h>
int main()
{
	int w,d;
	printf("Please input the days:\n");
	while(~scanf("%d",&d))
	{
		if(d<=0)break;
		w=0;
		int day=d;
		while(d>=7)
		{
			d-=7;
			w++;
		}
		printf("%d days are %d weeks, %d days.\n",day,w,d);
		printf("Please input the days:\n");
	}
	return 0;
} 