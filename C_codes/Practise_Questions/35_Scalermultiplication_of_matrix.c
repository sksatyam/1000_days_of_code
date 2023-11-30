// write a program to find a scaler multiplication of a matrix
#include<stdio.h>
int main(){
    int row,col,scaler;
    printf("Enter the Number of elements in the First dimention of no. of rows and than no. of rows in Second dimention or no. of coloumns: ");
    scanf("%d %d",&row,&col);
    int arr[row][col];
    printf("Enter your array in matrix for press enter after each row\n");
    for (int i=0;i<row;i++){
        for (int j=0;j<col;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    printf("Enter the Scaler that you want to multiply with these matrix: ");
    scanf("%d",&scaler);
    for (int k=0;k<row;k++){
        for (int l=0;l<col;l++){
            printf("%d ",(arr[k][l]*scaler));
        }
        printf("\n");
    }
}