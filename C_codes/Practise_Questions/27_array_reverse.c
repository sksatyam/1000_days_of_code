// 27. Write a program to reverse an array. 
#include<stdio.h>
int main(){
    int arlen,idx=0;
    printf("Enter the length of the array: ");
    scanf("%d",&arlen);
    int ar[arlen];
    int ar_rev[arlen];
    printf("Enter %d element seperate by whitespce: ");
    for (int i=0;i<arlen;i++){
        scanf("%d",&ar[i]);
    }
    printf("New array is: ");
    for (int i=(arlen-1);i>=0;i--){
        ar_rev[idx]=ar[i];
        printf("%d",ar_rev[idx]);
    }
    return 0;
}