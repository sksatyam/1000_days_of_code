// 15. Write a program to find sum of digits of a number.
#include<stdio.h>
int main(){
    int userInp,result = 0,temp ;
    printf("Enter a Number: ");
    scanf("%d",&userInp);
    while (userInp>0)
    {
        temp = userInp%10;
        result += temp;
        userInp /= 10;
    }
    printf("%d", result);
    return 0;
}
