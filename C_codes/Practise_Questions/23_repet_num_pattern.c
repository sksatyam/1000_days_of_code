// 23. Write a program to print the following pattern:
//  1
//  22
//  333
//  4444

#include<stdio.h>
int main(){
    int userInp=0;
    printf("Enter the number maximum column  in a row: ");
    scanf("%d",&userInp);
    for (int i=1;i<=userInp;i++){
        for (int j=1;j<=i;j++){
                printf("%d",i);            
        }
    printf("\n");
    }
    return 0;
}