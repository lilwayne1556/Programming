#include <stdio.h>

void main(){
	int b, n, sum, *arr;
	printf("Number of numbers to add: ");
	scanf("%d", &n);
	arr = malloc(n * sizeof(float));
	for (int i = 0; i < n; ++i) {
		printf("Number %d: ", i+1);
		scanf("%d", &b);
		arr[i] = b;
	}
	
	for (int c = 0; c < n; ++c){
		sum = sum + arr[c];
	}

	printf("Sum of numbers: %d\n", sum);
}