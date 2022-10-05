#include<stdio.h>
#define trans 60
int main()
{
	int h,m;
	printf("Please input the time in minutes:\n");
	while(~scanf("%d",&m))
	{
		if(m<=0)break;
		h=0;
		while(m>=60)
		{
			m-=trans;
			h++;
		}
		if(h<10)printf("0");
		printf("%d:",h);
		if(m<10)printf("0");
		printf("%d\n",m);
		printf("Please input the time in minutes:\n");
	}
	return 0;
} 