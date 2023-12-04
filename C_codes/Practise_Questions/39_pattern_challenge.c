/*
Write a program to print the following pattern:
        1
      1 2 1
    1 2 3 2 1
  1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
*/
#include<stdio.h>
int main(){
    int row = 5,cpRow;
    cpRow =row;
    for (int i=1;i<=row;i++){
        for (int j=1;j<=i;j++){
            if (j == 1)
            {
                for (int k=1;k<=(row-i);k++){
                    printf("  ");
                } 
            }
            printf("%d ",j);
        }
        for (int l=0;l<(i-1);l++){
            printf("%d ",(i-1)-l);
            }
        printf("\n");
    }
    return 0;
}