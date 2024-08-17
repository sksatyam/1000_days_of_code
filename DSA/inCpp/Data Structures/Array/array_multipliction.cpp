#include<iostream>
using namespace std;

int main() {
    int row, col;
    cout << "Enter the number of Rows and Columns of the first array: ";
    cin >> row >> col;

    int arr[row][col];
    cout << "Enter the Elements for the first Array: " << endl;
    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col; j++) {
            cin >> arr[i][j];
        }
    }

    int row2, col2;
    cout << "Enter the number of Rows and Columns of the Second array: ";
    cin >> row2 >> col2;

    if(col != row2) {
        cout << "Multiplication Not Possible!" << endl;
        return 0;
    }

    int arr2[row2][col2];
    cout << "Enter the Elements for Second Array: " << endl;
    for(int i = 0; i < row2; i++) {
        for(int j = 0; j < col2; j++) {
            cin >> arr2[i][j];
        }
    }

    int arr_ans[row][col2]; // Resultant matrix dimensions: (row x col2)
    // Matrix Multiplication Logic
    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col2; j++) {
            int temp = 0;
            for(int k = 0; k < col; k++) {
                temp += arr[i][k] * arr2[k][j];
            }
            arr_ans[i][j] = temp;
        }
    }

    // Output the Resultant Matrix
    cout << "Resultant Matrix after Multiplication:" << endl;
    for(int i = 0; i < row; i++) {
        for(int j = 0; j < col2; j++) {
            cout << arr_ans[i][j] << " ";
        }
        cout << endl;
    }

    return 0;
}
