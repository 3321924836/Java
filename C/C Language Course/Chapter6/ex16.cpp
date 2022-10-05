#include<stdio.h>

int main(void)
{
	float Da=100,De=100;
	int i,j;
	
	for(i=1;;i++)
	{
		Da=Da+100*0.1;
			De=De+De*0.05;
			if(De>Da)break;
	}
	printf("It will take %d years.\nDeirdre:%f   Daphne%f",i,De,Da);
	
	return 0;
} 