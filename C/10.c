#include <stdio.h>
#include <math.h>
#define PI 3.14159265359

int main(){
	int selection;
	double area, radius = 0, length = 0, width = 0;
	SELECTION:printf("Find the area/volume of a shape\n1.Circle\n2.Square\n3.Rectangle\n4.Triangle\n5.Cube\n6.Cylinder\n7.Sphere\n\nSelect a number:");
	scanf("%d",&selection);
	if(selection<1 || selection>7){
		printf("\nPlease select a vaild number\n");
		goto SELECTION;
	}
	switch(selection){
		case 1:
			printf("What is the radius of your circle:");
			scanf("%lf", &radius);
			area = PI * pow(radius, 2);
			break;
		case 2:
			printf("What is the side length:");
			scanf("%lf", &length);
			area = pow(length, 2);
			break;
		case 3:
			printf("What is the width:");
			scanf("%lf", &width);
			printf("what is the length:");
			scanf("%lf", &length);
			area = length * width;
			break;
		case 4:
			printf("What is the width:");
			scanf("%lf", &width);
			printf("What is the length:");
			scanf("%lf", &length);
			area = (length * width)/2;
			break;
		case 5:
			printf("What is the side length:");
			scanf("%lf", &length);
			area = pow(length, 3);
			break;
		case 6:
			printf("what is the radius of your Cylinder:");
			scanf("%lf", &radius);
			printf("What is the height of your Cylinder:");
			scanf("%lf", &length);
			area = (PI * pow(radius, 2)) * length;
			break;
		case 7:
			printf("What is the radius of your Sphere:");
			scanf("%lf", &radius);
			area = (4*PI * pow(radius, 3))/3;
			break;
	}
	printf("Area: %lf\n", area);
	return 0;
}
