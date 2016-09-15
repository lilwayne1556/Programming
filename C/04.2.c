#include <stdio.h>
#include <time.h>

extern int a;

void ifTest(){
    clock_t begin, end;
    double time_spent;
    begin = clock();
        if(a==1){printf("Yay\n");}
        else if(a==2){printf("Yay\n");}
        else if(a==3){printf("Yay\n");}
        else if(a==4){printf("Yay\n");}
        else if(a==5){printf("Yay\n");}
        else if(a==6){printf("Yay\n");}
        else if(a==7){printf("Yay\n");}
        else if(a==8){printf("Yay\n");}
        else if(a==9){printf("Yay\n");}
        else if(a==10){printf("Yay\n");}
        else if(a==11){printf("Yay\n");}
        else if(a==12){printf("Yay\n");}
        else if(a==13){printf("Yay\n");}
        else if(a==14){printf("Yay\n");}
        else if(a==15){printf("Yay\n");}
        else if(a==16){printf("Yay\n");}
        else if(a==17){printf("Yay\n");}
        else if(a==18){printf("Yay\n");}
        else if(a==19){printf("Yay\n");}
        else if(a==20){printf("Yay\n");}
    end = clock();
    time_spent = (double)(end - begin) / CLOCKS_PER_SEC;
    printf("Execution time for if statements: %f\n", time_spent);
}
