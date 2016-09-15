#include <stdio.h>

int main(){
	int year;
	printf("Year to check if it's a leap year or not: ");
	scanf("%d",&year);
	if(year%4==0){printf("%d is a leap year\n",year);}
	else {printf("%d is not a leap year\n",year);}
	return 0;
}
