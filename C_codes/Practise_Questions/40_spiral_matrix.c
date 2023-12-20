// Write a program in which user will first enter a matrix and than our program shuld return the values of the matrix at the spiral positions od the matrix
#include<stdio.h> // we are going to use scanf and printf so, I am  including it.
void spriralprintrow(int arr[][4], int rowno, int lowlim,int uperlim){//This function is going to print any row you wish
    for (int i = lowlim; i < uperlim ; i++)
    {
        printf("%d  ",arr[rowno][i]);
    }
    
}
void spriralprintcol(int arr[][4], int colno,int lowlim,int uperlim){//This function is going to print any row you wish
    for (int i = lowlim; i < uperlim; i++)
    {
        printf("%d  ",arr[i][colno]);
    }
    
}
int main(){
    int arr[4][4] = {{1,2,3,11},{4,5,6,12},{7,8,9,13},{15,16,17,18}};
    spriralprintrow(arr,2,1,3);
    return 0;
}
