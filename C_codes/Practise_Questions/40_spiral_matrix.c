// Write a program in which user will first enter a matrix and than our program shuld return the values of the matrix at the spiral positions od the matrix
#include <stdio.h> // we are going to use scanf and printf so, I am  including it.
int spriralprintrow(int arr[][4], int rowno, int lowlim, int uperlim)
{ // This function is going to print any row you wish
    // This function will print alements of a specific row within a range this include lower limit but excludes upperlimit
    int count = 0;
    for (int i = lowlim; i < uperlim; i++)
    {
        printf("%d  ", arr[rowno][i]);
        count++;
    }
    return count;
}

int spriralprintrowrev(int arr[][4], int rowno, int lowlim, int uperlim)
{ // This function is going to print any row you wish
    // This function will print alements of a specific row within a range this include lower limit but excludes upperlimit
    int count = 0;
    for (int i = (uperlim - 1); i >= lowlim; i--)
    {
        printf("%d  ", arr[rowno][i]);
        count++;
    }
    return count;
}
int spriralprintcol(int arr[][4], int colno, int lowlim, int uperlim)
{ // This function is going to print any row you wish
    // This function will print alements of a specific col within a range this include lower limit but excludes upperlimit
    int count = 0;
    for (int i = lowlim; i < uperlim; i++)
    {
        printf("%d  ", arr[i][colno]);
        count++;
    }
    return count;
}

int spriralprintcolrev(int arr[][4], int colno, int lowlim, int uperlim)
{ // This function is going to print any row you wish
    // This function will print alements of a specific col within a range this include lower limit but excludes upperlimit
    int count = 0;
    for (int i = (uperlim - 1); i >= lowlim; i--)
    {
        printf("%d  ", arr[i][colno]);
        count++;
    }
    return count;
}
int main()
{
    int cnt = 0,func_runs = 1, minrowno = 0, mincolno = 0 , maxrowno = 3, maxcolno = 3, arr[4][4] = {{1, 2, 3, 11}, {4, 5, 6, 12}, {7, 8, 9, 13}, {15, 16, 17, 18}};
    int lowlimrow = 0, upperlimrow = 5, lowlimcol = 0, upperlimcol = 5, rowcount = 0, colcount = 0, roworcol = 0, revornotcol = 0, revornotrow = 0;
    while (cnt < 16)
    {
        if ((roworcol % 2) == 0)
        {
            if ((revornotrow % 2) == 0)
            {
                cnt += spriralprintrow(arr,minrowno,lowlimrow,upperlimrow);
                upperlimrow--;
                lowlimcol++;
                revornotrow++;
                func_runs ++;
                minrowno ++;
            }
            else
            {
                cnt += spriralprintrowrev(arr,maxrowno,lowlimrow,upperlimrow);
                lowlimrow++;
                revornotrow++;
                func_runs++;
                maxrowno --;
            }
            
        }
        else
        {
            if ((revornotcol % 2) == 0)
            {
                cnt += spriralprintcol(arr,mincolno,lowlimcol,upperlimcol);
                upperlimcol--;
                revornotcol++;
                func_runs++;
                mincolno ++;
            }
            else
            {
                cnt += spriralprintcolrev(arr,maxcolno,lowlimcol,upperlimcol);
                lowlimcol++;
                revornotcol++;
                func_runs++;
                maxcolno --;
            }
        }
    }
    return 0;
}
// at first I created two function that prints elements of any sprecific row in specific range and column to. now I am going ot create that same function but this will print that elements in reverse orde.