#include<stdio.h>

int  main(void)
{
	int num=5;
	int i;
	
	for(i=1;;i++)
	{
		num=(num-1)*2;
		if(num<150)
		printf("%d week:the number of friends is:%d\n",i,num);
		else
		{
			printf("%d week:the number of friends is:%d\n",i,num);
			break;
		}
	}
	
	return 0;
}