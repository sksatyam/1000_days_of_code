// 29. Write a program to find the largest element in an array.
#include<stdio.h>
int main(){
    int arlen,largest_element = 0;
    printf("Enter the length of the array that you want enter: ");
    scanf("%d",&arlen);
    int arr[arlen];
    printf("Enter elements of array seperate by whitespace: ");
    for (int i=0;i<arlen;i++){
        scanf("%d",&arr[i]);
    }
    for (int j=0;j<arlen;j++){
        if (arr[j]<largest_element){
            largest_element = arr[j];
            }
    }
    for (int k=0;k<arlen;k++){
        if (arr[k]>largest_element){
            largest_element = arr[k];
            }
    }
    printf("The largest element in the array is: %d",largest_element);
    
    return 0;

}