#include<stdio.h>
int var1 = 12;

int main(){
    printf("Enter a nuber that you want you want to store in a local variable: \n");
    printf("The value of that global variable before scanf %d\n",var1);
    scanf("%d",&var1);
    // printf("The value of var1 after scanf %d\n",var1);
    return 0;
}

