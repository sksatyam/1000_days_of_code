// 14. Write a program to find reverse of a number.

#include<stdio.h>
int main(){
    int userInp, unit_dig = 0,copy_userInp,rev_unerInp=0;
    printf("Enter a number: ");
    scanf("%d",&userInp); 
    while (userInp>0)
    {
        
        unit_dig = userInp%10;
        rev_unerInp =(rev_unerInp*10)+unit_dig;
        userInp = userInp/10;
        
        
    }
    printf("Reverse of your give number is %d",rev_unerInp);
}