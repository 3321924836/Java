#include<stdio.h>
int main()
{
    char a[26];
    for(int i='a';i<='z';i++)a[i-'a']=i;
    for(int i=0;i<26;i++)printf("%c\n",a[i]);
    return 0;
}