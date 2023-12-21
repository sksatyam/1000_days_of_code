// Write a program in which user will first enter a matrix and than our program shuld return the values of the matrix at the spiral positions od the matrix
#include<stdio.h> // we are going to use scanf and printf so, I am  including it.
int spriralprintrow(int arr[][4], int rowno, int lowlim,int uperlim){//This function is going to print any row you wish
    // This function will print alements of a specific row within a range this include lower limit but excludes upperlimit
    int count =0;
    for (int i = lowlim; i < uperlim ; i++)
    {
        printf("%d  ",arr[rowno][i]);
        count++;
    }
    return count;
}
int spriralprintcol(int arr[][4], int colno,int lowlim,int uperlim){//This function is going to print any row you wish
    // This function will print alements of a specific col within a range this include lower limit but excludes upperlimit
    int count =0;
    for (int i = lowlim; i < uperlim; i++)
    {
        printf("%d  ",arr[i][colno]);
        count ++;
    }
    return count;
}
int main(){
    int cnt = 1,rowno = 0,colno = 0,arr[4][4] = {{1,2,3,11},{4,5,6,12},{7,8,9,13},{15,16,17,18}};
    int lowlimrow = 0, upperlimrow = 5,lowlimcol = 0,upperlimcol = 5,rowcount = 0,colcount = 0;
    while(cnt <=16){
        if ((cnt%20 )!=0)
        {
            cnt += spriralprintrow(arr);
        }
        
    }
    return 0;
}
