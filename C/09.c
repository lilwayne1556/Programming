#include <stdio.h>

int main(){
	int a, b = 0;
	printf("Check if number is a perfect number: ");
	scanf("%d", &a);
	for (int i = 1; i < a; ++i) {
		if ((a/i)*i==a){
			b = b + i;
		}
	}	
	if(b==a){
		if((b+a)/2==a){
			printf("%d is a perfect number\n", a);
		}
	}
	return 0;
}