// Write a program to rotate an array 90 degree without using extra space

#include<iostream>
#include<vector>
#include<algorithm>
using namespace std;
void rotate90(vector<vector<int>>&v){
    int n = v.size();
    for (int i = 0;i<v.size();i++){
        for (int j = 0;j<i;j++){
            swap(v[i][j],v[j][i]);
        }
    }
    for(int i = 0;i<n;i++){
        reverse(v[i].begin(),v[i].end());
    }
}

int main(){
    int size;
    cout <<"Enter the sizev of the matrix: ";
    cin >> size;
    vector<vector<int>> vec(size,vector<int>(size));
    for(int i =0;i<size;i++){
        for (int j = 0;j<size;j++){
            cin>> vec[i][j];
        }
    }
    rotate90(vec);
    for(int i = 0;i<size;i++){
        for (int j = 0;j<size;j++){
            cout << vec[i][j]<< " ";
        }
        cout << endl;
    }
    return 0;
}




// #include<iostream>
// #include<vector>
// using namespace std;

// void rotate90(vector<vector<int>>& v) {
//     int n = v.size();
//     // Transpose the matrix
//     for (int i = 0; i < n; i++) {
//         for (int j = i + 1; j < n; j++) {
//             swap(v[i][j], v[j][i]);
//         }
//     }
//     // Reverse each row
//     for (int i = 0; i < n; i++) {
//         reverse(v[i].begin(), v[i].end());
//     }
// }

// int main() {
//     int size;
//     cout << "Enter the size of the matrix: ";
//     cin >> size;

//     vector<vector<int>> vec(size, vector<int>(size));

//     cout << "Enter the elements of the matrix:" << endl;
//     for (int i = 0; i < size; i++) {
//         for (int j = 0; j < size; j++) {
//             cin >> vec[i][j];
//         }
//     }

//     rotate90(vec);

//     cout << "Matrix after rotating 90 degrees:" << endl;
//     for (int i = 0; i < size; i++) {
//         for (int j = 0; j < size; j++) {
//             cout << vec[i][j] << " ";
//         }
//         cout << endl;
//     }

//     return 0;
// }
