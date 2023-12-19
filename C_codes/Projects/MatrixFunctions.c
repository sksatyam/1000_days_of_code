// In this file i am going to create some functions that will perform some basic operations on a matrix
#include<stdio.h>
void arrayRow(int arr[][k], int a, int c){
    for (int i=0;i<4;i++){
            printf(" %d", arr[a][i]);
        }
    
    }
int main(){
    int array1[][4] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
    int l = 4;
    arrayRow(array1[][l],3,4);
    return 0;
}
