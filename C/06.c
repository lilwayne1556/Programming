#include <stdio.h>

void main(){
	int a;

	printf("Number? ");
	scanf("%d", &a);

	if (a==((a/2)*2)){
		printf("Your number is Even\n");
	} else {
		printf("Your number is Odd\n");
	}
}