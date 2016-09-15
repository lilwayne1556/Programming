#include <stdio.h>
#include <time.h>

extern int b;

void switchTest(){
    clock_t begin, end;
    double time_spent;
    begin = clock();
    switch(b){
    	case 1: printf("Yay\n"); break;
    	case 2: printf("Yay\n"); break;
    	case 3: printf("Yay\n"); break;
    	case 4: printf("Yay\n"); break;
    	case 5: printf("Yay\n"); break;
    	case 6: printf("Yay\n"); break;
    	case 7: printf("Yay\n"); break;
    	case 8: printf("Yay\n"); break;
    	case 9: printf("Yay\n"); break;
    	case 10: printf("Yay\n"); break;
    	case 11: printf("Yay\n"); break;
    	case 12: printf("Yay\n"); break;
    	case 13: printf("Yay\n"); break;
    	case 14: printf("Yay\n"); break;
    	case 15: printf("Yay\n"); break;
    	case 16: printf("Yay\n"); break;
    	case 17: printf("Yay\n"); break;
    	case 18: printf("Yay\n"); break;
    	case 19: printf("Yay\n"); break;
    	case 20: printf("Yay\n"); break;
    }
    end = clock();
    time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
    printf("Execution time for switch statements: %f\n", time_spent);
}
