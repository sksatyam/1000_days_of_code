// 22. Write a program to print the following pattern:
//  1
//  12
//  123
//  1234

#include<stdio.h>
int main(){
    int userInp;
    printf("Enter the number maximum column  in a row: ");
    scanf("%d",&userInp);
    for (int i=1;i<=userInp;i++){
        for (int j=1;j<=i;j++){
                printf("%d",j);            
        }
    printf("\n");
    }

    return 0;
}