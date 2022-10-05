#include<stdio.h>
#include<string.h>

int main(void)
{
	char line[255];
	int i;

		scanf("%s",line);
	
	for(i=strlen(line)-1;i>=0;i--)
	printf("%c",line[i]);
	
	return 0;
}