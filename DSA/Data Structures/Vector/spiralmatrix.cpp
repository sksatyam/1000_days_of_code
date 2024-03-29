// Write a program to print the matrix in the spiral order
#include<iostream>
#include <vector>
using namespace std;


void spiral(vector<vector<int>>& v){
    int top = 0,bottom = v.size(),left = 0,right = v[0].size(),dec = 0,loop_control = 0,runtime = (v.size())*(v[0].size());
    while(loop_control<runtime){
        if (dec == 0){
            for (int i = left;i<right;i++ ){
                cout << v[top][i]<< " ";
                loop_control ++;
            }
            top ++;
            dec = 1;
            }
        else if(dec ==1){
            for(int i = top;i<bottom;i++){
                cout << v[i][right-1] << " ";
                loop_control ++;
            }
            right --;
            dec =2;
            }
        else if(dec == 2){
            for(int i = right-1;i>= left;i--){
                cout << v[bottom-1][i] << " ";
                loop_control++;
            }
            bottom --;
            dec =3;
        }
        else if (dec ==3){
            for (int i = bottom-1;i>=top;i--){
                cout << v[i][left]<<" ";
                loop_control++;
            }
            left ++;
            dec =0;
        }

    }
    
}
int main(){
    int dimention1,dimension2;
    cout << "Enter the dimentions: ";
    cin >> dimention1>>dimension2;
    vector<vector<int>> matrix(dimention1,vector<int>(dimension2));
    cout << "Enter elements!"<<endl;
    for(int i =0;i<dimention1;i++){
        for(int j = 0;j<dimension2;j++){
            cin >> matrix[i][j];           
        }
    }
    spiral(matrix);
    return 0;
}