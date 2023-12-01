/*
06. Write a program to calcualte wage of a labor according to the following criterias: 
 Work Hours --------------------- Wage
 First 8 Hours  ----------------  100/hr
 Next 2 Hours   ----------------  150/hr
 Next 2 Hours   ----------------  200/hr
 Above 12 Hours ----------------  300/hr
*/
#include<stdio.h>
int main(void){
    int userInput,wage=0;
    printf("Enter the number of hours you worked: ");
    scanf("%d",&userInput);
    for (int i=1;i<=userInput;i++){
        if (i<9)
        {
            wage += 100;
        }
        else if (i<11)
        {
            wage += 150;
        }
        else if (i<13)
        {
            wage += 200;
        }
        else if (i>12)
        {
            wage+=300;
        }  
    }
    printf("Your wage is: %d",wage);
    return 0;
}