// Write a Program to multiply to Two arrays
#include<iostream>
using namespace std;
int main(){
    int row,col;
    cout << "Enter the no. of Rows and Columns of the first array: ";
    cin>> row>>col;
    int arr[row][col];
    cout<<"Enter the Elements for first Array: "<<endl;
    for(int i = 0;i<row;i++){
        for(int j = 0;j<col;j++){
            cin>>arr[i][j];
        }
    }

    int row2,col2;
    cout << "Enter the no. of Rows and Columns of the Second array: ";
    cin>> row2>>col2;
    int arr2[row2][col2];
    cout<<"Enter the Elements for Second Array: "<< endl;
    for(int i = 0;i<row2;i++){
        for(int j = 0;j<col2;j++){
            cin>>arr2[i][j];
        }
    }

    // multiplication from now on
1 2 3
4 5 6

1 2
3 4
5 6




    int arr_ans[col][row2];
    if(row ==col2){
        // Logic Here
        for(int i = 0; i<col;i++){
            for (int j = 0;j<row2;j++){
                int temp=0;
                for (int k =0;k<col;k++){
                    temp+=arr[j][col]*arr2[col][j];
                }
                arr_ans[i][j] = temp;
                cout << arr_ans[i][j]<<" ";
            }
            cout << endl;
        }


    }
    else{
        cout << "Multiplication Not Possible!";
    }


    return 0;
}