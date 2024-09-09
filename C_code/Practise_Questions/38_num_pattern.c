/*
Write a program to print the following:
0
1 2
3 4 5
6 7 8 9
*/
#include<stdio.h>
int main(){
    int row = 4,num = 0;
    for (int i=1;i<=row;i++){
        for (int j=0;j<i;j++){
            printf("%d ",num);
            num ++;
        }
        printf("\n");
    }
    return 0;
}