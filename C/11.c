#include <stdio.h>

int x,y;

int swap(int a, int b){
	x = b;
	y = a;
	return 0;
}

int main(){
	printf("What two number do you want to swap? ");
	scanf("%d %d",&x,&y);
	swap(x,y);
	printf("Your numbers: %d %d\n",x,y);
	return 0;
}

