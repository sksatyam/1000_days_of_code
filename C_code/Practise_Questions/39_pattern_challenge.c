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
    int row; // Decleared variable for maximum number of rows
    printf("Enter Maximum number of rows: ");
    scanf("%d",&row); // Taking input for maximum number of rows
    for (int i=1;i<=row;i++){ // loop for number of rows
        for (int j=1;j<=i;j++){ // to print halve number triangle
            if (j == 1) // this block of code is for print upper inverted white-spaced right triangle
            {
                for (int k=1;k<=(row-i);k++){
                    printf("  ");
                } 
            }
            printf("%d ",j); 
        }
        for (int l=0;l<(i-1);l++){ // this block of code is actully printing right-trianlge at the right side
            printf("%d ",(i-1)-l);
            }
        printf("\n"); // this is printing new line for the entire triangle
    }
    return 0;
}