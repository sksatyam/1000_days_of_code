// 32. Write a program to find the tranpose of a matrix (2D array).
#include<stdio.h>
int main(){
    int row,col;
    printf("Enter the Number of elements in the First dimention of no. of rows and than no. of rows in Second dimention or no. of coloumns: ");
    scanf("%d %d",&row,&col);
    int arr[row][col],trans_arr[col][row];
    printf("Enter your array in matrix for press enter after each row\n");
    for (int i=0;i<row;i++){
        for (int j=0;j<col;j++){
            scanf("%d",&arr[i][j]);
            trans_arr[j][i] = arr[i][j];
        }
    }
    for (int k=0;k<col;k++){
        for (int l=0;l<row;l++){
            printf("%d ",trans_arr[k][l]);
        }
        printf("\n");
    }
}