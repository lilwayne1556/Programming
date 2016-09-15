#include <stdio.h>

void main(){
    int num;
    printf("number to reverse? ");
    scanf("%d", &num);
    num = rev(num);
    printf("Reversed number: %d\n", num);
}

int rev(int a){
  	int p = 0;
  	while (a!=0){
		  p = p * 10;
		  p = p + a%10;
		  a = a/10;
	  }
	  return p;
}