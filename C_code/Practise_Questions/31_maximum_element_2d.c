// 31. Write a program to find maximum element from a 2D array.

#include<stdio.h>
int main(){
    int row,col,largest_element = 0;
    printf("Enter the Number of elements in the First dimention of no. of rows and than no. of rows in Second dimention or no. of coloumns: ");
    scanf("%d %d",&row,&col);
    int arr[row][col];
    printf("Enter your array in matrix for press enter after each row\n");
    for (int i=0;i<row;i++){
        for (int j=0;j<col;j++){
            scanf("%d",&arr[i][j]);
        }
    }
    for (int k=0;k<row;k++){
        for (int l=0;l<col;l++){
            if (arr[k][l]<largest_element){
                largest_element = arr[k][l];
            }   
        }
        
    }

    for (int k=0;k<row;k++){
        for (int l=0;l<col;l++){
            if (arr[k][l]>largest_element){
                largest_element = arr[k][l];
            }   
        }
        
    }
    printf("The largest element in the array is: %d",largest_element);
    
    return 0;

}