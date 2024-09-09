// 12. Write a program to find the factorial of a number.
#include <stdio.h>
int main()
{
    int userInp, Result = 1;
    printf("Enter a number to see its Factorial: ");
    scanf("%d", &userInp);
    for (int i = 1; i <= userInp; i++)
    {
        Result *= i;
    }
    printf("%d", Result);
}