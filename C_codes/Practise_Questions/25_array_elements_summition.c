// 25. Write a program to find the summation of all the elements in an array. 
#include<stdio.h>
int main(){
    int userInp,sum=0;
    printf("How many value are you going to enter in the array: ");
    scanf("%d",&userInp);
    int arr[userInp];
    for (int i=0;i<userInp;i++){
        printf("Enter %dth value of the array\n",i+1);
        scanf("%d",&arr[i]);
    }
    for (int j=0;j<userInp;j++){
        sum += arr[j];
    }
    printf("The sum of your array is: %d",sum);
    return 0;
}