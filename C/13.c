#include <stdio.h>

//pointer example

const int MAX = 3; /*Good practice if number can be changed, hardcoding is meh*/

int main(){
    //Storing pointer

    int var1;
    printf("Address of var1: %x\n", &var1);

    int value = 20;
    int *pointer; /* Use * to set pointer, Good practice to use NULL if pointer won't be assigned to anything*/

    pointer = &value; /* Stores address into pointer */

    printf("Value of variable %d\n", value);
    printf("Address of variable %x\n", &value);
    printf("Value of pointer %d\n\n", *pointer);

    //Increasing pointer memory location

    pointer++; /* Increases the pointer address by 4 bytes, moves to next memory location */
    printf("Address of pointer after increasement %x\n", pointer);
    printf("Value of pointer %d\n\n", *pointer);

    int vars[] = {10, 20, 30};
    int *p, i;

    p = vars; /*Array addesses in pointer*/

    for( i = 0; i < MAX; i++){
        printf("Address of vasr[%d] = %x\n", i, p);
        printf("Value of vars[%d] = %d\n", i, *p);
        p++; /*Increases pointer by one memory location*/
    }
    //Decreasing pointer memory location

    p = &vars[MAX - 1]; /* Pointer of last value*/

    for( i = MAX; i > 0; i--){
        printf("Address of vars[%d] = %x\n", i, p);
        printf("Value of vars[%d] = %d\n", i, *p);
        p--; /*Decreases pointer by one memory location*/
    }
}
