// 21. Write a program to print this pattern:
//  *
//  **
//  ***
//  ****
#include<stdio.h>
int main(){
    int userInp;
    printf("Enter the number maximum stars in a row: ");
    scanf("%d",&userInp);
    for (int i=1;i<=userInp;i++){
        for (int j=1;j<=i;j++){
                printf("*");            
        }
    printf("\n");
    }
    return 0;
}
