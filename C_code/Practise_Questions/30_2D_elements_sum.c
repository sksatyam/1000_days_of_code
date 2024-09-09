// 30. Write a program to find sum of all the elements in a 2D array.
int main(){
    int row,col,sum =0;
    printf("Enter the Number of elements in the First dimention of no. of rows and than no. of rows in Second dimention or no. of coloumns: ");
    scanf("%d %d",&row,&col);
    int arr[row][col];
    printf("Enter your array in matrix for press enter after each row\n");
    for (int i=0;i<row;i++){
        for (int j=0;j<col;j++){
            scanf("%d",&arr[i][j]);
            sum+=arr[i][j];
        }
    }
    printf("The sum of the elements of 2D array is: %d",sum);

    return 0;
}