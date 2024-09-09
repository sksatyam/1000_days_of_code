// 16. Write a program to find the number of digits of a number. 
#include<stdio.h>
int main(){
    int userInp,counter =0;
    printf("Enter a number: ");
    scanf("%d",&userInp);
    while (userInp>0)
    {
        userInp /= 10;
        counter +=1;

    }
    printf("No. of digits in your input is: %d",counter);
    

    return 0;
}