// Write a program in which user will first enter a matrix and than our program shuld return the values of the matrix at the spiral positions od the matrix
#include<stdio.h> // we are going to use scanf and printf so, I am  including it.
void inpu(int *row,int *col,int *arr);
int main(){
    int rows,col;
    printf("Enter the order of Matrix m X n : ");
    scanf("%d %d",&rows,&col);
    int arr[rows][col];
    inpu(rows,col,arr);
    return 0;
}
void inpu(int *row,int *col,int *ar){
    for (int i=0;i<row;i++){
        for (int j=0;j<col;j++){
            scanf("%d",&*ar);
        }        
    }

}