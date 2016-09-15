#include <stdio.h>
#include <stdlib.h>
#include <windows.h>

int main(){
    SystemParametersInfo(SPI_SETMOUSESPEED, 0, (void*)20, 0);
    return 0;
}
