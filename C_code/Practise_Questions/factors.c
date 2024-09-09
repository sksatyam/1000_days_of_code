// 11. Write a program to find the factors of a number.
#include<stdio.h>
int main(){
    int userInp;
    printf("Enter a number: ");
    scanf("%d",&userInp);
    for (int i=1;i<=userInp;i++){
        if (userInp%i == 0)
        {
            printf("%d\n",i);
        }
        
        
    }

    return 0;
}