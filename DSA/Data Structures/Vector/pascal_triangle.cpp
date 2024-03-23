// write a program to print pascal triangle upto nth term

#include<iostream>
#include<vector>
using namespace std;
int main(){
    int n;
    cout<<"Enter the nth term! ";
    cin >> n;
    vector<vector<int>> vec(n);
    for(int i = 0;i<n;i++){
        vec[i].resize(i+1);
        for(int j = 0;j<=i;j++){
            if(j==0||j==i){
                vec[i][j] = 1;
            }
            else{
                vec[i][j] = vec[i-1][j]+vec[i-1][j-1];
            }
        }
    }
    // printing the result
    for(int i =0;i<n;i++){
        for(int j = 0;j<vec[i].size();j++){
            cout << vec[i][j]<<" ";
        }
        cout << endl;
    }

    return 0;
}

