// 35. Write the code to convert foot to cm.
#include<stdio.h>
int main(){
    int foot;
    printf("Enter a number you want to convert: ");
    scanf("%d",&foot);
    printf("%d foot into cm is %f",foot,foot*30.48);
    return 0;
}