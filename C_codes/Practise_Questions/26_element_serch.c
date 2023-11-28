// 26. Write a program to search an element in an array.
#include<stdio.h>
int main(){
    int arlen,elem,indx;
    printf("Enter the length of the array: ");
    scanf("%d",&arlen);
    int ar[arlen];
    printf("Enter %d element seperate by whitespce: ");
    for (int i=0;i<arlen;i++){
        scanf("%d",&ar[i]);
    }
    printf("Enter the element you want to serch: ");
    scanf("%d",&elem);
    for (int i=0;i<arlen;i++){
        if (elem == ar[i]){
            indx = i;
            break;
            }
    }
    printf("Your array is at %dth index",indx);
    return 0;
}