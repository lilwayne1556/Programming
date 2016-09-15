#include <stdio.h>

void main(){
  int a, b;
  float c;
  printf("What is the length? ");
  scanf("%d", &a);
  printf("What is the width? ");
  scanf("%d", &b);
  c = .5*a*b;
  printf("The area of your triangle is: %f\n", c);
}