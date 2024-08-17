// Write a program to display the transpose of a matrix
#include<iostream>
using namespace std;
int main(){
    int row,col;
    cout << "Enter the number of rows and columns seperate by the space: ";
    cin >> row >> col;
    int arr[row][col];

    cout << "Enter the elements: "<< endl;
    for (int i = 0;i<row;i++){
        for (int j =0;j<col;j++){
            cin >> arr[i][j];
        }
    }
    for (int i =0; i<col;i++){
        for(int j=0;j<row;j++){
            cout << arr[j][i]<<" "; 
        }
        cout << endl;
    }
    return 0;
}

// This program didn't added value in my learning because I solve it by bootstrap method