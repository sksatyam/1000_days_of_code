#include<stdio.h>
int expo(int val, int pow){
    int temp=1;
    for (int i=1;i<=pow;i++){
        temp = temp*val;
    }
    return temp;
}
int main(){
    int userInp,res,count=0,cp_uip,cp_uip2;
    printf("Enter the number you want to check: ");
    scanf("%d",&userInp);
    cp_uip =userInp;
    cp_uip2 = userInp;
    while (cp_uip>0)
    {
        cp_uip /= 10;
        count +=1;
    }
    for (int i=0;i<count;i++){
        res += expo(userInp%10,count);
        userInp /= 10;
    }
    if (cp_uip2 == res)
    {
        printf("This is armstrong!");

    }
    else
    {
        printf("this is not armstrong");
    }
    
    

    
    
}