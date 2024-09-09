#include<stdio.h>
int main(){
    int userInp, unit_dig = 0,copy_userInp,rev_unerInp=0;
    printf("Enter a number: ");
    scanf("%d",&userInp);
    copy_userInp = userInp; 
    while (userInp>0)
    {
        
        unit_dig = userInp%10;
        rev_unerInp =(rev_unerInp*10)+unit_dig;
        userInp = userInp/10;
        
        
    }
    if (rev_unerInp == copy_userInp){
        printf("Your Number is a Palendrome");
        }
    else{
        printf("Not a Palendrome");
        }
    return 0;
}