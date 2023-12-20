// In this file i am going to create some functions that will perform some basic operations on a matrix
#include<stdio.h>
void TwodArrayInput(int *arr,int Row, int Col){
    int temp;
    for (int i = 0; i < Row*Col; i++)
    {  

        scanf("%d",&temp);
        arr +i = temp;
    }
    
    
    }
int main(){
    int Row, Col;
    printf("Enter the number of Rows and column of the matrix: ");
    scanf("%d %d",&Row,&Col);
    int array1[Row][Col];
    TwodArrayInput(array1,Row,Col);
    printf("%d %d %d",array1[0][0],array1[1][1],array1[2][2]);
    return 0;
}
