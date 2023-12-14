// Write a program in c to reas n number of values in an array and display them in reverse order
#include<stdio.h>
int main(){
    int len;
    printf("Enter the length of the array: ");
    scanf("%d",&len);
    int arr[len];
    for (int j=0;j<len;j++){
        scanf("%d",&arr[j]);
    }
    for (int i=(len-1);i>=0;i--){
        printf(" %d ",arr[i]);
    }

}