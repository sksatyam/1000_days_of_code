#include<stdio.h>
int main(){
    int userInp, first_term = 0, second_term = 1, next_term = 0, sum =0;
    printf("Enter the nth term that you want to know the sum of:  ");
    scanf("%d",&userInp);
    if (userInp<1){
            printf("Enter Valid Input!");
        }
    else if(userInp ==1) {
            printf("Sum of Fibonachi series upto your %dth term is: 1.\n ");
        }
        else{
            for (int i=1;i<=userInp;i++){
                printf("%d ", first_term);
                sum+=first_term;
                next_term = first_term+second_term;
                first_term = second_term;
                second_term = next_term;
            }

        }
    printf("\nsum of your fib series upto %dth term is: %d",userInp,sum);

    return 0;
}