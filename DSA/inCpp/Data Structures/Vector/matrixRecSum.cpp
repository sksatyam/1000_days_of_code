// Given a matrix 'a' of dimention m x n and 2 coordinates (l1,r1) and (l2,r2). return the sum of the rectangle from (l1,r1) to (l2,r2).
#include<iostream>
#include <vector>
using namespace std;
void RecSum(vector<vector<int>>&v,int &l1,int &r1,int &l2,int &r2){
     int loop_row_start,loop_col_start,loop_row_end,loop_col_end,sum = 0;
     if (l1<l2){
        loop_row_start = l1;
        loop_row_end = l2;
     }else{
        loop_row_start = l2;
        loop_row_end = l1;
     }
     if (r1<r2){
        loop_col_start = r1;
        loop_col_end = r2;
     }else{
        loop_col_start = r2;
        loop_col_end = r1;
     }
     for(int i  = loop_row_start;i<=loop_row_end;i++){
        for(int j = loop_col_start;j<=loop_col_end;j++){
            sum+=v[i][j];
        }
     }
     cout << "Sum: "<< sum;



}

int main(){
    int m,n,l1,r1,l2,r2;
    cout <<"Enter the dimention of matrix: ";
    cin >> m >> n;
    vector<vector<int>> matrix(m,vector<int>(n));
    cout << "\nEnter the elements: ";
    for (int i =0;i<m;i++){
        for (int j = 0;j<n;j++ ){
            cin>>matrix[i][j];
        }
    }
    cout  << "\nEnter the first coordinates seperated by space: ";
    cin >> l1 >> r1;
    cout  << "\nEnter the second coordinates seperated by space: ";
    cin >> l2 >> r2;
    RecSum(matrix,l1,r1,l2,r2);


    return 0;
}